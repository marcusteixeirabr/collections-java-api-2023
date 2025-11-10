package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> pesquisa = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    pesquisa.add(l);
                }
            }
        }
        return pesquisa;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> pesquisa = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    pesquisa.add(l);
                }
            }
        }
        return pesquisa;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro pesquisa = null;
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    pesquisa = l;
                    break;
                }
            }
        }
        return pesquisa;
    }

    public static void main(String[] args) {

        CatalogoLivros meuCatalogo = new CatalogoLivros();

        meuCatalogo.adicionarLivro("1984", "George Orwell", 1949);
        meuCatalogo.adicionarLivro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);
        meuCatalogo.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        meuCatalogo.adicionarLivro("O Guia do Mochileiro das Galáxias", "Douglas Adams", 1979);
        meuCatalogo.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        meuCatalogo.adicionarLivro("A Culpa é das Estrelas", "John Green", 2012);
        meuCatalogo.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        meuCatalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        meuCatalogo.adicionarLivro("Razão e Sensibilidade", "Jane Austen", 1811);
        meuCatalogo.adicionarLivro("Quem é Você, Alasca?", "John Green", 2005);

        System.out.println(meuCatalogo.pesquisarPorAutor("George Orwell"));
        System.out.println(meuCatalogo.pesquisarPorIntervaloAnos(1970, 2020));
        System.out.println(meuCatalogo.pesquisarPorTitulo("1984"));




    }
}
