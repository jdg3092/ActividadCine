public class Cine {
    private String nombre;
    private int aforo;
    private Sala[] salas;
    private int cantidadSalas;

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

    public void agregarSala(Sala sala) {
        if (sala.getNumero() >= 1 && sala.getNumero() <= cantidadSalas) {
            salas[sala.getNumero() - 1] = sala;
        } else {
            System.out.println("El numero de salas esta fuera de rango.");
        }
    }

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

    public boolean reservarSala(Sala sala, int fila, int columna) {
        return sala.reservarButaca(fila, columna);

    }

    public void mostrarButacas(Sala sala) {
        sala.mostrarEstadoButacas();
    }
}
