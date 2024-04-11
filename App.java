// comentario de una sola linea

/* comentario de varias lineas*/

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Peliculas: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;

        System.out.println(media);
    
    String sinopsis = """
    Matrix es una paradoja la mejo pelcula del milenio.
    """ + fechaDeLanzamiento;
    
    System.out.println(sinopsis);
    
    }
}
