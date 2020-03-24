/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc;


import javax.swing.JOptionPane;

/**
 *
 * @author claud
 */
public class Ejerc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        eje2 c=new eje2();
        String[]paises=new String[8];
        for(int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Ingrese pais " +(i+1));
        }
        for(String elemento: paises){
            System.out.println(paises);
        }
        
    }
    
}
