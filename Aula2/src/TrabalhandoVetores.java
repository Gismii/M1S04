import java.lang.String;
import java.util.Scanner;
public class TrabalhandoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names;
        System.out.println("Insira o tamanho do vetor: ");
        names = new String[scanner.nextInt()];
        for (int index = 0; index <names.length; index++) {
            System.out.println("Insira os nomes: ");
            names[index] = scanner.next();


        }
        for ( String name : names) {
            System.out.println(name);
        }
    }
}