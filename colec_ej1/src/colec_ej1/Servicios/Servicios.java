package colec_ej1.Servicios;

import java.util.ArrayList;
import java.util.Scanner;

/* @author Ezequiel Balasch
 */
public class Servicios {

    public class Servicio {

        private ArrayList<String> razaperro;

        public Servicio(ArrayList<String> razaperro) {
            this.razaperro = new ArrayList();
        }
        

        public void guardarRazas() {
            Scanner leer = new Scanner(System.in);
            String salir = "N";
            while (salir.equalsIgnoreCase("n")) {
                System.out.println("Ingrese raza del perro");
                razaperro.add(leer.nextLine());
                System.out.println("Desea salir (S/N)");
                salir = leer.nextLine();

            }

        }

        public void mostrarRazas() {
            System.out.println("Las razas introucidas son:");
            System.out.println("");
            for (String aux : razaperro) {
                System.out.println(aux);
            }
            System.out.println("Cantidad= " + razaperro.size());
        }

    }

}
