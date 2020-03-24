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
public class Pag13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        equipo e1=new equipo();
        equipo e2=new equipo();
        
        int resultado=0;
        
        e1.setNombre("Belgrano");
        e2.setNombre("Talleres");
        System.out.println("el ganador de la contienda es " + e1.getNombre());
    }
    
}
