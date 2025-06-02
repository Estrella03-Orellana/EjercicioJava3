/*  Desarrollar un programa que elimine la última palabra de una frase */

package Pag61;
import java.util.Scanner;

public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine().trim();

        int ultimaPalabra = frase.lastIndexOf(" ");
        if (ultimaPalabra != -1) {
            String resultado = frase.substring(0, ultimaPalabra);
            System.out.println("Frase sin la última palabra: " + resultado);
        } else {
            System.out.println("No hay palabras que eliminar.");
        }
    }

}
