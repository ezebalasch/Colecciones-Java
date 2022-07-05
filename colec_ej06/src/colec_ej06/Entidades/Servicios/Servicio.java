package colec_ej06.Entidades.Servicios;

import colec_ej06.Entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* * @author Ezequiel Balasch
 */


public class Servicio {
    private HashMap<String,Tienda> mapa;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Servicio() {
        this.mapa = new HashMap<>();
    }




    public void subirProducto(){
        Tienda t;
        char confirmar;
        do {
                generarProducto();
            System.out.println("¿Desea ingresar otro producto? (s/n)");
            confirmar = leer.next().charAt(0);
            confirmar = Character.toLowerCase(confirmar);
            confirmar = validarConfir(confirmar, 's','n');
            System.out.println("");
        } while (confirmar=='s');
        
    }
    public void generarProducto(){
        Tienda t;
        System.out.println("Ingrese nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingrese precio del producto");
        Double precio = leer.nextDouble();
        System.out.println("");
        t = new Tienda(nombre,precio);
        mapa.put(nombre,t);
    }
    public char validarConfir(char confirmar, char si, char no){
        if (confirmar!=si && confirmar!=no) {
            do {
                System.out.println("Ingrese un valor correcto (s/n)");
                confirmar=leer.next().charAt(0);
                
            } while (confirmar!=si && confirmar!=no);
        }
        return confirmar;
    }
    public void mostrar(){
        for (Map.Entry<String, Tienda> entry : mapa.entrySet()) {
            System.out.println("Llave= "+entry.getKey()+", Valor= "+entry.getValue());            
        }
    }
    public void modificarPrecio(){
        System.out.println("");
        System.out.println("Ingrese nombre del producto a modificar");
        String nombre = leer.next();
        if (mapa.containsKey(nombre)) {
            System.out.println("Ingrese nuevo precio");
            Double precionuevo = leer.nextDouble();
            Tienda t = new Tienda(nombre,precionuevo);
            mapa.replace(nombre, t); 
        }else{
            char confirmar;
            System.out.println("el nombre ingresado no existe");
            System.out.println("");
            System.out.println("¿Desea buscar otro nombre? (s/n)");
            confirmar = leer.next().charAt(0);
            confirmar = Character.toLowerCase(confirmar);
            confirmar = validarConfir(confirmar, 's', 'n');
            if (confirmar=='s') {
                modificarPrecio();                
            }else{
                System.out.println("Saliendo de Modificación de producto");
            }
            
        }
        
    }
    public void eliminarProducto(){
        System.out.println("Ingrese nombre del producto a eliminar");
        String nombre = leer.next();
        if (mapa.containsKey(nombre)) {
            System.out.println("Eliminando "+nombre);
            mapa.remove(nombre);
        }else{
            char confirmar;
            System.out.println("el nombre ingresado no existe");
            System.out.println("");
            System.out.println("¿Desea buscar otro nombre? (s/n)");
            confirmar = leer.next().charAt(0);
            confirmar = Character.toLowerCase(confirmar);
            confirmar = validarConfir(confirmar, 's', 'n');
            if (confirmar=='s') {
                eliminarProducto();                
            }else{
                System.out.println("Saliendo de Eliminación de producto");
            }            
        }
    }
}
