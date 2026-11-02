package uni1a;

public class Videopodcast extends ContenidoAudiovisual {

    private String presentador;
    private String plataforma;
    private int episodios;

    public Videopodcast(String titulo, int duracionEnMinutos,
            String genero, String presentador,
            String plataforma, int episodios) {

        super(titulo, duracionEnMinutos, genero);

        this.presentador = presentador;
        this.plataforma = plataforma;
        this.episodios = episodios;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del videopodcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Presentador: " + presentador);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Episodios: " + episodios);
        System.out.println();
    }
}