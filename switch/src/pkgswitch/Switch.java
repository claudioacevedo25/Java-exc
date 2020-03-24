/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int numero = (int) (1000 * Math.random());
        int resto = numero / 6;
        System.out.println("el numeor random es " + numero);
        System.out.println("El resto de la division es " + resto);
        switch (resto) {
            case (0):
                System.out.println("confirmo, el resto es cero");
                break;
            case (1):
                System.out.println("Confirmo, el resto es 1");
                break;
            case (2):
                System.out.println("Confirmo, el resto es 3");
                break;
            case (3):
                System.out.println("Confirmo, el resto es 3");
                break;
            default:
                System.out.println("Confirmo, el resto es mayor a 3");
         

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pimera persona");
        String n1 = sc.next();
        System.out.println("Ingrese la altura  de la pimera persona");
        int a1 = sc.nextInt();
        System.out.println("Ingrese el nombre de la segunda persona");
        String n2 = sc.next();
        System.out.println("Ingrese la altura de la segunda persona");
        int a2 = sc.nextInt();
       

        if (a1 > a2) {
            System.out.println("La persona de mayor estatura es " + n1);
        } else {
            System.out.println("La persona de mayor estatura es " + n2);
        }
//*/ Scanner sc = new Scanner(System.in);
//        int numeros[]= new int[10];
//        int suma=0;
//        int promedio=0;
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Ingrese un numero");
//            numeros[i]=sc.nextInt();
//            suma=suma+numeros[i];//digo q la primera vez la var suma vale 0 y se le suma el elemento que esta en la posicio i
//            //la siguiente iteracion se lo va sumando a la variable q va cambiando el valor con cada iteracion
//            promedio=suma/numeros.length;//igual a la suma 
//        }
//        
//        System.out.println(Arrays.toString(numeros));
//        System.out.println("la suma total de todos los numeros es de " + suma+ "\n" +"y el promedio general es " + promedio);
//        

//        int numeros[] = new int[10];
//        int m5 = 0;
//        int i=0;
//        do {
//            
//            System.out.println("Ingrese un numero");
//            numeros[i]=sc.nextInt();
//            if(numeros[i]>5){
//                m5++;
//            }
//        } while(numeros[i]>0);
//        System.out.println("La cantidad de numeros mayores a 5 son "+ m5);
//        System.out.println("Ingrese un numero positivo");
//        int n = sc.nextInt();
//        while(n<0){
//            System.out.println("Ingresar otro numero ");
//            n=sc.nextInt();
//        }
//        System.out.println("El numero es " + n);
//    }
//        System.out.println("Ingresar el tiempo del ganador ");
//        int tganador = sc.nextInt();
//        int participantes[] = new int[9];
//        int t = 0;
//        for (int i = 0; i < 9; i++) {
//
//            System.out.println("ingresar el tiempo del siguiente participante ");
//            participantes[i] = sc.nextInt();
//            if (participantes[i] < tganador + (tganador * 0.15)) {
//                t++;
//            }
//
//        }
//        System.out.println("La cantidad de participantes sera de " + t);
        System.out.println("ingrese la antiguedad del vehiculo");
        int antiguedad = sc.nextInt();
        int n = 0;
        int p = 0;
        int m = 0;
        int c = 0;
        double suma=0;
        while (antiguedad > 0) {
            if(antiguedad<21){
              suma=suma+antiguedad;
              }
            c++;
            
            if (antiguedad >= 1 && antiguedad <= 5) {
                System.out.println("El auto es NUEVO");
                n++;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                System.out.println("El auto tiene POCO USO");
                p++;
            } else if (antiguedad >= 11 && antiguedad <=20) {
                System.out.println("El auto tiene MUCHO USO ");
                m++;
            }
            else{
                System.out.println("El auto es MUY ANTIGUO");
            
            }
            System.out.println("Ingrese la antiguedad del vehiculo");
            antiguedad=sc.nextInt();
              
          }
        
        System.out.println("La cantidad total de autos cargados es de " + c);
        System.out.println("La cantidad de autos con poco uso es de " + p);
        System.out.println("El promedio de antiguedad de los autos q no son muy antiguos es de "+suma/(n+p+m));
        
    }
}
