package org.example;

import java.util.*;

import static org.example.Eleccion.mostrarEleccion;
import static org.example.Opcion.obtenerTextoOpcion;

//Controla lógica del juego, la tabla y los resultados.
public class Juego {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERAS = 3;

    private static final Scanner scanner = new Scanner(System.in);

    /*Contadores para wins, losses, ties*/
    private static int wins = 0;
    private static int losses = 0;
    private static int ties = 0;

//Este método inicia el juego y controla el flujo de este, hasta que el jugador decida salir
    public void iniciarJuego() {
        // mientras que la variable again sea 1, se introduce en el bucle        
        int again;
        
        /*Creo un bucle para que el jugador pueda jugar múltiples veces mientras que pulse 1**/
        do {
            //llamo al método Menú
            mostrarMenu();
            int player = obtenerEntradaUsuario();
            int computer = Eleccion.generarEleccionComputadora();

            mostrarEleccion(player, computer, obtenerTextoOpcion(player), obtenerTextoOpcion(computer));
            Resultado.determinarResultado(player, computer);

            Tablero.mostrarTablero();// se muestra el tablero actualizado

            System.out.print("¿Quieres volver a jugar? (1->Si, 2->No): ");
            again = scanner.nextInt();
        } while (again == 1);

        scanner.close();
    }
    /*Con esto se puede mostrar el inicio/menu del juego*/
    private static void mostrarMenu() {
        System.out.println("Juguemos Cachipun");
        System.out.println("1: Piedra\n2: Papel\n3: Tijeras");
    }
    /*Se obtiene los datos del usuario y nos permite validar que si introduzcan los
    * numeros que queremos en concreto */
    private static int obtenerEntradaUsuario() {
        int player = 0;
        boolean inputValido;

            do {
                System.out.print("Ingresa una opción (1-3): ");
                //El scanner.hasNextInt--> verifica si el numero introducido es entero
                inputValido = scanner.hasNextInt();

                if (inputValido) {
                    player = scanner.nextInt();
                    if (player < 1 || player > 3) {
                        System.out.println("Error: Ingresa un número válido entre 1 y 3.");
                        inputValido = false;
                    }
                } else {
                    System.out.println("Error: Ingresa un número válido.");
                    scanner.next(); // Consumir la entrada no válida
                }

            } while (!inputValido);

            return player;
    }
/*Estos métodos sirven para incrementar y guardar los valores actuales en el tablero durante el juego*/
    public static void incrementWins() {
        wins++;
    }

    public static void incrementLosses() {
        losses++;
    }

    public static void incrementTies() {
        ties++;
    }
    public static int getWins() {
        return wins;
    }

    public static int getLosses() {
        return losses;
    }

    public static int getTies() {
        return ties;
    }
}
