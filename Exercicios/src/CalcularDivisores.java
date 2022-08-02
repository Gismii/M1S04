import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcularDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> divisores = new ArrayList<>();

        System.out.print("Digite um numero inteiro para saber seus divisores: ");

        int n=scanner.nextInt();
        int menor=n;

        for (int i = 1;i <n; i++){

            menor--;
            System.out.println(menor);



        }
    }
}