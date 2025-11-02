package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private final List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
        System.out.println("-".repeat(50));
        System.out.println(descricao + ", adicionado com sucesso!");
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        System.out.println("-".repeat(50));
        System.out.println(descricao + ", removido com sucesso!");
    }

    public int obterNumeroTotalTarefas() {
        System.out.println("-".repeat(50));
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println("-".repeat(50));
        //for (int i = 0; i < tarefaList.size(); i++) {
        //    System.out.printf("%d - %s.\n", i + 1, tarefaList.get(i).getDescricao());
        //}
        System.out.println(tarefaList);
    }


}
