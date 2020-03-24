/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pag11;

/**
 *
 * @author claud
 */
public class persona {

    private String nombre;
    private String apellido;
    private int dni;
    private int añoNacimiento;
    private float peso;
    private float altura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altuta) {
        this.altura = altuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public persona(String nombre, String apellido, int dni, int añoNacimiento,float peso,float altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.añoNacimiento = añoNacimiento;
        this.peso=peso;
        this.altura=altura;
    }

    public persona() {
    }

    public String toStringPersona() {
        return "La persona " + nombre + " " + apellido + " de dni " + dni + " nacio en el año " + añoNacimiento;
    }

    public int edad() {
        return 2019 - añoNacimiento;
    }
    
    public float imc(){
        return peso/(float)Math.pow(altura, 2);
        
    }
}
