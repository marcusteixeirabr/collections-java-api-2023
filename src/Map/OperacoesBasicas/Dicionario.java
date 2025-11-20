package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioPalavras;

    public Dicionario() {
        dicionarioPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioPalavras.put(palavra, definicao);
        System.out.println("palavra '" + palavra + "' adicionada com a seguinte definição: " + definicao);
    }

    public void removerPalavra(String palavra) {
        if (dicionarioPalavras.isEmpty()) {
            System.out.println("O dicionário está vazio. Nenhuma palavra para remover.");
            return;
        }
        if (!dicionarioPalavras.containsKey(palavra)) {
            System.out.println("A palavra '" + palavra + "' não existe no dicionário.");
            return;
        }
        dicionarioPalavras.remove(palavra);
        System.out.println("palavra '" + palavra + "' removida do dicionário.");
    }

    public void exibirPalavras() {
        if (dicionarioPalavras.isEmpty()) {
            System.out.println("O dicionário está vazio.");
            return;
        }
        System.out.println("Palavras no dicionário:");
        for (String i : dicionarioPalavras.keySet()) {
            System.out.println("Palavra: " + i + " - Definição: " + dicionarioPalavras.get(i));
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        if (!dicionarioPalavras.containsKey(palavra)) {
            System.out.println("A palavra '" + palavra + "' não foi encontrada no dicionário.");
            return null;
        }
        return dicionarioPalavras.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario meuDicionario = new Dicionario();

        meuDicionario.adicionarPalavra("Java", "Uma linguagem de programação orientada a objetos.");
        meuDicionario.adicionarPalavra("Map", "Uma coleção que mapeia chaves para valores.");

        meuDicionario.exibirPalavras();

        String definicao = meuDicionario.pesquisarPorPalavra("Java");
        if (definicao != null) {
            System.out.println("Definição de 'Java': " + definicao);
        }

        meuDicionario.removerPalavra("Map");
        meuDicionario.exibirPalavras();
    }

}
