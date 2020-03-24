/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagina10;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Pagina10 {

    /**
     * @param args the command line arguments
     */
    //SE INGRESA 10 VALORES Y SE MUESTRA SU SUMA Y SU PROMEDIO
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma=0;
        int prom;
        int num;
        for(int f=1;f<=10;f++){
            System.out.println("ingrese un numero: ");
            num=sc.nextInt();
            suma=suma+num;
         
        }
        prom=suma/10;
        System.out.println("La suma total es igual a: " +suma);
        System.out.println("La el promedio es igual a: " +prom);
        
        
    }
    
}
