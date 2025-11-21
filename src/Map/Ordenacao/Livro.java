public class Livro {
    private String titulo;
    private String autor;
    private float preco;

    public Livro(String titulo, String autor,  float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " - Autor: " + autor + " - Preço: R$" + preco;
    }

    

}
