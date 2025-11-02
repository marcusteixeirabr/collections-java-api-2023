// import OperacoesBasicas.ListaTarefa;
import OperacoesBasicas.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {

        /*
        ListaTarefa tarefasDomesticas = new ListaTarefa();

        tarefasDomesticas.adicionarTarefa("Fazer lista de compras");
        tarefasDomesticas.adicionarTarefa("Passear com cachorros");
        tarefasDomesticas.adicionarTarefa("Limpar sujeira animais");
        tarefasDomesticas.adicionarTarefa("Dar comida para os cães");
        tarefasDomesticas.adicionarTarefa("Tomar café da manhã");
        tarefasDomesticas.adicionarTarefa("Tomar remédios");

        tarefasDomesticas.obterDescricoesTarefas();

        tarefasDomesticas.removerTarefa("Tomar remédios");

        tarefasDomesticas.obterDescricoesTarefas();

        System.out.println("O numero total de tarefas é " + tarefasDomesticas.obterNumeroTotalTarefas());
        */


        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();

        meuCarrinho.exibirItens();

        meuCarrinho.adicionarItem("Detergente (500ml)", 2.65, 12 );
        meuCarrinho.adicionarItem("Água sanitária (2l)", 5.65, 2 );
        meuCarrinho.adicionarItem("Batata (kg)", 3.92, 1 );
        meuCarrinho.adicionarItem("Cebola (kg)", 5.92, 1 );

        meuCarrinho.exibirItens();

        meuCarrinho.calcularValorTotal();

        meuCarrinho.removerItem("Cebola (kg)");

        meuCarrinho.exibirItens();

        meuCarrinho.calcularValorTotal();


    }
}
