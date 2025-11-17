package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {
    private List<Integer> numeros;

    public SomarNumeros() {
        numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
    public int calcularSoma() {
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return soma;
    }
    public int encontrarMaiorNumero() {
        int max = numeros.getFirst();
        for (int n : numeros) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }
    public int encontrarMenorNumero() {
        int min = numeros.getFirst();
        for (int n : numeros) {
            if (min > n) {
                min = n;
            }
        }
        return min;
    }

    @Override
    public String toString() {
        return "SomarNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {

        SomarNumeros calculadora = new SomarNumeros();

        calculadora.adicionarNumero(12);
        calculadora.adicionarNumero(43);
        calculadora.adicionarNumero(-23);
        calculadora.adicionarNumero(0);
        calculadora.adicionarNumero(2);
        calculadora.adicionarNumero(53);
        calculadora.adicionarNumero(22);
        calculadora.adicionarNumero(11);

        System.out.println(calculadora.calcularSoma());
        System.out.println(calculadora.encontrarMaiorNumero());
        System.out.println(calculadora.encontrarMenorNumero());
        System.out.println(calculadora);



    }
}
