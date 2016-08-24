package tk.seijas.color_test;

/**
 * Created by Seijas on 24/08/2016.
 */
public class Cita {

    private String texto;
    private String autor;

    public Cita(String texto, String autor) {
        this.texto = texto;
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
