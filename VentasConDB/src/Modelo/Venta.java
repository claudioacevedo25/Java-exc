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
public class Venta {
    private int idVenta;
    private String fecha;
    private float descuento;
    private  int cantidad;
    private Producto producto;

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha=" + fecha + ", descuento=" + descuento + ", cantidad=" + cantidad + '}';
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta(String fecha, float descuento, int cantidad, Producto producto) {
        this.fecha = fecha;
        this.descuento = descuento;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Venta(Producto producto) {
        this.producto = producto;
    }
}
