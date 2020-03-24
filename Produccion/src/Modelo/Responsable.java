/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author claud
 */
public class Responsable {
    private int código;
    private String nombreResponsable;

    public Responsable() {
    }

    public Responsable(int código, String nombreResponsable) {
        this.código = código;
        this.nombreResponsable = nombreResponsable;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    @Override
    public String toString() {
        return  nombreResponsable;
    }
    
    
}
