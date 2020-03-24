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
public class equipo {
    private String nombre;
    private int puntos;
    private int ganados;
    private int empatados;
    private int perdidos;
    private int golesFavor;
    private int golesContra;
    private int posicion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public equipo(String nombre, int puntos, int ganados, int empatados, int perdidos, int golesFavor, int golesContra, int posicion) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidos = perdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.posicion = posicion;
    }

    public equipo() {
    }
    
}
