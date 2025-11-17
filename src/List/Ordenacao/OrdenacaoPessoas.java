package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, float altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
        System.out.println("Registro " + nome + " adicionado com sucesso!");
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas l1 = new OrdenacaoPessoas();

        l1.adicionarPessoa("Maria", 23, 1.76f);
        l1.adicionarPessoa("João", 32, 1.56f);
        l1.adicionarPessoa("Carla", 12, 1.46f);
        l1.adicionarPessoa("Farias", 55, 1.87f);
        l1.adicionarPessoa("Tereza", 43, 1.56f);
        l1.adicionarPessoa("Marcus", 10, 1.05f);
        l1.adicionarPessoa("Flávia", 33, 1.42f);
        l1.adicionarPessoa("Pedro", 35, 1.91f);
        l1.adicionarPessoa("Júlia", 65, 1.67f);
        l1.adicionarPessoa("José", 76, 1.83f);

        System.out.println(l1.pessoaList);
        System.out.println(l1.ordenarPorIdade() + "\n");
//        System.out.println(l1.ordenarPorAltura());



    }

}
