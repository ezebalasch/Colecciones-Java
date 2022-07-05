package colec_ej04.Entidades;

/* @author Ezequiel Balasch
*/
public class Pelicula {
    private String title;
    private String director;
    private Integer duration;

    public Pelicula() {
    }

    public Pelicula(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Título=" + title + ", director=" + director + ", duration=" + duration;
    }
    

}
