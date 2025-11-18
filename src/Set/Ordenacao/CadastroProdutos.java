package Set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(
        long cod, 
        String nome, 
        double preco, 
        int quantidade) {
        
            produtos.add(new Produto(
                cod, 
                nome, 
                preco, 
                quantidade));
            System.out.println("Produto " + nome + " adicionado com sucesso!");    
    }
    
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;    
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(Comparator.comparing(Produto::getQuantidade));
        produtosPorQuantidade.addAll(produtos);
        return produtosPorQuantidade;
    }

    public Set<Produto> exibirProdutosPorCod() {
        //Set<Produto> produtosPorCod = new TreeSet<>(Comparator.comparing(Produto::getCod));
        Set<Produto> produtosPorCod = new TreeSet<>(
            (p1, p2) -> Long.compare(p1.getCod(), p2.getCod())
        );
        produtosPorCod.addAll(produtos);
        return produtosPorCod;
    }

    

    public static void main(String[] args) {
        CadastroProdutos cad = new CadastroProdutos();

        cad.adicionarProduto(1029384756, "Notebook", 2500, 10);
        cad.adicionarProduto(1229384346, "Smartphone", 1500, 20);
        cad.adicionarProduto(1329382346, "Tablet", 2000, 5);
        cad.adicionarProduto(1429383426, "Mouse", 300, 60);
        cad.adicionarProduto(1429383426, "Mouse", 200, 40);
        cad.adicionarProduto(1629383466, "Fone", 400, 20);
        cad.adicionarProduto(1629082460, "Teclado", 300, 23);

        System.out.println();

        System.out.println(cad.exibirProdutosPorNome());

        System.out.println();

        System.out.println(cad.exibirProdutosPorPreco());

        System.out.println();

        System.out.println(cad.exibirProdutosPorQuantidade());

        System.out.println();

        System.out.println(cad.exibirProdutosPorCod());

        


    }
}
