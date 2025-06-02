/* Desarrollar un programa que muestre la cantidad de palabras que contiene una frase.*/

package Pag61;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().trim();

        String[] palabras = frase.split("\\s+");
        System.out.println("Cantidad de palabras: " + palabras.length);

}
}


