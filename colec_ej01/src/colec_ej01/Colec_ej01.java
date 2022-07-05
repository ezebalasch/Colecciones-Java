
package colec_ej01;

import colec_ej01.Servicios.Servicio;


public class Colec_ej01 {


    public static void main(String[] args) {
        Servicio s1 = new Servicio();
        s1.guardarRazas();
        s1.mostrarRazas();
        s1.eliminar();
        s1.mostrarRazas();

    }

}
