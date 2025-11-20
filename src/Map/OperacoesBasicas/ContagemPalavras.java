package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagem;

    public ContagemPalavras() {
        contagem = new HashMap<>();
    }

    public void adicionarPalavra(String palavra) {
        contagem.put(palavra, 0);
    }

    public void removerPalavra(String palavra) {
        if (contagem.isEmpty()) {
            System.out.println("Não há palavras registradas.");
        }
        if (!contagem.containsKey(palavra)) {
            System.out.println("A palavra '" + palavra + "' não está registrada.");
        }
        contagem.remove(palavra);
        System.out.println("A palavra '" + palavra + "' foi removida.");
    }

    public void exibirContagemPalavras() {
        if (contagem.isEmpty()) {
            System.out.println("Nenhuma palavra registrada.");
        }
        for (String p : contagem.keySet()) {
            System.out.println("Palavra: '" + p + "', Contagem: " + contagem.get(p));
        }       
    }

    public void encontrarPalavraMaisFrequente(String texto) {
        //String[] palavras = texto.split(" ");
        String[] palavras = texto.split("\\W+");
        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra.toLowerCase(), 0) + 1);
        }
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (String p : contagem.keySet()) {
            if (contagem.get(p) > maiorContagem) {
                maiorContagem = contagem.get(p);
                palavraMaisFrequente = p;
            }
        }
        System.out.println("A palavra mais frequente é '" + palavraMaisFrequente + "' com contagem: " + maiorContagem);
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        String texto = "Exemplo.de texto com palavras exemplo de texto exemplo";
        contagemPalavras.encontrarPalavraMaisFrequente(texto);
        contagemPalavras.exibirContagemPalavras();
    }
    
}
