
import poo.io.*;

/**
 *
 * @author Carlos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int contadorDeCombate = 0, contadorDeTurno = 0, d = 1, clase, edadJugador, dificultadEnemigo, movimiento, sexoJugador;
        String confirm, nombreJugador;

        System.out.println("!Bienvenido a TowerArena!");
        System.out.println("Antes de empezar, algunas cosas que deberías saber:");
        System.out.println("· TowerArena es una torre donde te enfrentarás a enemigos cada vez más poderosos.");
        System.out.println("· Cada planta representa una dificultad, por ejemplo, planta 2 = dificultad 2");
        System.out.println("· El objetivo es lograr derrotar al máximo número posible de enemigos.");
        System.out.println("· Unicamnete podrás elegir la dificultad del enemigo en el primer piso");
        System.out.println("· Por cada piso que completes, podrás elegir mejorar uno de tus tres atributos, (ataque, defensa o vida).");

        System.out.println("\n¿Estás listo para comenzar una nueva aventura?");

        confirm = IO.readLine();

        Clases jugador1 = new Clases();

        if (confirm.equals("si") || confirm.equals("Si") || confirm.equals("sí") || confirm.equals("Sí")) {

            System.out.println("-------------------------------------------------");
            System.out.println("¡Perfecto!");

            System.out.println("¿Con qué nombre deberíamos de llamarte?");
            nombreJugador = IO.readLine();
            jugador1.setNombreJugador(nombreJugador);

            System.out.println("-----------------");
            System.out.println("¿Que edad tienes?");
            edadJugador = (int) IO.readNumber();
            jugador1.setEdadJugador(edadJugador);

            if (edadJugador < 18) {
                System.out.println("Lo siento, tienes que ser mayor de edad para poder jugar");
                System.exit(0);
            }
            System.out.println("----------------");
            System.out.println("¿Sexo? (1,2,3)");
            System.out.println("1.Hombre \n2.Mujer \n3.Otro");
            sexoJugador = (int) IO.readNumber();
            switch (sexoJugador) {
                case 1:
                    jugador1.setSexoJugador('H');
                    break;
                case 2:
                    jugador1.setSexoJugador('M');
                    break;
                case 3:
                    jugador1.setSexoJugador('X');
                    break;
                default:
                    jugador1.setSexoJugador('X');
                    break;
            }

            System.out.println(jugador1.jugador.toString());
        } else {

            System.out.println("Vaya :( \nNos vemos en la próxima!");

            System.exit(0);
        }

        System.out.println("\n***** CLASES DISPONIBLES *****");

        while (d != 0) {

            System.out.println("----- 1. Arquero ----- \nAtaque:50\nDefensa:50\nVida:300 ");

            System.out.println("----- 2. Guerrero ----- \nAtaque:25\nDefensa:75\nVida:400 ");

            System.out.println("----- 3. Mago ----- \nAtaque:75\nDefensa:25\nVida:200 \n");

            System.out.println("¿Que clase deseas elegir? (1,2,3)");

            clase = (int) IO.readNumber();

            switch (clase) {
                case 1:

                    System.out.println("¿Deseas elegir al arquero?");
                    confirm = IO.readLine();

                    if (confirm.equals("si") || confirm.equals("Si") || confirm.equals("sí") || confirm.equals("Sí")) {
                        d = 0;
                        jugador1 = new Arquero();
                    }

                    break;
                case 2:

                    System.out.println("¿Deseas elegir al guerrero?");
                    confirm = IO.readLine();

                    if (confirm.equals("si") || confirm.equals("Si") || confirm.equals("sí") || confirm.equals("Sí")) {
                        d = 0;
                        jugador1 = new Guerrero();
                    }

                    break;
                case 3:

                    System.out.println("¿Deseas elegir al mago?");
                    confirm = IO.readLine();

                    if (confirm.equals("si") || confirm.equals("Si") || confirm.equals("sí") || confirm.equals("Sí")) {
                        d = 0;
                        jugador1 = new Mago();
                    }

                    break;
                default:
                    System.out.println("Elige una de las tres clases");
                    break;
            }
        }

        System.out.print("La dificultad se mide según la planta en la que te encuentes.");
        System.out.print("\nElige en qué planta deseas empezar:");

        Enemigo enemigo1 = new Enemigo();
        dificultadEnemigo = (int) IO.readNumber();

        if (dificultadEnemigo < 1) {
            System.out.println("La dificultad no puede ser inferior a 1");
            dificultadEnemigo = 1;
        }
        enemigo1.setDificultad(dificultadEnemigo);
        System.out.println("\n!Comenzando en el piso " + dificultadEnemigo + "!");
        System.out.println("!Buena suerte!");

        while (jugador1.getVida() > 0) {
            contadorDeCombate++;
            System.out.println("\n<<<<< COMBATE " + contadorDeCombate + " >>>>>");
            System.out.println(enemigo1.toString());

            while (jugador1.getVida() > 0 && enemigo1.getVida() > 0) {
                contadorDeTurno++;
                System.out.println("\n----- TURNO " + contadorDeTurno + " -----");
                System.out.println("¿Que quieres hacer? (1,2,3)");
                System.out.println("1. Atacar");
                System.out.println("2. Defender");
                System.out.println("3. Curar");
                System.out.println("--------------------");

                movimiento = (int) IO.readNumber();

                System.out.println("\n----- REGISTRO DE COMBATE -----");
                switch (movimiento) {
                    case 1:
                        jugador1.atacar(enemigo1, jugador1);
                        System.out.println("\nVida del jugador:" + jugador1.getVida());
                        System.out.println("Vida del enemigo:" + enemigo1.getVida());
                        break;
                    case 2:
                        jugador1.defender(enemigo1, jugador1);
                        System.out.println("\nVida del jugador:" + jugador1.getVida());
                        System.out.println("Vida del enemigo:" + enemigo1.getVida());
                        break;
                    case 3:
                        jugador1.curar(enemigo1, jugador1);
                        System.out.println("\nVida del jugador:" + jugador1.getVida());
                        System.out.println("Vida del enemigo:" + enemigo1.getVida());
                        break;
                    default:
                        System.out.println("¡Los errores se pagan caro! ¡No vuelvas a equivocarte!");
                        enemigo1.atacar(jugador1);
                        System.out.println("\nVida del jugador:" + jugador1.getVida());
                        System.out.println("Vida del enemigo:" + enemigo1.getVida());
                        break;
                }
                System.out.println("\n-------------------------------");
            }

            if (jugador1.getVida() > 0) {

                Acciones win = jugador1;
                win.baileDeVictoria();

                jugador1.mejora();

                enemigo1.mejora();

                contadorDeTurno = 0;
            } else {
                Acciones lose = enemigo1;
                lose.baileDeVictoria();

                System.out.println("\n¡Has conseguido derrotar a " + (contadorDeCombate - 1) + " enemigos!");
            }
        }
    }
}
