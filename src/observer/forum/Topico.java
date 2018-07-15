package observer.forum;

public class Topico {

    private String titulo, conteudo;

    public Topico() {
    }

    public Topico(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Topico{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
