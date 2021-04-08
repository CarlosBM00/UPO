
/**
 *
 * @author Carlos
 */
public interface Acciones {

    /**
     * Método que devuelve el nombre de la clase.
     *
     * @return nombreClase
     */
    public String getNombre();

    /**
     * Método que devuelve el ataque de la clase.
     *
     * @return ataque
     */
    public int getAtaque();

    /**
     * Método que devuelve la vida de la clase.
     *
     * @return vida
     */
    public int getVida();

    /**
     * Método que permite cambiar el nombre de la clase.
     *
     * @param nombre Valor que se establecerá para nombre.
     */
    public void setNombre(String nombre);

    /**
     * Método que permite cambiar el ataque de la clase.
     *
     * @param ataque Valor que se establecerá para ataque.
     */
    public void setAtaque(int ataque);

    /**
     * Método que permite cambiar la vida de la clase.
     *
     * @param vida Valor que se establecerá para vida.
     */
    public void setVida(int vida);

    /**
     * Método que te pone a bailar.
     *
     */
    public void baileDeVictoria();

    /**
     * Método que permite la mejora de la clase.
     *
     */
    public void mejora();
}
