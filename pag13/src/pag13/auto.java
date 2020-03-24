/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pag13;

/**
 *
 * @author claud
 */
public class auto {
   private String marca;
            private int modelo;
           private float precio;
                   private int  kilometraje;

    public auto(String marca, int modelo, float precio, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }

    public auto() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    public int antiguedad(){
        return 2019-modelo;
    }
}
