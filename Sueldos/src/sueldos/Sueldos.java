/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("ingresar cantidad de horas");
        int horas=sc.nextInt();
        System.out.println("Ingresar valor de la hora");
        double valor=sc.nextDouble();
        double total=horas*valor;
        double extras=(valor*1.50)+ total;
        
        if(horas<=180)
        {  System.out.println("el total a cobrar es de " + total + " pesos");}
        else 
        {System.out.println("el total con horas extras es de " + (horas-180)*extras );}
        
        
        
    }
    
}
