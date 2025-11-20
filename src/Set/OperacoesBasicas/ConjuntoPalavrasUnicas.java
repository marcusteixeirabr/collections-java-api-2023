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

    /**
     * Adiciona palavras únicas de um texto ao conjunto.
     * 
     * Este método utiliza o regex "\\W+" para dividir o texto em palavras.
     * 
     * Explicação do regex "\\W+":
     * - \W (barra dupla devido ao escape em Java): representa um caractere NÃO-palavra
     *   (qualquer caractere que não seja letra, dígito ou underscore)
     * - +: indica uma ou mais ocorrências do padrão anterior
     * 
     * Portanto, "\\W+" corresponde a uma sequência de um ou mais caracteres 
     * não-palavra (como espaços, pontuação, símbolos), que são usados como 
     * delimitadores para separar as palavras do texto.
     * 
     * Exemplo: "Olá, mundo! Bem-vindo ao Java." será dividido em:
     * ["Olá", "mundo", "Bem", "vindo", "ao", "Java"]
     * 
     * @param texto O texto do qual as palavras serão extraídas
     */
    public void adicionarPalavrasDeTexto(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            System.out.println("O texto fornecido está vazio ou é nulo!");
            return;
        }
        
        // Split usando o regex \\W+ para separar por caracteres não-palavra
        String[] palavrasArray = texto.split("\\W+");
        
        int palavrasAdicionadas = 0;
        for (String palavra : palavrasArray) {
            if (!palavra.isEmpty()) {
                boolean adicionada = palavras.add(palavra);
                if (adicionada) {
                    palavrasAdicionadas++;
                }
            }
        }
        
        System.out.println("Total de palavras únicas adicionadas do texto: " + palavrasAdicionadas);
        System.out.println("-".repeat(30));
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

        System.out.println("\n" + "=".repeat(50));
        System.out.println("DEMONSTRAÇÃO DO MÉTODO adicionarPalavrasDeTexto()");
        System.out.println("Usando o regex \\W+ para separar palavras de um texto");
        System.out.println("=".repeat(50) + "\n");

        // Demonstração do uso do regex \\W+ no método split()
        ConjuntoPalavrasUnicas p2 = new ConjuntoPalavrasUnicas();
        
        String textoExemplo = "Olá, mundo! Bem-vindo ao Java. Este é um exemplo de texto com pontuação, números 123 e símbolos @#$%.";
        System.out.println("Texto original: " + textoExemplo);
        System.out.println();
        
        p2.adicionarPalavrasDeTexto(textoExemplo);
        
        System.out.println("\nPalavras únicas extraídas do texto:");
        p2.exibirPalavrasUnicas();

    }

}
