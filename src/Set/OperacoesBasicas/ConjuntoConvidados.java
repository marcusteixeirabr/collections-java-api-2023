package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado desconvidado = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                desconvidado = c;
                System.out.println(c.getNome() + " (convite: " + c.getCodigoConvite() + ") desconvidado com sucesso!");
                convidados.remove(desconvidado);
                break;
            }
        }
        if (desconvidado == null) {
            System.out.println("Código de convite inexistente.");
        }
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        for (Convidado c : convidados) {
            System.out.println(c.getNome() + "\tConvite: " + c.getCodigoConvite());
        }
    }

    public static void main(String[] args) {

        ConjuntoConvidados convite = new ConjuntoConvidados();

        convite.adicionarConvidado("Pedro", 1234);
        convite.adicionarConvidado("Maria", 1234);
        convite.adicionarConvidado("Marco", 1123);
        convite.adicionarConvidado("Pietra", 1165);
        convite.adicionarConvidado("João", 1177);

        convite.exibirConvidados();
        System.out.println("O número de convidados é " + convite.contarConvidados() + "\n");

        convite.removerConvidadoPorCodigoConvite(2234);

        convite.exibirConvidados();
        System.out.println("O número de convidados é " + convite.contarConvidados() + "\n");

        convite.removerConvidadoPorCodigoConvite(1234);

        convite.exibirConvidados();
        System.out.println("O número de convidados é " + convite.contarConvidados() + "\n");


    }
}
