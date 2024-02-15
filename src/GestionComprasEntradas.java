import java.util.Scanner;

public class GestionComprasEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cine cine = new Cine("Cine Renoir", 1000, 5);

        Pelicula pelicula1 = new Pelicula("The Dark Knight", 150);
        Pelicula pelicula2 = new Pelicula("Lord of the Rings", 300);
        Pelicula pelicula3 = new Pelicula("300", 120);
        Pelicula pelicula4 = new Pelicula("Gladiator", 100);
        Pelicula pelicula5 = new Pelicula("Inception", 180);

        Sala sala1 = new Sala(1, pelicula1, 10, 20);
        Sala sala2 = new Sala(2, pelicula2, 10, 20);
        Sala sala3 = new Sala(3, pelicula3, 10, 20);
        Sala sala4 = new Sala(4, pelicula4, 10, 20);
        Sala sala5 = new Sala(5, pelicula5, 10, 20);

        cine.agregarSala(sala1);
        cine.agregarSala(sala2);
        cine.agregarSala(sala3);
        cine.agregarSala(sala4);
        cine.agregarSala(sala5);


    }
}
