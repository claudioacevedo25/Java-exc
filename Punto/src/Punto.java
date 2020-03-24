
public class Punto {

    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Punto() {
    }

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {

        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

    public float distanciaOrigen() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public String toStringCuadrante() { 
        if (x > 0 && y > 0) {
            System.out.println("El punto P esta en el cuadrante 1 ");
        }
        else if (x<0 && y>0){
            System.out.println("El punto P esta en el cuadtrante 2");
        }
        else if(x<0 && y<0){
            System.out.println("El punto P esta en el cuadrante 3");
        }
        else {
            System.out.println("El punto P esta en el cuadrante 4");
        }
        
        return null;
    }

}
