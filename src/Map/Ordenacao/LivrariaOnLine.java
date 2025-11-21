import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnLine {
    private Map<String, Livro> catalogo;

    public LivrariaOnLine() {
        catalogo = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, float preco) {
        catalogo.put(link, new Livro(titulo, autor, preco));
        System.out.println(titulo + " adicionado ao catálogo!");
    }

    public void removerLivro(String titulo) {
        if (catalogo.isEmpty()) {
        System.out.println("O catálogo está vazio");
        return;
        }
        List<String> linksParaRemover = new ArrayList<>();
        for (String link : catalogo.keySet()) {
            if (catalogo.get(link).getTitulo().equalsIgnoreCase(titulo)) {
                linksParaRemover.add(link);
            }
        }
        if (linksParaRemover.isEmpty()) {
            System.out.println("O livro " + titulo + " não foi encontrado no catálogo.");
            return; 
        }
        catalogo.keySet().removeAll(linksParaRemover);
        System.out.println(titulo + " removido do catálogo!");       
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosPorPreco = new ArrayList<>(catalogo.entrySet());
        livrosPorPreco.sort((p1, p2) -> Float.compare(p1.getValue().getPreco(), p2.getValue().getPreco()));
        for (Map.Entry<String, Livro> entry : livrosPorPreco) {
            Livro livro = entry.getValue();
            System.out.println(livro);
        }
    }

    public void exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosPorAutor = new ArrayList<>(catalogo.entrySet());
        livrosPorAutor.sort((a1, a2) -> a1.getValue().getAutor().compareTo(a2.getValue().getAutor()));
        for (Map.Entry<String, Livro> entry : livrosPorAutor) {
            Livro livro = entry.getValue();
            System.out.println(livro);
        }
    }

    public void pesquisarLivrosPorAutor(String autor) {
        for (Livro livro : catalogo.values()) {
            if (livro.getAutor().equals(autor)) {
                System.out.println(livro);
            }
        }
    }

    public void obterLivrosMaisCaros() {
        if (catalogo.isEmpty()) {
            System.out.println("O catálogo está vazio.");
            return;
        }
        float maiorPreco = Float.MIN_VALUE;
        for (Livro livro : catalogo.values()) {
            if (livro.getPreco() > maiorPreco) {
                maiorPreco = livro.getPreco();
            }
        }
        for (Livro livro : catalogo.values()) {
            if (livro.getPreco() == maiorPreco) {
                System.out.println(livro);
            }
        }
    }

    public void obterLivrosMaisBaratos() {
        if (catalogo.isEmpty()) {
            System.out.println("O catálogo está vazio.");
            return;
        }
        float livroMaisBarato = Float.MAX_VALUE;
        for (Livro livro : catalogo.values()) {
            if (livro.getPreco() < livroMaisBarato) {
                livroMaisBarato = livro.getPreco();
            }
        }
        for (Livro livro : catalogo.values()) {
            if (livro.getPreco() == livroMaisBarato) {
                System.out.println(livro);
            }
        }
    }

    public static void main(String[] args) {
        LivrariaOnLine livraria = new LivrariaOnLine();
        livraria.adicionarLivro("link1", "Java Basics", "Author A", 59.90f);
        livraria.adicionarLivro("link2", "Advanced Java", "Author B", 89.90f);
        livraria.adicionarLivro("link3", "Data Structures", "Author A", 39.90f);

        System.out.println("\nLivros ordenados por preço:");
        livraria.exibirLivrosOrdenadosPorPreco();

        String autorPesquisa = "Author A";
        System.out.println("\nLivros de " + autorPesquisa + ":");
        livraria.pesquisarLivrosPorAutor(autorPesquisa);

        System.out.println("\nLivros mais caros:");
        livraria.obterLivrosMaisCaros();

        System.out.println("\nLivros mais baratos:");
        livraria.obterLivrosMaisBaratos();

        System.out.println("**************************");

        LivrariaOnLine livrariaOnline = new LivrariaOnLine();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50f);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05f);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99f);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5f);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50f);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5f);

        System.out.println("==========================");

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço:");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println("==========================");

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor:");
        livrariaOnline.exibirLivrosOrdenadosPorAutor();
        
        System.out.println("==========================");

        // Pesquisa livros por autor
        autorPesquisa = "Josh Malerman";
        System.out.println("Livros de " + autorPesquisa + ":");
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        System.out.println("==========================");

        // Obtém e exibe o livro mais caro
        System.out.println("Livros mais caros:");
        livrariaOnline.obterLivrosMaisCaros();

        System.out.println("==========================");

        // Obtém e exibe o livro mais barato
        System.out.println("Livros mais baratos:");
        livrariaOnline.obterLivrosMaisBaratos();
        
        System.out.println("==========================");

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");

        System.out.println("==========================");

        // Exibe todos os livros ordenados por preço após a remoção
        System.out.println("Livros ordenados por preço:");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

    }
}
