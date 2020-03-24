/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    //SE INGERESAN 10 NOTAS Y SE MUESTRA LA CANT DE REPROBADOS Y LA CANTIDAD DE APROBADOS
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int aprobados=0;
        int reprobados=0;
      int nota;
        for(int f=1;f<=10;f++){
            System.out.println("ingrese un numero: ");
            nota=sc.nextInt();
            if(nota>=7){
            aprobados++;
            }
            else{
            reprobados++;
            }
            
         
        }
        
        System.out.println("la cantidad total de aprobados es: " +aprobados);
        System.out.println("La cantidad de reprobados es: " +reprobados);
        
    }
    
}
