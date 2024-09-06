import java.util.Scanner;

public class SistemaGerenciamentoProjetos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do projeto:");
        String nomeProjeto = scanner.nextLine();
        Projeto projeto = new Projeto(nomeProjeto);

        boolean adicionarMaisTarefas = true;
        while (adicionarMaisTarefas) {
            System.out.println("Digite a descrição da tarefa:");
            String descricaoTarefa = scanner.nextLine();
            Tarefa tarefa = new Tarefa(descricaoTarefa);
            projeto.adicionarTarefa(tarefa);

            System.out.println("Deseja adicionar mais tarefas? (sim/não)");
            String resposta = scanner.nextLine().trim().toLowerCase(); 
            System.out.println("Você digitou: \"" + resposta + "\""); 

            if (resposta.equals("não") || resposta.equals("nao")) {
                adicionarMaisTarefas = false;
            }
        }

        String relatorio = projeto.gerarRelatorio();
        System.out.println("Relatório do Projeto:");
        System.out.println(relatorio);

        scanner.close();
    }
}