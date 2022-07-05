package colec_ej05.Entidades;

/* * @author Ezequiel Balasch
 */
public class Paises {

    private String pais;

    public Paises(String pais) {
        this.pais = pais;
    }

    public Paises() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Paises{" + "pais=" + pais + '}';
    }
    

}
