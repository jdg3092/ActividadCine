public class Sala {
    /**
     * Los atributos de la clase sala, teniendo butacas como una matriz e boolean
     */
    private int numero;
    private Pelicula pelicula;
    private boolean[][] butacas;

    /**
     * Contructor para crear en el main la sala
     * @param numero el numero de la sala
     * @param pelicula llamamos a la clase Pelicula que se proyectara en la Sala
     * @param filas numero de filas que tendra la sala en la matriz
     * @param columnas numero de columas que tendra la sala en la matriz
     */
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

    /**
     * Metodo para reservar la butaca
     * @param fila el numero de fila de la matriz
     * @param columna el numero de la columna de la matriz
     * @return retornara false si fila/columna no existe en la matriz o ya esta ocupada y true si esta vacia.
     *
     */
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

    /**
     * Metodo que mostrara la matriz con los sitios o libres u ocupados
     */
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
