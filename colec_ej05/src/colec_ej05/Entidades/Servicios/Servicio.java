package colec_ej05.Entidades.Servicios;

import colec_ej05.Entidades.Paises;
import colec_ej05.Entidades.Servicios.Comparadores.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 

/* * @author Ezequiel Balasch
 */
public class Servicio {

    private ArrayList<Paises> country;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Servicio() {
        this.country = new ArrayList<>();
    }

    public Paises cargarPaises() {
        Paises p;
        System.out.println("Ingrese un nuevo país");
        String nombre = leer.next();
        p = new Paises(nombre);
        return p;
    }

    public char validarConfir(char confirmar, char si, char no) {
        if (confirmar != si && confirmar != no) {
            do {
                System.out.println("Valor ingresado incorrecto, por favor ingrese nuevamente");
                confirmar = leer.next().charAt(0);
                confirmar = Character.toLowerCase(confirmar);
            } while (confirmar != si && confirmar != no);
        }
        return confirmar;
    }

    public void agregarPais(Paises pais) {

        country.add(pais);

    }

    public void subirPaises() {
        Paises p;
        char confirmar;
        do {
            p = cargarPaises();
            agregarPais(p);
            System.out.println("¿Desea agregar otro país? (S/N)");
            confirmar = leer.next().charAt(0);
            confirmar = Character.toLowerCase(confirmar);
            validarConfir(confirmar, 's', 'n');
        } while (confirmar == 's');
    }

    public void eliminarPais() {
        char desicion;
        boolean band = false;
        do {
            System.out.println("Ingrese país a eliminar en caso de que exista");
            String pais = leer.next();
            for (Paises aux : country) {
                if (pais.equals(aux.getPais())) {
                    System.out.println("el pais " + aux.toString() + " se ha eliminado");
                    country.remove(aux);
                    band = true;
                }

            }
            if (band == false) {
                System.out.println("no se ha encontrado un pais con ese nombre");
            }
            System.out.println("¿desea eliminar otro país? (s/n)");
            desicion = leer.next().charAt(0);
            desicion = Character.toLowerCase(desicion);
            validarConfir(desicion, 's', 'n');

        } while (desicion == 's');

    }

    public void mostrPaises() {
        System.out.println("");
        System.out.println("Los países ingresados son");

        Collections.sort(country, Comparator.CompararPaises);

        for (Paises paises : country) {
            System.out.println(paises.toString());
        }
    }

}
