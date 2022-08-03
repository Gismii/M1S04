import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        for (int i = -1; i < nomes.size(); i++) {
            System.out.print("Digite o nome a ser adicionado: ");
            String dados;
            nomes.add(dados = scanner.next());

            if (dados.equals("fim") || dados.equals("Fim") || dados.equals("FIM")){
                nomes.remove("fim");
                nomes.remove("Fim");
                nomes.remove("FIM");
                System.out.println("Nomes adicionados com sucesso ➡️"+nomes);
                break;
            }

        }
    }
}


