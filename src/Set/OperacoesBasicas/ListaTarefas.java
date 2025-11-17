package Set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa '" + descricao + "' adicionada à lista.");
        System.out.println("-".repeat(60));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
        /*Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        tarefas.remove(tarefaParaRemover);*/
    System.out.println("Tarefa '" + descricao + "' removida da lista.");
    System.out.println("-".repeat(60));
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista!");
            return;
        }
        for (Tarefa t : tarefas) {
            System.out.println(t.getDescricao() + " - " + (t.isConcluida() ? "Concluída" : "Pendente"));
        }
        System.out.println("-".repeat(60));
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public void obterTarefasConcluidas() {
        int count = 0;
        System.out.println("Tarefas Concluídas:");   
        for (Tarefa t : tarefas) {
            if (t.isConcluida()) {
                count++;
                System.out.println(t.getDescricao());
            }
        }
        if (count == 0) {
            System.out.println("Nenhuma tarefa concluída!");
        }
        System.out.println("-".repeat(60));
    }

    public void obterTarefasPendentes() {
        int count = 0;
        System.out.println("Tarefas Pendentes:");
        for (Tarefa t : tarefas) {
            if (!t.isConcluida()) {
                count++;
                System.out.println(t.getDescricao());
            }
        }
        if (count == 0) {
            System.out.println("Nenhuma tarefa pendente!");
        }
        System.out.println("-".repeat(60));
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                System.out.println("Tarefa '" + descricao + "' marcada como concluída.");
                break;
            }
        }
        System.out.println("-".repeat(60));
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                System.out.println("Tarefa '" + descricao + "' marcada como pendente.");
                break;
            }
        }
        System.out.println("-".repeat(60));
    }

    public void limparListaTarefas() {
        tarefas.clear();
        System.out.println("Lista de tarefas limpa comsucesso!");
        System.out.println("-".repeat(60));
    }

    public static void main(String[] args) {
        
        System.out.println("-".repeat(60));

        ListaTarefas toDoList = new ListaTarefas();

        toDoList.adicionarTarefa("Estudar Java Collections");
        toDoList.adicionarTarefa("Fazer exercícios de programação");
        toDoList.adicionarTarefa("Ler documentação da API Java");

        toDoList.exibirTarefas();

        toDoList.marcarTarefaConcluida("Estudar Java Collections");
        toDoList.removerTarefa("Ler documentação da API Java");

        toDoList.exibirTarefas();

        toDoList.adicionarTarefa("Ler documentação Copilot");
        toDoList.adicionarTarefa("Fazer manutenção Fedora 43");
        toDoList.adicionarTarefa("Fazer manutenção Fedora 43");

        toDoList.marcarTarefaPendente("Estudar Java Collections");
        toDoList.marcarTarefaConcluida("Ler documentação Copilot");

        toDoList.obterTarefasConcluidas();
        toDoList.obterTarefasPendentes();



    }

}
