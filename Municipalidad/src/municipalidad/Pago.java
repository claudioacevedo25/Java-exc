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
public class Pago {
    private int demora;
    private float importe;
    private float interesesAdicionales;

    Pago(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public void setInteresesAdicionales(float interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }

    public Pago(int demora, float importe, float interesesAdicionales) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = interesesAdicionales;
    }

    public Pago() {
    }

    @Override
    public String toString() {
        return "Pago{" + "demora=" + demora + ", importe=" + importe + ", interesesAdicionales=" + interesesAdicionales + '}';
    }
    
    
}
