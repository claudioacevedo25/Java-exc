/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author claud
 */
public class alumno {
    private String nombre;
    private int legajo;
    private float promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public alumno(String nombre, int legajo, float promedio) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.promedio = promedio;
    }

    public alumno() {
    }
    
    public String toStringAlumno(){
        return "El alumno "+nombre+" con el legajo "+ legajo+" tiene un promedio de "+promedio;
    }
}
