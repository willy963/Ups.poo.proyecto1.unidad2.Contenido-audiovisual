/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;

public class Documental extends ContenidoAudiovisual {

    private String tema;
    private ArrayList<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos,
                       String genero, String tema) {

        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);

        System.out.println("Investigadores participantes:");

        for (Investigador investigador : investigadores) {
            System.out.println("- " + investigador);
        }

        System.out.println();
    }
}