package org.example;

public class Tablero {
    public static void mostrarTablero() {
        System.out.println("\n    Tablero ᵔ ᵕ ᵔ");
        System.out.println("==================");
        //muestra los resultados almacenados durante el juego
        System.out.printf("|%-10s | %s |\n", "Victorias^^:", Juego.getVictorias());
        System.out.printf("|%-10s | %s |\n", "Derrotas>:(:", Juego.getDerrotas());
        System.out.printf("|%-10s | %s |\n", "Empates-_-:", Juego.getEmpates());
        System.out.println("==================\n\n");
    }
}
