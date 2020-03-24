/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arreglo[]=new int[10];
        int suma=0;
        float promedio=0;
        int may5=0;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Por favor ingrese un numero");
            arreglo[i]=sc.nextInt();
            suma=suma+arreglo[i];
            promedio=suma/10;
            if(arreglo[i]>5){
              may5++;
            }
        }
        System.out.println("La suma de todos los numero es "+ suma + " y el promedio es " + promedio + " Y la cantidad de numeros mayores a 5 son "+ may5);
        
    }
    
}
