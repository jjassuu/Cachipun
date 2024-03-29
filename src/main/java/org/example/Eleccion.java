package org.example;
import java.util.*;

//Genera la elección aleatoria de la computadora y muestra en pantalla la eleccion del jugador y la del ordenador


//Genera la elección aleatoria de la computadora, y muestra en pantalla la elección del jugador y la del ordenador.
public class Eleccion {
    //Constante que genera numeros aleatorios
    private static final Random random = new Random();
    //Se declara este método para que pueda generar la eleccion aleatoria del ordenador.
    public static int generarEleccionComputadora() {
        return random.nextInt(3) + 1; /*Genera un numero aleatorio entre 0 y 3,
         siendo el tres exclusivo. Despues se le suma 1*/
    }
    /*Este método se declara para que muestre en pantalla la eleccion del jugador y la eleccion de la 
    computadora*/
    public static void mostrarEleccion(int player, int computer, String textoPlayer,String textoComputer) {
        System.out.println("Has elegido: " + textoPlayer);
        System.out.println("La computadora eligió: " + textoComputer);
    }

}
