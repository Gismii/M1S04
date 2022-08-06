import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteragindoArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();
        double media = lista.get(2);


        double numero;
        while (true) {
            System.out.print("Digite um numero: ");
            numero = input.nextDouble();

            if (numero == 0) {
                break;
            }
            lista.add(numero);
        }
        double maior, menor;
        maior = menor  = lista.get(0);

        for (Double valor: lista) {
            if (valor > maior) {
                maior = valor;
            } else if (valor < menor) {
                menor = valor;

            }
        }

        System.out.println("maior " + maior);
        System.out.println("menor " + menor);
        //System.out.println("Media " + media );
    }
}


