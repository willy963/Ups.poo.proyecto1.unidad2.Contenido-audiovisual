package poo;

import uni1a.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {

        System.out.println("Hello from Eclipse!");

        // Crear película
        Pelicula pelicula = new Pelicula(
                "Avatar", 125, "Accion", "20th Century Studios");

        pelicula.agregarActor(
                new Actor("Sam", "Worthington", 50, "Australiano"));

        pelicula.agregarActor(
                new Actor("Zoe", "Saldana", 48, "Estadounidense"));

        // Crear serie de televisión
        SerieDeTV serie = new SerieDeTV(
                "Game of Thrones", 60, "Fantasy", 8);

        serie.agregarTemporada(
                new Temporada(1, 10, 2011, "Primera temporada"));

        serie.agregarTemporada(
                new Temporada(2, 10, 2012, "Segunda temporada"));

        // Crear documental
        Documental documental = new Documental(
                "Cosmos", 45, "Science", "Astronomy");

        documental.agregarInvestigador(
                new Investigador("Carl", "Sagan",
                        "Astronomia", "Cornell University"));

        documental.agregarInvestigador(
                new Investigador("Neil", "Tyson",
                        "Astrofisica", "American Museum"));

        // Crear arreglo de contenidos audiovisuales
        ContenidoAudiovisual[] contenidos =
                new ContenidoAudiovisual[3];

        contenidos[0] = pelicula;
        contenidos[1] = serie;
        contenidos[2] = documental;

        // Mostrar detalles
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}