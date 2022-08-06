import java.util.*;

public class TodoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcoes;

        Map<String, String> agenda = new HashMap<>();
        do {
            System.out.println("Agendar outras tarefas -\n" +
                    "1 - Cadastrar atividade\n" +
                    "2 - Marcar como feito\n" +
                    "0 - Sair\n ");

            opcoes = scanner.nextInt();
            switch (opcoes) {
                case 1:
                    System.out.println("Informa a atividade: ");
                    String nomeAtividade = scanner.next();
                    System.out.println("Informa o horário: ");
                    String horario = scanner.next();
                    System.out.println("          ");
                    System.out.println("Tarefa cadastrada com sucesso!!");
                    System.out.println("------------------------------");
                    agenda.put(nomeAtividade,horario);

                    break;

                case 2:
                    System.out.println("Informe a tarefa realizada: ");

                    nomeAtividade=scanner.next();

                    if (agenda.containsKey(nomeAtividade)) {
                        agenda.remove(nomeAtividade);
                        System.out.println("Tarefa concluida e removida!!");
                        System.out.println("                              ");
                        System.out.println("------------------------------");
                    } else {
                        System.out.println("“Atividade não cadastrada”");

                    }break;
        }
            agenda.forEach((nomeAtividade,horario) ->
                    System.out.println("Tarefas pendentes: "+ "["+nomeAtividade + ", "+horario+"]"));

        }while (opcoes!=0) ;

    }



    }

