import java.util.*;

import static javax.swing.UIManager.get;

public class SistemaMatricula {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int vagas = 40;
        List<String> nomes = new ArrayList<>();
        String informandoVagas;
        int num;


        do {
            System.out.print("1 - Realizar matrícula\n" +
                    "2 - Consultar quantidade de vagas restantes\n" +
                    "3 - Listar pessoas matriculadas\n" +
                    "4 - Sair\n");
            num = scanner.nextInt();
            switch (num) {
                case 1:

                    System.out.println("Informe o nome do aluno: ");
                    nomes.add(scanner.next());
                    for (int i = 0; i < vagas; i++) {

                    }
                    vagas--;
                    if (vagas > 0 && vagas<40) {
                        System.out.println("Matricula realizada com sucesso!!");
                        System.out.println("Restam: " + vagas + "vagas. ");
                        System.out.println("                                 ");
                    }else {
                        System.out.println("Infelizmente não temos mais vagas, " +
                                "mas fique de olho em nosso site para a abertura de novas turmas.");
                    }
                case 2:
                    System.out.println("Vagas disponiveis: "+ vagas);
            }

        }while (num!=4) ;
    }
}