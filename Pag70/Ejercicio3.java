/* Crear una lista de tipo LinkedList con la misma entidad que el ejercicio anterior. Inserte valores y muéstrelos
en pantalla. */

package Pag70;
import java.util.LinkedList;

public class Ejercicio3 {
    public static void main(String[] args) {
        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        listaAlumnos.add(new Alumno("004", "Carlos Méndez", "CM101"));
        listaAlumnos.add(new Alumno("005", "María López", "ML202"));
        listaAlumnos.add(new Alumno("006", "José Ramírez", "JR303"));

        System.out.println("Lista de Alumnos (LinkedList):");
        for (Alumno a : listaAlumnos) {
            System.out.println(a);
        }
    }

}
