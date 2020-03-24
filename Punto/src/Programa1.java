
import java.util.Scanner;

public class Programa1 {

    public static void main(String[] args) {
        
        Punto p1 = new Punto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1");
        p1.setX(sc.nextFloat());
        sc.nextLine();
        System.out.println("Ingrese el valor de y1");
        p1.setY(sc.nextFloat());
        System.out.println("la distancia al origen es "+p1.distanciaOrigen());
        System.out.println(p1.toString());
        System.out.println(p1.toStringCuadrante());
        
        
        Punto p2=new Punto();
        System.out.println("Ingrese el valor de x2");
        p2.setX(sc.nextFloat());
        sc.nextLine();
        System.out.println("Ingrese el valor de y2");
        p2.setY(sc.nextFloat());
        
        float distanciaOtro=  (float)Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2)+ Math.pow(p2.getY()-p1.getY(), 2))   ;
        System.out.println("La distancia entre el P1 y el P2 es "+ distanciaOtro);
    }

  
}
