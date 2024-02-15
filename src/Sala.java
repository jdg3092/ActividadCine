public class Sala {
    private int numero;
    private Pelicula pelicula;
    private boolean[][] butacas;

    public Sala(int numero, Pelicula pelicula, int filas, int columnas) {
        this.numero = numero;
        this.pelicula = pelicula;
        this.butacas = new boolean[filas][columnas];

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int id) {
        this.numero = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public boolean[][] getButacas() {
        return butacas;
    }

    public void setButacas(boolean[][] butacas) {
        this.butacas = butacas;
    }
}
