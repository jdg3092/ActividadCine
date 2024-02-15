public class Cine {
    private String nombre;
    private int aforo;
    private Sala[] salas;
    private int cantidadSalas;

    /**
     * Constructor para crear en el main el cine
     * @param nombre el nombre del cine
     * @param aforo el aforo que tiene
     * @param cantidadSalas y la cantidad de salas que puede tener
     */
    public Cine(String nombre, int aforo, int cantidadSalas) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.cantidadSalas = cantidadSalas;
        this.salas = new Sala[cantidadSalas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public int getCantidadSalas() {
        return cantidadSalas;
    }

    public void setCantidadSalas(int cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }

    /**
     * Metodo para poder agregar las salas
     * @param sala la clase Sala que se agregara
     */
    public void agregarSala(Sala sala) {
        if (sala.getNumero() >= 1 && sala.getNumero() <= cantidadSalas) {
            salas[sala.getNumero() - 1] = sala;
        } else {
            System.out.println("El numero de salas esta fuera de rango.");
        }
    }

    /**
     * Metodo para mostrar el array de as salas donde saldra el numero de sala y la pelicula que tiene dicha sala
     */
    public void mostrarInformacionSalas() {
        System.out.println("Informacion de las salas:");
        for (int i = 0; i < salas.length; i++) {
            if (salas[i] != null) {
                System.out.println("Sala " + salas[i].getNumero() + ": " + salas[i].getPelicula().getTitulo());
            } else {
                System.out.println("Sala " + (i + 1) + ": No hay informacion disponible");
            }

        }
    }

    /**
     * Metodo que recupera el metodo de otra clase
     * @param sala se selecciona la sala
     * @param fila se seleciona la fila
     * @param columna se selecciona la columna
     * @return el metodo para reservar butacas que esta dentro de clase Sala
     */
    public boolean reservarSala(Sala sala, int fila, int columna) {
        return sala.reservarButaca(fila, columna);

    }

    /**
     * Metodo para recuperar metodo de mostrame la matriz que muestra las butacas
     * @param sala se selecciona la sala
     */
    public void mostrarButacas(Sala sala) {
        sala.mostrarEstadoButacas();
    }
}
