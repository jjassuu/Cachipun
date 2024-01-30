package org.example;

public class Tablero {
    public static void mostrarTablero() {
        System.out.println("\n    Tablero ᵔ ᵕ ᵔ");
        System.out.println("==================");
        //muestra los resultados almacenados durante el juego
        System.out.printf("|%-10s | %s |\n", "Victorias^^:", Juego.getWins());
        System.out.printf("|%-10s | %s |\n", "Derrotas>:(:", Juego.getLosses());
        System.out.printf("|%-10s | %s |\n", "Empates-_-:", Juego.getTies());
        System.out.println("==================\n\n");
    }
}
