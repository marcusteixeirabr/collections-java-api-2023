import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;

public class AgendaEventos {

    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agenda.put(data, new Evento(nome, atracao));
        System.out.println("Evento " + nome + " adicionado com sucesso!");
    }

    public void exibirAgenda() {
        if (agenda.isEmpty()) {
            System.out.println("A agenda está vazia!");
        }
        Map<LocalDate, Evento> agendaPorNome = new TreeMap<>(agenda);
        for (LocalDate data : agendaPorNome.keySet()) {
            System.out.println(
            "Data: " + data +
            " - Evento: " + agendaPorNome.get(data).getNome() +
            " - Atração: " + agendaPorNome.get(data).getAtracao() +
            ".");
        }
    }

    public void obterProximoEvento() {
        if (agenda.isEmpty()) {
            System.out.println("A agenda está vazia!");
            return;
        }
        Map<LocalDate, Evento> agendaPorData = new HashMap<>(agenda);
        for (Map.Entry<LocalDate, Evento> entry : agendaPorData.entrySet()) {
            if (entry.getKey().equals(LocalDate.now()) || entry.getKey().isAfter(LocalDate.now())) {
                System.out.println(
                "Próximo Evento:\n" +
                "Data: " + entry.getKey() +
                " - Evento: " + entry.getValue().getNome() +
                " - Atração: " + entry.getValue().getAtracao() +
                ".");
                return;
                }
            }
        System.out.println("Não há próximos eventos na agenda.");
    }

    public static void main(String[] args) {
        AgendaEventos minhaAgenda = new AgendaEventos();
        minhaAgenda.adicionarEvento(LocalDate.of(2024, 10, 5), "Festival de Música", "Banda XYZ");
        minhaAgenda.adicionarEvento(LocalDate.of(2024, 11, 19), "Feira de Tecnologia", "Palestra ABC");
        minhaAgenda.adicionarEvento(LocalDate.of(2025, 12, 20), "Exposição de Arte", "Artista 123");

        System.out.println("\nAgenda de Eventos:");
        minhaAgenda.exibirAgenda();

        minhaAgenda.obterProximoEvento();

    }
}
