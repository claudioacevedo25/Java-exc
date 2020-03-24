/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagina2;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Pagina2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int km;
        double total;
        System.out.println("Ingrese la cantidad de km del vehiculo:  ");
        km=sc.nextInt();
        if(km<200){
            total=300;
        }
        else {
            if(km<1000){
                total=((km-200)*5)+300;
            }
            else{
                total=((km-200)*10)+300;
            }
        }
        System.out.println("El total a pagar es: " + total);
    }
    
}
