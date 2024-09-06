import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private List<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder("Relatório do Projeto: " + nome + "\n");
        for (Tarefa tarefa : tarefas) {
            relatorio.append(tarefa.toString()).append("\n");
        }
        return relatorio.toString();
    }
}