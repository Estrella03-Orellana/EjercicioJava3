/* Crear un programa que lea una cadena, sustituya por mayúscula la primera 
letra de la cadena y la primera letra después de un espacio. */

package Pag61;

import java.util.Scanner;

class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine().toLowerCase();

        String[] palabras = cadena.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1))
                        .append(" ");
            }
        }

        System.out.println("Cadena con mayúsculas: " + resultado.toString().trim());
    }

}
