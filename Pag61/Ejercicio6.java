/*  Crear un programa que muestre si la palabra ingresada por el usuario es palíndroma o no */

package Pag61;
import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        String invertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(invertida)) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }
    }
}
