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
    }











    public static void main(String[] args) {
        
    }

}
