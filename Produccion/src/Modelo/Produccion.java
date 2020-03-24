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
public class Produccion {
    
    private int codigoProduccion;
    private Responsable responsable;
    private String fecha;
    private Componente componente;
    private int cantidadProduccion;

    public Produccion(int codigoProduccion, Responsable responsable, String fecha, Componente componente, int cantidadProduccion) {
        this.codigoProduccion = codigoProduccion;
        this.responsable = responsable;
        this.fecha = fecha;
        this.componente = componente;
        this.cantidadProduccion = cantidadProduccion;
    }

    public Produccion() {
    }

    public int getCodigoProduccion() {
        return codigoProduccion;
    }

    public void setCodigoProduccion(int codigoProduccion) {
        this.codigoProduccion = codigoProduccion;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public int getCantidadProduccion() {
        return cantidadProduccion;
    }

    public void setCantidadProduccion(int cantidadProduccion) {
        this.cantidadProduccion = cantidadProduccion;
    }

    @Override
    public String toString() {
        return "Produccion{" + "codigoProduccion=" + codigoProduccion + ", responsable=" + responsable + ", fecha=" + fecha + ", componente=" + componente + ", cantidadProduccion=" + cantidadProduccion + '}';
    }
    
    
    
}
