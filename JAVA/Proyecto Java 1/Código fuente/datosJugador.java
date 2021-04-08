
/**
 *
 * @author Carlos
 */
public class datosJugador {

    private String nombre;
    private char sexo;
    private int edad;

    /**
     * Constructor sin parámetros
     */
    public datosJugador() {

        this.nombre = "Unknown";
        this.sexo = 'X';
        this.edad = 18;

    }

    /**
     * Constructor con parámetros
     *
     * @param nombre Valor que se establecerá para nombre en datosJugador.
     * @param sexo Valor que se establecerá para sexo en datosJugador.
     * @param edad Valor que se establecerá para edad en datosJugador.
     */
    public datosJugador(String nombre, char sexo, int edad) {

        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;

    }

    /**
     * Método que devuelve el nombre del jugador.
     *
     * @return nombreJugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el sexo del jugador.
     *
     * @return sexoJugador
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Método que devuelve la edad del jugador.
     *
     * @return edadJugador
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que permite cambiar el nombre del jugador.
     *
     * @param nombre Valor que se establecerá para nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que permite cambiar el sexo del jugador.
     *
     * @param sexo Valor que se establecerá para sexo.
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Método que permite cambiar la edad del jugador.
     *
     * @param edad Valor que se establecerá para edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

     /**
     * Redefinición del método toString.
     *
     * @return Valores de los atributos de la clase datosJugador.
     */
    @Override
    public String toString() {
        return "\n ----- DATOS JUGADOR ----- \nNombre: " + nombre + "\nSexo: " + sexo + "\nEdad: " + edad;
    }

}
