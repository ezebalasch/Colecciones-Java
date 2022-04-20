package colec_ej04.Entidades.Servicios.Utilidades;

import colec_ej04.Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> OrdenarDura = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t1.getDuration().compareTo(t.getDuration());
        }
    };
    public static Comparator<Pelicula> OrdenarDuraInvert = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDuration().compareTo(t1.getDuration());
        }
    };
    public static Comparator<Pelicula> OrdenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitle().compareTo(t1.getTitle());
        }
    };
    public static Comparator<Pelicula> OrdenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDirector().compareTo(t1.getDirector());
        }
    };

}
