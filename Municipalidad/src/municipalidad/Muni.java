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
public class Muni {

    private Plan[] planes;

    public Muni(int cantidadPlanes) {
        planes = new Plan[cantidadPlanes];
    }

    public void agregarPlan(Plan agregarPlan) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null) {
                planes[i] = new Plan(i);
                planes[i] = agregarPlan;
            }
        }
    }

    public int cantidadPlanesPagados() {
        int c = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                c++;
            }
        }
        return c;
    }

    public float sumatoriaDeuda() {
        float deuda = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                deuda += planes[i].getDeuda();
            }
        }
        return deuda;
    }

    public String listaDePagoContribuyente(String nombre) {
        String lista = "Mis pagos son: \n ";
        for (Plan p : planes) {
            if (p != null && p.getNombre() == nombre) {
                lista += p.getNombre() + "\n " + p.getListadoPagos();
            }
        }
        return lista;
    }

    public float promedioIntereses() {
        int c = 0;
        float a = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                c++;
                a += planes[i].sumaInteresesCobrados();
            }
        }
        if (c != 0) {
            return a / c;
        } else {
            return 0;
        }
    }

}
