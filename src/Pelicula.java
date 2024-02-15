public class Pelicula {
    /**
     * la clase pelicula tendra dos atributo: titulo y duracion, el contructor y los get/set
     */
    private String titulo;
    private int duracion;


    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getDuracion() {
        return duracion;
    }


    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
