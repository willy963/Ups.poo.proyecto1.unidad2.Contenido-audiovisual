package uni1a;

public class Videojuegos extends ContenidoAudiovisual {

    private String desarrollador;
    private String plataforma;
    private String modoJuego;

    public Videojuegos(String titulo, int duracionEnMinutos,
            String genero, String desarrollador,
            String plataforma, String modoJuego) {

        super(titulo, duracionEnMinutos, genero);

        this.desarrollador = desarrollador;
        this.plataforma = plataforma;
        this.modoJuego = modoJuego;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getModoJuego() {
        return modoJuego;
    }

    public void setModoJuego(String modoJuego) {
        this.modoJuego = modoJuego;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del videojuego:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Desarrollador: " + desarrollador);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Modo de juego: " + modoJuego);
        System.out.println();
    }
}