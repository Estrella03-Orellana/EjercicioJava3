/*  Desarrollar un programa que permita leer múltiples valores numéricos hasta que el usuario decida detener
la lectura. Después, usará la colección TreeSet para mostrar el listado de los números ingresados ordenados
de menor a mayor. */

package Pag75;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();
        String continuar;

        do {
            System.out.print("Ingresa un número: ");
            int numero = sc.nextInt();
            numeros.add(numero);
            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            continuar = sc.next().toLowerCase();
        } while (continuar.equals("s"));

        System.out.println("Números ingresados ordenados (TreeSet):");
        for (int n : numeros) {
            System.out.println(n);
        }
    }

}
