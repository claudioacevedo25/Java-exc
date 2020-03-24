/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author claud
 */
public class arreglo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la cantidad de personas a cargar");
        n = sc.nextInt();
        String nombre[] = new String[n];
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese un nombre ");
            nombre[i] = sc.next();
            
        }
            
        sc.nextLine();
        System.out.println("Los nombres que comienzan con A son ");
        for (int i = 0; i < nombre.length; i++) {
          
            if(nombre[i].charAt(0)=='a'){
                System.out.println(nombre[i]);
        }
        
//        System.out.println(Arrays.asList(nombre));

       
            
            
        }
    }
}
