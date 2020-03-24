/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

do{instrucciones
}while (condicion)
este tipo de bucle se ejecuta minimo una vez, porque primero ejecuta
y luego evalua la condicion. Utilizado en programas con menus de opciones por ej

 */
package ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class CicloDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
         int i=1,contador;
         
         System.out.println("Digite la cantidad de terminos");
         contador=sc.nextInt();
           
         do {
             System.out.println(i);
             i--;
        } while(i<=contador);
    }
    
}
