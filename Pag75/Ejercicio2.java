/* Desarrollar un programa que permita almacenar múltiples elementos de la clase Libro (Id, Título, Edición,
Autor) en un LinkedHashSet.
 */

package Pag75;

import java.util.LinkedHashSet;

public class Ejercicio2 {

     public static void main(String[] args) {
        LinkedHashSet<Libro> libros = new LinkedHashSet<>();

        libros.add(new Libro(1, "El Quijote", "1ra", "Cervantes"));
        libros.add(new Libro(2, "Cien Años de Soledad", "3ra", "García Márquez"));
        libros.add(new Libro(3, "1984", "2da", "George Orwell"));
        libros.add(new Libro(2, "Cien Años de Soledad", "3ra", "García Márquez")); // Duplicado por ID

        System.out.println("Lista de libros (LinkedHashSet):");
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
}
