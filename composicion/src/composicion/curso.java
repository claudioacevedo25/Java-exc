/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author claud
 */
public class curso {

    private String nombre;
    private alumno[] alumnos;

    public curso(int cantidad) {
        alumnos = new alumno[cantidad];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlumno(alumno alumnoAcargar) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = new alumno(i);
                alumnos[i] = alumnoAcargar;//
                break;
            }
        }
    }

    public double promedioGeneral() {
        int contador = 0;
        double acumulador = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                acumulador += alumnos[i].promedio();
                contador++;
            }
        }
        if (contador > 0) {
            return acumulador / contador;
        } else {
            return 0;
        }

    }

    public int cantidadMayor8() {
        int cont = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].promedio() > 8 && alumnos[i] != null) {
                cont++;
            }
        }
        return cont;
    }
}
