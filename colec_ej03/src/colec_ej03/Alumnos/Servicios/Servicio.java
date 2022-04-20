package colec_ej03.Alumnos.Servicios;

import colec_ej03.Alumnos.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/* @author Ezequiel Balasch
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Alumno> alumnos;

    public Servicio() {
        this.alumnos = new ArrayList();
    }


    public void fabricaAlumno() {
        Alumno a;
        char desicion;
        do {
            a = crearAlumno();
            agregarAlumno(a);
            System.out.println("Desea agregar otro alumno: (s/n))");
            desicion = leer.next().charAt(0);
            Character.toLowerCase(desicion);
            validaCaracter(desicion, 's', 'n');
        } while (desicion == 's');

    }

    public Alumno crearAlumno() {
        Alumno a;
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese nombre del alumno: ");
        String nombre = leer.next();
        notas = crearNotas();
        a = new Alumno(nombre, notas);
        return a;
    }

    public ArrayList<Integer> crearNotas() {
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("--------INGRESO DE NOTAS--------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota " + (i + 1) + ":");
            int nota = leer.nextInt();
            nota = validaEntero(nota, 1, 10);
            notas.add(nota);
        }
        return notas;
    }

    public int validaEntero(int numero, int li, int ls) {
        while (numero < li || numero > ls) {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            numero = leer.nextInt();
        }
        return numero;
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public int validaCaracter(char caracter, char l1, char l2) {
        while (caracter != l1 && caracter != l2) {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            caracter = leer.next().charAt(0);
        }
        return caracter;
    }
    public void notaFinal(){
        char desicion;
        boolean band=false;
        do {
            System.out.println("ingrese el nombre del alumno a conocer su nota final");
            String nombre = leer.next();
            for (Alumno alumno : alumnos) {
                if (alumno.getNombre().equals(nombre)) {
                    int suma = sumaNotas(alumno.getNotas());
                    float notafinal = suma/alumno.getNotas().size();
                    System.out.println("la nota final del alumno \""+alumno.getNombre()+"\" es : "+notafinal);
                    band=true;
                    
                }
            }
            if (band==false) {
                System.out.println("\nno se encuentra un alumno con el nombre \""+nombre+"\".");   
            }
            System.out.println("desea conocer la nota final de otro alumno? s/n");
            desicion = leer.next().charAt(0);
            Character.toLowerCase(desicion);
            validaCaracter(desicion,'s','n');
        } while (desicion=='s');
        
    }
    public int  sumaNotas(ArrayList<Integer> notas){
        int acum=0;
        for (Integer nota : notas) {
            acum+=nota;            
        }
        return acum;
    }
    
    

}
