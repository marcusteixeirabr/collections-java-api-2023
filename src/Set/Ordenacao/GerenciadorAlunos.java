package Set.Ordenacao;

// import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, float media) {
        alunoSet.add(new Aluno(nome, matricula, media));
        System.out.println("Aluno(a) " + nome + " matriculado(a)!");
        System.out.println("-".repeat(40));
    }
    
    public void removerAluno(long matricula) {
        alunoSet.removeIf(aluno -> aluno.getMatricula() == matricula);
        System.out.println("Aluno com matrícula " + matricula + " removido com sucesso!");
            System.out.println("-".repeat(40));
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunoPorMedia.addAll(alunoSet);
        return alunoPorMedia;
    }

    public Set<Aluno> alunoPorMatricula() {
        // Set<Aluno> alunoPorMatricula = new TreeSet<>(Comparator.comparing(Aluno::getMatricula));
        Set<Aluno> alunoPorMatricula = new TreeSet<>(
            (a1, a2) -> Long.compare(a1.getMatricula(), a2.getMatricula()));
        alunoPorMatricula.addAll(alunoSet);
        return alunoPorMatricula;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
        System.out.println("-".repeat(40));
    }

    public static void main(String[] args) {

        System.out.println("-".repeat(40));
    
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Maria", 2023001L, 8.5f);
        gerenciador.adicionarAluno("João", 2023002L, 7.0f);
        gerenciador.adicionarAluno("Ana", 2023003L, 9.2f);
        gerenciador.adicionarAluno("Carlos", 2023004L, 6.8f);

        System.out.println("Alunos por nome:");
        System.out.println(gerenciador.exibirAlunosPorNome());

        System.out.println("Alunos por média:");
        System.out.println(gerenciador.exibirAlunosPorNota());

        System.out.println("Alunos por matrícula:");
        System.out.println(gerenciador.alunoPorMatricula());

        gerenciador.removerAluno(2023002L);
        System.out.println("Alunos após remoção:");
        gerenciador.exibirAlunos();

    }

}
