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
}
