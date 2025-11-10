package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(numeros);
    }

    public void ordenarDescendente() {
//        Collections.sort(numeros, Comparator.reverseOrder());
        numeros.sort(Collections.reverseOrder());
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {

        OrdenacaoNumeros on = new OrdenacaoNumeros();

        on.adicionarNumero(5);
        on.adicionarNumero(1);
        on.adicionarNumero(9);
        on.adicionarNumero(3);

        System.out.println("Lista original:");
        on.exibirNumeros();

        on.ordenarAscendente();
        System.out.println("Ordem ascendente:");
        on.exibirNumeros();

        on.ordenarDescendente();
        System.out.println("Ordem descendente:");
        on.exibirNumeros();


    }
}
