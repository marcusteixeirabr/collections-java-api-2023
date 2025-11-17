package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
        System.out.println("Palavra '" + palavra + "' adicionada com sucesso!");
        System.out.println("-".repeat(30));
    }

    public void removerPalavra(String palavra) {
        if (palavras.isEmpty()) {
            System.out.println("A lista de palavras está vazia!");
            return;
        }
        if (!palavras.contains(palavra)) {
            System.out.println("Palavra '" + palavra + "' não foi encontrada na lista!");
            return;
        }
        palavras.remove(palavra);
        System.out.println("Palavra '" + palavra + "' foi removida com sucesso!");
    }

    public boolean verificarPalavra(String palavra) {
        return (palavras.contains(palavra));
    }

    public void exibirPalavrasUnicas() {
        if (palavras.isEmpty()) {
            System.out.println("A lista de palavras está vazia!");
            return;
        }
        System.out.println(palavras);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas p1 = new ConjuntoPalavrasUnicas();

        p1.adicionarPalavra("Teste");
        p1.adicionarPalavra("Poste");
        p1.adicionarPalavra("Pedra");
        p1.adicionarPalavra("Calota");
        p1.adicionarPalavra("Pneu");

        p1.exibirPalavrasUnicas();

        System.out.println("A palavra 'Podre' está na lista?");
        System.out.println(p1.verificarPalavra("Podre") ? "sim" : "não");

        System.out.println("A palavra 'Pneu' está na lista?");
        System.out.println(p1.verificarPalavra("Pneu") ? "sim" : "não");

        p1.removerPalavra("Pneu");

        System.out.println("A palavra 'Pneu' está na lista?");
        System.out.println(p1.verificarPalavra("Pneu") ? "sim" : "não");

    }

}
