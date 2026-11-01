package uni1a;

public class Temporada {

    private int numeroTemporada;
    private int cantidadEpisodios;
    private int anioEstreno;
    private String descripcion;

    public Temporada(int numeroTemporada,
                     int cantidadEpisodios,
                     int anioEstreno,
                     String descripcion) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
        this.anioEstreno = anioEstreno;
        this.descripcion = descripcion;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Temporada " + numeroTemporada
                + " - Episodios: " + cantidadEpisodios
                + " - Año: " + anioEstreno
                + " - Descripción: " + descripcion;
    }
}