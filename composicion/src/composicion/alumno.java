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
public class alumno {

    private String nombre;
    private int legajo;
    private int[] notas;

//    este constructor es conveniente no ponerlo cuando tenemos un arreglo 
//    public alumno(String nombre, int legajo, int[] notas) {
//        this.nombre = nombre;
//        this.legajo = legajo;
//        this.notas = notas;
//    }
    public alumno(int cantidad) {//paso por parametro la cantidad de elemntos que tiene el arreglo en constructor
        notas = new int[cantidad];

    }

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

    public void agregarNota(int nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 0) {//esto seria para validar que el arreglo esta vacio, con cero
                notas[i] = nota;//nota que pase por parametro en este mismo metodo
                break;
            }
//           hago el reccorido del el arreglo de notas, 
//            if verificando lugar disponible, si esta vacio agrego la nota y termino con break
//la clase Scanner solo va en el metodo main

        }
    }
//EL NOMBRE DE TODAS LAS CLASES EMPIEZAN CON MAYUSCULA

    public double promedio() {
        int contador = 0;
        int suma = 0;//esta variable tambien le puedo poner acumulador
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 0) {
                suma = suma + notas[i];// o tmb podemos poner acumulador+=notas[i];
                contador++;
            }
        }
        if (contador > 0) {
            return suma / contador;
        } else {
            return 0;
        }

    }

}
