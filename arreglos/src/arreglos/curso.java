/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author claud
 */
public class curso {

    private String nombreCurso;

    public curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        alumno[] a = new alumno[2];

        for (int i = 0; i < a.length; i++) {
            a[i] = new alumno();
            System.out.println("Introduce el nombre del alumno");
            a[i].setNombre(sc.next());
            System.out.println("Introduce el legajo");
            a[i].setLegajo(sc.nextInt());
            System.out.println("Intoduce el promedio");
            a[i].setPromedio(sc.nextFloat());

        }

        for (int i = 0; i < a.length; i++) {
             System.out.println("El alumno "+a[i].getNombre()+" con el legajo "+a[i].getLegajo()+" tiene un promedio de "+a[i].getPromedio());
            
        }

    }
}
