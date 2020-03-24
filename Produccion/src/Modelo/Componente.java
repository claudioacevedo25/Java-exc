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
public class Componente {

    private int codComponente;
    private String descComponente;
    
    
    public Componente() {
    }
    
       public Componente(int codComponente, String descComponente) {
        this.codComponente = codComponente;
        this.descComponente = descComponente;
    }

    public int getCodComponente() {
        return codComponente;
    }

    public void setCodComponente(int codComponente) {
        this.codComponente = codComponente;
    }

    public String getDescComponente() {
        return descComponente;
    }

    public void setDescComponente(String descComponente) {
        this.descComponente = descComponente;
    }

    @Override
    public String toString() {
        return descComponente ;
    }
       
    

    
}
