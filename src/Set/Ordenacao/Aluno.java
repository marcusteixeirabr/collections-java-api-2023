package Set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private float media;

    public Aluno(String nome, long matricula, float media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public float getMedia() {
        return media;
    }


    @Override
    public String toString() {
        return "{" +
                "'" + nome + '\'' +
                ", " + matricula +
                ", " + media +
                '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
        }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }
        
}

class ComparatorPorMedia implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Float.compare(a1.getMedia(), a2.getMedia());
    }

}