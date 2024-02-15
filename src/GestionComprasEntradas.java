import java.util.Scanner;

public class GestionComprasEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Contruccion  del cine
         */
        Cine cine = new Cine("Cine Renoir", 1000, 5);

        /**
         * Construccion de las peliculas
         */
        Pelicula pelicula1 = new Pelicula("The Dark Knight", 150);
        Pelicula pelicula2 = new Pelicula("Lord of the Rings", 300);
        Pelicula pelicula3 = new Pelicula("300", 120);
        Pelicula pelicula4 = new Pelicula("Gladiator", 100);
        Pelicula pelicula5 = new Pelicula("Inception", 180);

        /**
         * Contruccion de las salas donde estan las peliculas
         */
        Sala sala1 = new Sala(1, pelicula1, 10, 20);
        Sala sala2 = new Sala(2, pelicula2, 10, 20);
        Sala sala3 = new Sala(3, pelicula3, 10, 20);
        Sala sala4 = new Sala(4, pelicula4, 10, 20);
        Sala sala5 = new Sala(5, pelicula5, 10, 20);

        /**
         * Llamada al metodo donde se agrega la salas
         */
        cine.agregarSala(sala1);
        cine.agregarSala(sala2);
        cine.agregarSala(sala3);
        cine.agregarSala(sala4);
        cine.agregarSala(sala5);
        /**
         * Menu para que el usuario pueda interactuar con las opciones
         */
        boolean seguir = true;
        while (seguir == true) {
            System.out.println("Bienvenido al Cine Renoir");
            System.out.println("1. Ver la informacion de las peliculas emitidas");
            System.out.println("2. Reservar entrada");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    /**
                     * LLamada al metodo donde se muestra la informacion que hay en cada sala que agregaste anteriormente
                     */
                    cine.mostrarInformacionSalas();
                    break;
                case 2:
                    /**
                     * Opcion donde se puede rervar butacas donde el usuario elige, la sala, la fila, la columna y el email
                     * Y el codigo llama al metodo de reserva y de mostrar como quedaria la matriz de las butacas
                     */
                    boolean comprobacion = false;
                    System.out.print("Selecciona la sala a la que quieres acceder (1. Sala 1, 2. Sala 2, 3. Sala 3, 4. Sala 4, 5. Sala 5): ");
                    while (!comprobacion) {
                        int seleccionSala = sc.nextInt();
                        System.out.print("Selecciona la fila (1-10): ");
                        int fila = sc.nextInt();
                        System.out.print("Selecciona la columna (1-20): ");
                        int columna = sc.nextInt();
                        System.out.print("Ingrese su email --> ejemplo: hello@gmail.com: ");
                        String email = sc.next();
                        switch (seleccionSala) {
                            case 1:
                                comprobacion = cine.reservarSala(sala1, fila, columna);
                                System.out.println("\nReserva de: " + email + " (Fila:" + fila + " | Columna:" + columna + ")");
                                cine.mostrarButacas(sala1);
                                break;
                            case 2:
                                comprobacion = cine.reservarSala(sala2, fila, columna);
                                System.out.println("\nReserva de: " + email + " (Fila:" + fila + " | Columna:" + columna + ")");
                                cine.mostrarButacas(sala2);
                                break;
                            case 3:
                                comprobacion = cine.reservarSala(sala3, fila, columna);
                                System.out.println("\nReserva de: " + email + " (Fila:" + fila + " | Columna:" + columna + ")");
                                cine.mostrarButacas(sala3);
                                break;
                            case 4:
                                comprobacion = cine.reservarSala(sala4, fila, columna);
                                System.out.println("\nReserva de: " + email + " (Fila:" + fila + " | Columna:" + columna + ")");
                                cine.mostrarButacas(sala4);
                                break;
                            case 5:
                                comprobacion = cine.reservarSala(sala5, fila, columna);
                                System.out.println("\nReserva de: " + email + " (Fila:" + fila + " | Columna:" + columna + ")");
                                cine.mostrarButacas(sala5);
                                break;
                        }
                        if (comprobacion == false) {
                            System.out.println("\nEscoja de nuevo. (1. Sala 1, 2. Sala 2, 3. Sala 3, 4. Sala 4, 5. Sala 5)");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Saliendo de la aplicacion. Hasta luego");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione otra opcion");
            }

        }


    }
}
