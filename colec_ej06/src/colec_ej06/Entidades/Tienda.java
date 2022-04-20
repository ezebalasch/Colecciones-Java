package colec_ej06.Entidades;

/* * @author Ezequiel Balasch
 */


public class Tienda {
    private String nombre;
    private Double  precio;

    public Tienda() {
    }

    public Tienda(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    

}
