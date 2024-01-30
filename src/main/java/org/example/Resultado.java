package org.example;

import static org.example.Juego.*;

public class Resultado {
    /*Utilizamos este método para determinar el resultado del juego comparando las
    elecciones del jugador y la computadora*/
    public static void determinarResultado(int player, int computer) {
        if (player == computer) {
            System.out.println("Empate");
            //Se incrementa en el contador de empate ubicado en la clase Juego
            Juego.incrementTies();
        } else if (((player == PIEDRA) && (computer == TIJERAS)) ||
                ((player == PAPEL) && (computer == PIEDRA)) ||
                ((player == TIJERAS) && (computer == PAPEL))) {
            System.out.println("Ganaste");
            //Se incrementa en el contador de victorias ubicado en la clase Juego
            Juego.incrementWins();
        }else {
            System.out.println("Perdiste");
            //Se incrementa en el contador de derrotas ubicado en la clase Juego
            Juego.incrementLosses();

        }
    }
}
