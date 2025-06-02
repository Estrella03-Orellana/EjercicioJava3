/*  Crear una clase entidad llamada Alumno con las propiedades: Código, Nombre y Carnet. Encapsule las
propiedades y agregue los constructores. A partir de esta entidad crear una lista genérica de tipo ArrayList,
insértele valores y luego muéstrelos en pantalla.*/

package Pag70;
import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno("001", "Ana Pérez", "AP123"));
        listaAlumnos.add(new Alumno("002", "Luis Gómez", "LG456"));
        listaAlumnos.add(new Alumno("003", "Sofía Díaz", "SD789"));

        System.out.println("Lista de Alumnos:");
        for (Alumno a : listaAlumnos) {
            System.out.println(a);
        }
    }
}
