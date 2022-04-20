package colec_ej01.Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* @author Ezequiel Balasch
 */
public class Servicio {

    private ArrayList<String> razaperro;

    public Servicio() {
        this.razaperro = new ArrayList();
    }
    String salir = "N";
    Scanner leer = new Scanner(System.in);

    public void guardarRazas() {
        while (salir.equalsIgnoreCase("n")) {
            System.out.println("Ingrese raza del perro");
            razaperro.add(leer.nextLine());
            salida();
        }
    }

    public void salida() {
        System.out.println("Desea salir (S/N)");
        salir = leer.nextLine();
    }

    public void mostrarRazas() {
        System.out.println("Las razas introucidas son:");
        System.out.println("");
        for (String aux : razaperro) {
            System.out.println(aux);
        }
        System.out.println("Cantidad= " + razaperro.size());
    }

    public void eliminar() {
        System.out.println("Ingrese raza de perro a elimiar");
        Iterator<String> it = razaperro.iterator();
        String perro = leer.nextLine();
        boolean h = false;
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(perro)) {
                it.remove();                

            }else{
                h=true;
            }
        }
        if (h==true) {
        System.out.println("El perro ha eliminar no fue encontrado");
            
        }
    }

}
