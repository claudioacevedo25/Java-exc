/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

while(condicion.boolean){
    Instrucciones;
}
while evalua la condicion primero y la ejecuta hasta que sea falsa, es decir hasta 
que esa condicion no se cumpla. Si no se cumple la condicion ni siquera la primera vez, 
el bucle ni siquiera se ejecuta
 */
package ciclowhile;

/**
 *
 * @author claud
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int i=1;
         while(i<=10){
             System.out.println(i);
             i++;
         }
    }
    
}
