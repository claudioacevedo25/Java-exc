/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el Nombre de la primera persona");
        String nombre1=sc.next();
        System.out.println("Ingrese su edad");
        int edad1=sc.nextInt();
        System.out.println("Ingrese el nombre de la segunda persona");
        String nombre2=sc.next();
        System.out.println("Ingrese su edad");
        int edad2=sc.nextInt();
        System.out.println("La persona de mayor edad es");
        if(edad1>edad2)
        {System.out.println(nombre1+" que tiene "+edad1+" años");}
        else 
        {System.out.println(nombre2+" que tiene "+edad2+" años");}
    }
    
}
