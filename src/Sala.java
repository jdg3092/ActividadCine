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

    public boolean reservarButaca(int fila, int columna) {
        if (fila < 0 || fila >= butacas.length || columna < 0 || columna >= butacas[0].length) {
            System.out.println("Error! No existe Butaca ");
            return false;
        }
        if (butacas[fila][columna]) {
            System.out.println("La butaca esta ocupada.");
            return false;
        }

        butacas[fila][columna] = true;
        return true;
    }

    public void mostrarEstadoButacas() {
        System.out.println("Estado de las butacas en la sala " + numero + ":");
        System.out.println("-----------------------------------------");
        for (int i = 1; i < butacas.length; i++) {
            for (int j = 1; j < butacas[i].length; j++) {
                if (butacas[i][j]) {
                    System.out.print(" X"); // Butaca ocupada
                } else {
                    System.out.print(" O"); // Butaca libre
                }

            }
            System.out.println();

        }
    }
}
