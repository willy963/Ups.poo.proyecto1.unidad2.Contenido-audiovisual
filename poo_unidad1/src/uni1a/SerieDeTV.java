/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {

    private int temporadas;
    private ArrayList<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos,
                     String genero, int temporadas) {

        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Cantidad de temporadas: " + temporadas);

        System.out.println("Detalle de temporadas:");

        for (Temporada temporada : listaTemporadas) {
            System.out.println("- " + temporada);
        }

        System.out.println();
    }
}