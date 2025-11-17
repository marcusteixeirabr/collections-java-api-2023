package List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "nome = '" + nome + "'" +
             ",\t idade = " + idade +
             ",\t altura = " + altura +
             "\n";
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Float.compare(p1.getAltura(), p2.getAltura());
    }
}
