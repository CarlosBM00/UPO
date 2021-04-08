
import poo.io.*;

/**
 *
 * @author Carlos
 */
public class Arquero extends Clases {

    /**
     * Constructor sin parámetros
     */
    public Arquero() {

        nombreClase = "Arquero";
        ataque = 50;
        defensa = 50;
        vida = 300;
        pasiva = "Flechas reforzadas";

    }

    /**
     * Constructor con parámetros
     *
     * @param nombreClase Valor que se establecerá para nombreClase.
     * @param ataque Valor que se establecerá para ataque.
     * @param defensa Valor que se establecerá para defensa.
     * @param vida Valor que se establecerá para vida.
     * @param pasiva Valor que se establecerá para pasiva.
     */
    public Arquero(String nombreClase, int ataque, int defensa, int vida, String pasiva) {

        this.nombreClase = nombreClase;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.pasiva = pasiva;

    }

    /**
     * Redefinición del método mejora de la clase padre.
     *
     */
    @Override
    public void mejora() {

        int d = 1, clase;
        String confirm;

        while (d != 0) {

            System.out.println("¿Qué deseas mejorar?");

            System.out.println("1. Ataque");
            System.out.println("2. Defensa");
            System.out.println("3. Curar");

            clase = (int) IO.readNumber();
            switch (clase) {
                case 1:

                    System.out.println("¿Deseas mejorar el ataque? (si/no)");
                    confirm = IO.readLine();
                    if (confirm.equals("si")) {
                        d = 0;
                    }

                    ataque = ataque + 10;

                    System.out.println("Ataque: " + (getAtaque() - 10) + ">>" + getAtaque());

                    break;
                case 2:

                    System.out.println("¿Deseas mejorar la defensa? (si/no)");
                    confirm = IO.readLine();
                    if (confirm.equals("si")) {
                        d = 0;
                    }

                    defensa = defensa + 10;

                    System.out.println("Defensa: " + (getDefensa() - 10) + ">>" + getDefensa());
                    break;
                case 3:

                    System.out.println("¿Deseas curarte? (si/no)");
                    confirm = IO.readLine();
                    if (confirm.equals("si")) {
                        d = 0;
                    }

                    vida = vida + 50;

                    System.out.println("Vida: " + (getVida() - 50) + ">>" + getVida());

                    break;
                default:
                    System.out.println("Elige una de las tres mejoras");
                    break;
            }
        }
    }

    /**
     * Redefinición del método toString de la clase padre.
     *
     * @return Estadísticas de la clase arquero.
     */
    @Override
    public String toString() {
        return "\nEstadísticas de arquero: \nAtaque: " + ataque + "\nDefensa: " + defensa + "\nVida: " + vida;
    }

    /**
     * Redefinición del método equals de la clase padre. Permite comparar dos
     * pasivas de dos clases Arquero para ver si son iguales.
     *
     * @return True si las pasivas son iguales, si no, False.
     */
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Arquero) {

            Arquero clase = (Arquero) obj;
            return this.pasiva.equals(clase.pasiva);
        } else {
            return false;
        }
    }
}
