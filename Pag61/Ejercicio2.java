/* Crear un programa que lea una cadena y quite los espacios en blanco. */

package Pag61;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        String sinEspacios = cadena.replace(" ", "");
        System.out.println("Cadena sin espacios: " + sinEspacios);
    }

}
