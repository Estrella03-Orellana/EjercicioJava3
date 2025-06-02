/* Desarrollar un programa que muestre la cantidad de veces que aparece la vocal “A” 
en una frase ingresada por la persona usuaria. */

package Pag61;
import java.util.Scanner;

public class Ejercicio5 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().toLowerCase();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("Cantidad de veces que aparece la letra 'a': " + contador);
    }
}
