/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municipalidad;

/**
 *
 * @author claud
 */
public class Plan {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    private String nombre;
    private float deuda;
    private int cuotas;
    private Pago[] pagos;

    public Plan(int cantidadPagos) {
        pagos = new Pago[cantidadPagos];
    }

    public void agregarPago(Pago agregarPago) {
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i] = new Pago(i);
                pagos[i] = agregarPago;
            }

        }
    }

    public boolean estaPagadoTotalmente() {
        int c = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                c++;
            }
        }
        if (cuotas == c) {
            return true;
        } else {
            return false;
        }

    }

    public String getListadoPagos() {
        String pagosEfectuados = "Listado de pagos \n";

        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {

                pagosEfectuados += pagos[i].toString() + "\n";
            }
        }
        return pagosEfectuados;

    }

    public float sumaInteresesCobrados() {
        float interes = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                interes += pagos[i].getInteresesAdicionales();
            }
        }
        return interes;

    }
}
