
/**
 *
 * @author Carlos
 */
public class Enemigo implements Acciones {

    private String nombre;
    private int ataque;
    private int vida;
    private int nivelDificultad;
    private int vidaRestaurada;

    /**
     * Constructor sin parámetros
     */
    public Enemigo() {

        nombre = "Enemigo";
        ataque = 10;
        vida = 100;
        vidaRestaurada = 100;
        nivelDificultad = 1;

    }

    /**
     * Constructor con parámetros
     *
     * @param nombre Valor que se establecerá para nombre.
     * @param ataque Valor que se establecerá para ataque.
     * @param defensa Valor que se establecerá para defensa.
     * @param vida Valor que se establecerá para vida.
     * @param pasiva Valor que se establecerá para pasiva.
     */
    public Enemigo(String nombre, int ataque, int defensa, int vida, String pasiva) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    @Override

    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el nivel de dificultad establecido en el enemigo
     *
     * @return nivelDificultad
     */
    public int getDificultad() {
        return nivelDificultad;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * Método usado para que el enemigo contraataque a su atacante al recibir
     * daño.
     *
     * @param Dmg referido a la cantidad de daño que va a recibir el enemigo.
     * @param clase referido al objeto que ataca al enemigo, permite el
     * contraataque automático.
     */
    public void recibeDmg(int Dmg, Clases clase) {
        vida = vida - Dmg;

        if (vida > 0) {
            this.atacar(clase);
        } else {
            System.out.println(getNombre() + " ha sido derrotado");
        }
    }

    /**
     * Método que permite al enemigo atacar.
     *
     * @param clase referido al objeto al que se va a atacar.
     */
    public void atacar(Clases clase) {
        System.out.println("¡" + getNombre() + " te ataca!");
        clase.recibeDmg(ataque);
    }

    /**
     * Método que permite cambiar el nivel de dificultad del enemigo.
     *
     * @param num referido al nivel de dificultad que se desea.
     */
    public void setDificultad(int num) {
        nivelDificultad = num;
        ataque = 10 * nivelDificultad;
        vida = 100 * nivelDificultad;
    }

    @Override
    public void baileDeVictoria() {
        System.out.println("Has perdido! El enemigo baila alegremente ^.^");
    }

    /**
     * Método que permite curarse al enemigo. Usado en mejora para reestablecer
     * los valores de éste.
     */
    public void curar() {
        this.vida = vidaRestaurada;
    }

    @Override
    public void mejora() {
        curar();
        nivelDificultad++;
        setDificultad(nivelDificultad);
    }
    
     /**
     * Redefinición del método toString de la clase padre.
     *
     * @return Estadísticas de la clase guerrero.
     */
    @Override
    public String toString(){    
        return "\n ----- ESTADÍSTICAS DE ENEMIGO ----- \nNombre: " + nombre + "\nAtaque: " + ataque + "\nVida: " + vida + "\nDificultad: " + nivelDificultad;
    }
}
