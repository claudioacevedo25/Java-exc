/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municipalidad;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Municipalidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de planes");
        int cantPlan=sc.nextInt();
        Muni muniCba=new Muni(cantPlan);
        
        for (int i = 0; i < cantPlan; i++) {
        System.out.println("Ingrese la cantidad de cuotas");
        int cantCuota=sc.nextInt();
        Plan planCba=new Plan(cantCuota);
        planCba.setCuotas(sc.nextInt());
        System.out.println("Ingrese el nombre del Contribuyente");
        String nom=sc.next();
        planCba.setNombre(sc.next());
        System.out.println("Ingrese la Deuda");
        planCba.setDeuda(sc.nextFloat());
        
        int c=0;
        while(planCba.getCuotas()<c){
            c++;
            Pago pagoCargar= new Pago();
            System.out.println("Ingrese la cantidad de dias de demora");
            pagoCargar.setDemora(sc.nextInt());
            System.out.println("Ingrese el importe a abonar");
            pagoCargar.setImporte(sc.nextFloat());
            System.out.println("Ingrese los intereses a pagar");
            pagoCargar.setInteresesAdicionales(sc.nextFloat());
           planCba.agregarPago(pagoCargar);
           
        }
        muniCba.agregarPlan(planCba);     
        }
        
    }
    
}
