
/**
 *
 * @author Carlos
 */
public class Clases implements Acciones {

    /**
     * Nombre que recibe la clase.
     */
    protected String nombreClase;

    /**
     * Ataque de la clase.
     */
    protected int ataque;

    /**
     * Defensa de la clase.
     */
    protected int defensa;

    /**
     * Vida de la clase.
     */
    protected int vida;

    /**
     * Habilidad pasiva de la clase.
     */
    protected String pasiva;

    /**
     *
     */
    protected datosJugador jugador;

    /**
     * Constructor sin parámetros.
     */
    public Clases() {

        nombreClase = "Uknown";
        ataque = 0;
        defensa = 0;
        vida = 0;
        pasiva = "Unset";

        this.jugador = new datosJugador();

    }

    /**
     * Constructor con parámetros
     *
     * @param nombreClase Valor que se establecerá para nombreClase.
     * @param ataque Valor que se establecerá para ataque.
     * @param defensa Valor que se establecerá para defensa.
     * @param vida Valor que se establecerá para vida.
     * @param pasiva Valor que se establecerá para pasiva.
     * @param nombreJugador Valor que se establecerá para nombre en el atributo
     * datosJugador.
     * @param sexo Valor que se establecerá para sexo en el atributo
     * datosJugador.
     * @param edad Valor que se establecerá para edad en el atributo
     * datosJugador.
     */
    public Clases(String nombreClase, int ataque, int defensa, int vida, String pasiva, String nombreJugador, char sexo, int edad) {

        this.nombreClase = nombreClase;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.pasiva = pasiva;

        this.jugador = new datosJugador(nombreJugador, sexo, edad);
    }

    @Override
    public String getNombre() {
        return nombreClase;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getVida() {
        return vida;
    }

    /**
     * Método que devuelve la defensa de la clase.
     *
     * @return defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Método que devuelve el nombre del jugador.
     *
     * @return nombreJugador
     */
    public String getNombreJugador() {
        return jugador.getNombre();
    }

    /**
     * Método que devuelve la edad del jugador.
     *
     * @return edadJugador
     */
    public int getEdadJugador() {
        return jugador.getEdad();
    }

    /**
     * Método que devuelve el sexo del jugador.
     *
     * @return sexoJugador
     */
    public char getSexoJugador() {
        return jugador.getSexo();
    }

    @Override
    public void setNombre(String nombre) {
        nombreClase = nombre;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Método que permite cambiar la defensa de la clase.
     *
     * @param defensa Valor que se establecerá para defensa.
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * Método que permite cambiar el nombre del jugador.
     *
     * @param nombre Valor que se establecerá para nombre en el atributo
     * datosJugador.
     */
    public void setNombreJugador(String nombre) {
        jugador.setNombre(nombre);
    }

    /**
     * Método que permite cambiar la edad del jugador.
     *
     * @param edad Valor que se establecerá para edad en el atributo
     * datosJugador.
     */
    public void setEdadJugador(int edad) {
        jugador.setEdad(edad);
    }

    /**
     * Método que permite cambiar el sexo del jugador.
     *
     * @param sexo Valor que se establecerá para sexo en el atributo
     * datosJugador.
     */
    public void setSexoJugador(char sexo) {
        jugador.setSexo(sexo);
    }

    /**
     * Método que permite cambiar la pasiva.
     *
     * @param pasiva Valor que se establecerá para pasiva.
     */
    public void cambiarPasiva(String pasiva) {
        this.pasiva = pasiva;
    }

    /**
     * Método que permite usar la acción atacar.
     *
     * @param enemigo referido al enemigo al que se está enfrentando el jugador,
     * permite el contraataque automático del mismo.
     * @param clase referido a la clase del jugador que atacará.
     */
    public void atacar(Enemigo enemigo, Clases clase) {
        System.out.println("¡Atacas a " + enemigo.getNombre() + "!");
        enemigo.recibeDmg(ataque, clase);
    }

    /**
     * Método que permite usar la acción defender.
     *
     * @param enemigo referido al enemigo al que se está enfrentando el jugador,
     * permite el contraataque automático del mismo.
     * @param clase referido a la clase del jugador que se defenderá.
     */
    public void defender(Enemigo enemigo, Clases clase) {

        System.out.println("¡Te defiendes!");

        defensa = defensa + (defensa / 2);
        float reduccionDmg = ((float) defensa / 100) * enemigo.getAtaque();
        vida = vida - (enemigo.getAtaque() - (int) reduccionDmg);
        enemigo.atacar(clase);
    }

    /**
     * Método usado para calcular la reducción de daño según la defensa de la
     * clase.
     *
     * @param Dmg referido a la cantidad de daño que va a recibir el jugador.
     */
    public void recibeDmg(int Dmg) {

        int reduccionDmg = (defensa / 100) * Dmg;
        vida = vida - (Dmg - reduccionDmg);
    }

    /**
     * Método que permite bailar en caso de victoria.
     */
    @Override
    public void baileDeVictoria() {
        System.out.println("Has ganado! Te mereces un baile de la victoria! ^.^");
    }

    /**
     * Método que permite curar al jugador.
     *
     * @param enemigo referido al enemigo al que se está enfrentando el jugador,
     * permite el contraataque automático del mismo.
     * @param clase referido a la clase del jugador que se curará.
     */
    public void curar(Enemigo enemigo, Clases clase) {
        this.vida = vida + 20;
        System.out.println("¡Te curas!");
        enemigo.atacar(clase);
    }

    /**
     * Método que permite realizar una mejora general a la clase.
     */
    @Override
    public void mejora() {
        ataque++;
        defensa++;
        vida++;
    }

    /**
     * Redefinición del método toString para imprimir por pantalla los atributos
     * de la clase.
     *
     * @return Estadísticas de la clase.
     */
    @Override
    public String toString() {
        return "\n ----- ESTADÍSTICAS DE CLASE ----- \nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVida: " + vida + "\nPasiva: " + pasiva + jugador;
    }

    /**
     * Redefinición del método equals para comparar si dos clases son iguales en
     * ataque, defensa y vida.
     *
     * @param obj Objeto que se va a comparar con el objeto que ejecute el
     * método.
     * @return True si son iguales, False si son diferentes.
     */
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Clases) {
            Clases clase = (Clases) obj;
            return this.ataque == clase.ataque && this.defensa == clase.defensa && this.vida == vida;
        } else {
            return false;
        }
    }

}
