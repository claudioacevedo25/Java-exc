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
public class Reserva {
   private int idReserva; 
   private Ciudad ciudadOrigen;
   private Ciudad ciudadDestino;
   private String codDescuento;
   private int adultos;
   private int menores;
   private float total;

    public Reserva() {
        ciudadOrigen = new Ciudad();
        ciudadDestino = new Ciudad();
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getCodDescuento() {
        return codDescuento;
    }

    public void setCodDescuento(String codDescuento) {
        this.codDescuento = codDescuento;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getMenores() {
        return menores;
    }

    public void setMenores(int menores) {
        this.menores = menores;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", codDescuento=" + codDescuento + ", adultos=" + adultos + ", menores=" + menores + ", total=" + total + '}';
    }

   
   
}
