package colec_ej04.Entidades.Servicios;

import colec_ej04.Entidades.Pelicula;
import colec_ej04.Entidades.Servicios.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/* @author Ezequiel Balasch
 */
public class Servicio {

    private ArrayList<Pelicula> movies;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Servicio() {
        this.movies = new ArrayList();
    }

    public void generarMovie() {
        Pelicula p;
        char confirmar;
        do {
            p = crearMovie();
            agregarMovie(p);
            System.out.println("¿Desea agregar otra película?");
            confirmar = leer.next().charAt(0);
            confirmar = Character.toLowerCase(confirmar);
            validarConfirmar(confirmar, 's', 'n');

        } while (confirmar == 's');

    }

    public Pelicula crearMovie() {
        Pelicula p;
        System.out.println("Ingrese título de la película:");
        String titulo = leer.next();
        System.out.println("Ingrese director de la obra: " + titulo);
        String director = leer.next();
        System.out.println("Ingrese duración de " + titulo + " en horas:");
        int horas = leer.nextInt();
        p = new Pelicula(titulo, director, horas);
        return p;
    }

    public void agregarMovie(Pelicula p) {
        movies.add(p);
    }

    public char validarConfirmar(char confirmar, char si, char no) {
        if (confirmar != si && confirmar != no) {
            do {
                System.out.println("Igrese un valor correcto, vuelva a ingresar");
                confirmar = leer.next().charAt(0);
            } while (confirmar != si && confirmar != no);
        }
        return confirmar;
    }

    public void mostrarMovies() {
        System.out.println("");
        System.out.println("Las películas ingresadas son :");
        for (Pelicula movie : movies) {
            System.out.println(movie.toString());
        }
    }

    public void mostrar1H() {
        System.out.println("");
        System.out.println("Las películas con duración de 1 hora son :");
        int nohay = 0;
        for (Pelicula movie : movies) {
            if (movie.getDuration() == 1) {
                System.out.println(movie.toString());
                nohay = 1;
            }
        }
        if (nohay == 0) {
            System.out.println("No se encontraron");

        }
    }

    public void mostrarDura() {
        System.out.println("");
        System.out.println("Las películas ordenadas de manera descendente por su duración son :");
        Collections.sort(movies, Comparadores.OrdenarDura);
        for (Pelicula movie : movies) {
            System.out.println(movie);
        }
    }

    public void mostrarDuraInvert() {
        System.out.println("");
        System.out.println("Las películas ordenadas de manera ascendente por su duración son :");
        Collections.sort(movies, Comparadores.OrdenarDuraInvert);
        for (Pelicula movie : movies) {
            System.out.println(movie);
        }
    }

    public void mostrarAlfaTitle() {
        System.out.println("");
        System.out.println("Las películas ordenadas por título son :");
        Collections.sort(movies, Comparadores.OrdenarTitulo);
        for (Pelicula movie : movies) {
            System.out.println(movie);
        }
    }
        public void mostrarAlfaDirec() {
        System.out.println("");
        System.out.println("Las películas ordenadas por director son :");
        Collections.sort(movies, Comparadores.OrdenarDirector);
        for (Pelicula movie : movies) {
            System.out.println(movie);
        }
    }

}

