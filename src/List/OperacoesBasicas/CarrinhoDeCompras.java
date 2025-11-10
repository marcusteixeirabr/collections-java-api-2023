package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> comprasList;

    public CarrinhoDeCompras() {
        comprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        comprasList.add(new Item(nome, preco, quantidade));
        System.out.println(nome + ", item adicionado com sucesso!");
    }

    public void removerItem(String nome) {
        List<Item> listaParaRemover = new ArrayList<>();
        for (Item l : comprasList) {
            if (l.getNome().equalsIgnoreCase(nome)) {
                listaParaRemover.add(l);
            }
        }
        comprasList.removeAll(listaParaRemover);
        System.out.println(nome + ", item removido com sucesso!");
    }

    public void calcularValorTotal() {
        double soma = 0.0;
        for (Item l : comprasList) {
            soma += l.getQuantidade() * l.getPreco();
        }
        System.out.printf("O valor total das sua compra é R$ %.2f\n", soma);;
    }

    public void exibirItens() {
        System.out.println(comprasList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();

        meuCarrinho.exibirItens();

        meuCarrinho.adicionarItem("Detergente (500ml)", 2.65, 12 );
        meuCarrinho.adicionarItem("Água sanitária (2l)", 5.65, 2 );
        meuCarrinho.adicionarItem("Batata (kg)", 3.92, 1 );
        meuCarrinho.adicionarItem("Cebola (kg)", 5.92, 1 );

        meuCarrinho.exibirItens();

        meuCarrinho.calcularValorTotal();

        meuCarrinho.removerItem("Cebola (kg)");

        meuCarrinho.exibirItens();

        meuCarrinho.calcularValorTotal();

    }


}
