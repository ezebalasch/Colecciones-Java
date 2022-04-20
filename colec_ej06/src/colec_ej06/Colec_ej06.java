/*
// Curso Egg FullStack
 */
package colec_ej06;

//@author Ezequiel Bala
import colec_ej06.Entidades.Servicios.Servicio;
import java.util.Scanner;

public class Colec_ej06 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Servicio s1 = new Servicio();
    char salir = 'n';
    int opcion = 0;

    
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("----------Menú de la Tienda----------");
            System.out.println("__Ingrese un número para continuar__");
            System.out.println("");
            System.out.println("1. Subir un producto");
            System.out.println("2. Modificar Precio");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Productos");
            System.out.println("5. Salir");
            System.out.println("------------------------------------");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    s1.subirProducto();
                break;
             case 2:
                    s1.modificarPrecio();
                break;
             case 3:
                    s1.eliminarProducto();
                break;
             case 4:
                    s1.mostrar();
                break;
             case 5:
                 System.out.println("Saliendo del programa");
                 salir='s';
                break;
             default:
                 System.out.println("Por favor, Ingrese un valor numérico correcto. (1-5)");
                    salir='n';
                break;
            }
        } while (salir=='n');


    }

 }
