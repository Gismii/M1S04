import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class CalcularDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> divisores = new ArrayList<>();

        System.out.print("Digite um numero inteiro para saber seus divisores: ");

        Integer nu = scanner.nextInt();

        for (int i = 1; i <= nu; i++) {


            if (nu % i == 0) {

                divisores.add(i);

            }

            }
        System.out.println(" Os divisores são os : "+divisores);
        }
    }
