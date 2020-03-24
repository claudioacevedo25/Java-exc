/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisiesto;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese un año");
        int año=sc.nextInt();
        //int bi=año/4;
        if ((( año % 4 == 0 ) && ( año % 100 != 0 )) || ( año % 400 == 0 ))
        {System.out.println(año +" es año bisiesto");}
        else
        {System.out.println("No es año bisiesto");}
    }
    
}
