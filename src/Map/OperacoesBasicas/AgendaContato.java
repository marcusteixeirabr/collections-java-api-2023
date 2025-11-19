package Map.OperacoesBasicas;

import java.util.Map;
import java.util.HashMap;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
        System.out.println("Contato " + nome + " adicionado com sucesso!");
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
            System.out.println("Contato " + nome + " removido com sucesso!");
        } else {
            System.out.println("A agenda está vazia. Não há contatos para remover!");
        }
        
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap); 
        } else {
            System.out.println("A agenda está vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer telefonePorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            telefonePorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("A agenda está vazia.");
        }
        return telefonePorNome;
    }

    public static void main(String[] args) {

        AgendaContato agenda = new AgendaContato();
        
        // Adicionando contatos
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        
        // Exibindo contatos
        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();
        
        // Removendo um contato
        agenda.removerContato("Alice");
        
        // Exibindo contatos após remoção
        System.out.println("Contatos na agenda após remoção:");
        agenda.exibirContatos();
        
        // Tentando remover de uma agenda vazia
        agenda.removerContato("Bob");
        agenda.removerContato("Charlie");
    }
}