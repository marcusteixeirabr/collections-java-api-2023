package Set.OpoeracoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatosSet;

    public AgendaContatos() {
        contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        if (contatosSet.isEmpty()) {
            System.out.println("A agenda de contatos está vazia!");
            return;
        }
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().contains(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.AtualizaTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Marcus", 999911325);
        agenda.adicionarContato("Joana", 945911377);
        agenda.adicionarContato("Abílio", 939910025);
        agenda.adicionarContato("Carol", 995915355);
        agenda.adicionarContato("José", 979911026);
        agenda.adicionarContato("Gabi", 989811424);
        agenda.adicionarContato("Gabi", 33982421);
        agenda.adicionarContato("Gabi Pet", 33982421);
        agenda.adicionarContato("Gabi Java", 99982499);



        agenda.exibirContatos();

        System.out.println();
        System.out.println(agenda.pesquisarPorNome("Gabi"));
        System.out.println();

        agenda.atualizarNumeroContato("Gabi", 912341234);

        agenda.exibirContatos();

    }
}


