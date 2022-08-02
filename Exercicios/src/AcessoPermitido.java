import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AcessoPermitido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int senhaAcesso = 2002;
        List SenhaErrada = new ArrayList<>();
        int acesso;


          do {  System.out.println("Digite a senha de acesso: ");

             acesso= scanner.nextInt();
            if(acesso==senhaAcesso){

                System.out.println("Acesso permitido!!");
                System.out.println("Tentativas erradas: "+SenhaErrada.size()+" - "+" Senhas incorretas: "+SenhaErrada);

            }else {
                SenhaErrada.add(acesso);
                System.out.println("[Acesso negado - senha incorreta]");
            }
        }while (acesso != senhaAcesso );






    }
}




