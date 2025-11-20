package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoque;

    public EstoqueProduto() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, float preco) {
        estoque.put(cod, new Produto(nome, quantidade, preco));
        System.out.println("Produto " + nome + " adicionado com sucesso!");
    }

    public void exibirProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque etá vazio!");
        }
        for (long cod : estoque.keySet()) {
            System.out.println(estoque.get(cod));
        }
    }

    public float calcularValorTotalEstoque() {
        float valorTotal = 0;
        for (Produto p : estoque.values()) {
            valorTotal += p.getQuantidade() * p.getPreco(); 
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        float maiorPreco = Float.MIN_VALUE;
        Produto nomeProdutoMaisCaro = null;
        for (Produto p : estoque.values()) {
            if (p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
                nomeProdutoMaisCaro = p;
            }
        }
        return nomeProdutoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        float menorPreco = Float.MAX_VALUE;
        Produto nomeProdutoMaisBarato = null;
        for (Produto p : estoque.values()) {
            if (p.getPreco() < menorPreco) {
                menorPreco = p.getPreco();;
                nomeProdutoMaisBarato = p;
            }
        }
        return nomeProdutoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        float maiorValorTotal = Float.MIN_VALUE;
        Produto nomeProdutoMaiorValorTotal = null;
        for (Produto p : estoque.values()) {
            float valorTotalProduto = p.getQuantidade() * p.getPreco();
            if (valorTotalProduto > maiorValorTotal) {
                maiorValorTotal = valorTotalProduto;
                nomeProdutoMaiorValorTotal = p;
            }
        }
        return nomeProdutoMaiorValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.adicionarProduto(1001,"Caneta" , 50, 2.5f);
        estoque.adicionarProduto(1002,"Caderno" , 30, 15.0f);
        estoque.adicionarProduto(1003,"Mochila" , 20, 120.0f);
        estoque.adicionarProduto(1004,"Lápis" , 100, 1.0f);

        estoque.exibirProdutos();

        System.out.println("O valor total do estoque R$ " + estoque.calcularValorTotalEstoque());

        System.out.println("O produto mais caro do estoque é: " + estoque.obterProdutoMaisCaro().getNome());

        System.out.println("O produto mais barato do estoque é: " + estoque.obterProdutoMaisBarato().getNome());

        System.out.println("O produto com maior valor total em estoque é: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque().getNome());
    }
  
}
