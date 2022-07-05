package colec_ej05.Entidades.Servicios.Comparadores;

import colec_ej05.Entidades.Paises;

/* * @author Ezequiel Balasch
 */


public class Comparator {
        public static java.util.Comparator<Paises> CompararPaises = new java.util.Comparator<Paises>() {
        @Override
        public int compare(Paises t, Paises t1) {

            return t.getPais().compareTo(t1.getPais());
        }
    };
    

}
