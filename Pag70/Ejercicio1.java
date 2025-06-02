/* Desarrollar un programa que permita almacenar cualquier valor numérico hasta 
que el usuario decida detener el programa, se debe calcular el promedio de los números
 introducidos y la cantidad de números positivos. */

package Pag70;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        String continuar;

        do {
            System.out.print("Ingresa un número: ");
            double numero = sc.nextDouble();
            numeros.add(numero);
            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            continuar = sc.next().toLowerCase();
        } while (continuar.equals("s"));

        double suma = 0;
        int positivos = 0;
        for (double num : numeros) {
            suma += num;
            if (num > 0) {
                positivos++;
            }
        }

        double promedio = (numeros.size() > 0) ? suma / numeros.size() : 0;
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de números positivos: " + positivos);
    }
}
