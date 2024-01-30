package org.example;
public class Opcion {
    //Se utiliza este método para que el programa de el texto exacto segun la opción elegida
    public static String obtenerTextoOpcion(int opcion) {
            switch (opcion) {
                case 1:
                    return "Piedra";
                case 2:
                    return "Papel";
                case 3:
                    return "Tijeras";
                default:
                    //Si la opcion no es 1, 2 o 3, el programa declara que la opción es inválida
                    return "Opción inválida";
            }
        }
    }
