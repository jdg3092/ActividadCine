public class Pelicula {
    /**
     * la clase pelicula tendra dos atributo: titulo y duracion, el contructor y los get/set
     */
    private String titulo;
    private int duracion;

    /**
     *
     * @param titulo lo que queremos hacer es crear el nombre de la pelicula  para despues llamarlo
     * @param duracion lo que vamos hacer es poner el timepo de la pelicula  para tambien llamarlo
     */
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * El get es para llamar la funcion
     * @return es para poder impirmir el get
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @param titulo lo que haces el set  es poner el nombre o titulo de pelicula
     */
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
