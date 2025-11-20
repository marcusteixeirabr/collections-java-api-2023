package Map.OperacoesBasicas;

public class Produto {
    private String nome;
    private int quantidade;
    private float preco;

    public Produto(String nome, int quantidade, float preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(nome);
        sb.append(", ").append(quantidade);
        sb.append(", ").append(preco);
        sb.append('}');
        return sb.toString();
    }



}
