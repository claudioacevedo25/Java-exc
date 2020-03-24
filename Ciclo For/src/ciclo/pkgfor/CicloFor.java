/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

for(inicializacion;condicion;aumento o decremento){
   instrucciones;
}
 */
package ciclo.pkgfor;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese un numero ");
        int numero=sc.nextInt();
        System.out.println("los numeros pares que hay dentro del numero elegido son: ");
        for(int i=0;i<=numero;i+=2)//inicia en 0,suma de a 2 (pares) mientras i<al num ingresado
        {System.out.println(i);}
    }
    
}
