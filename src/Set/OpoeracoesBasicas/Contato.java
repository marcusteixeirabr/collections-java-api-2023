package Set.OpoeracoesBasicas;

import java.util.Objects;

public class Contato {
    private final String nome;
    private int telefone;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object c) {
        if (c == null || getClass() != c.getClass()) return false;
        Contato contato = (Contato) c;
        return getNome().equalsIgnoreCase(contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    public String getNome(){
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void AtualizaTelefone(int novoNumero) {
        telefone = novoNumero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
