/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pag11;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Pag11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona p = new persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre de la persona");
        p.setNombre(sc.next());
        System.out.println("Ingrese el apellido de la persona");
        p.setApellido(sc.next());
        System.out.println("Ingrese el dni de la persona");
        p.setDni(sc.nextInt());
        System.out.println("Ingrese el año de nacimiento");
        p.setAñoNacimiento(sc.nextInt());
        System.out.println("Ingrese su peso (KG) ");
        p.setPeso(sc.nextFloat());
        System.out.println("Ingrese su altura (MTS) ");
        p.setAltura(sc.nextFloat());

        System.out.println(p.toStringPersona() + " tiene " + p.edad() + " años y su IMC es " + p.imc());

        float imc = p.imc();
        if(imc<18.5){
        System.out.println("Usted tiene un peso inferior al normal...coma mas che flaque culia");
    }
        else if(imc>18.5 && imc<24.9){
            System.out.println("FELICITACIONES¡¡ Usted es una persona normal, tiene suerte de no ser gordo caquero");
            
        }
        else if(imc>25 && imc<29.9){
            System.out.println("Usted posee un peso superior al normal, pare de lastrar un poco buey");
        }
        else {
            System.out.println("Usted tiene obesidad nivel morbida");
        }
        
        
        

    }
}
