import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteragindoArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();
        double soma=0;
        double numero;
        double media=0;


        //double numero;
        while (true) {
            System.out.print("Digite um numero: ");
            numero = input.nextDouble();
            //soma=numero;

            if (numero == 0) {
                break;
            }
            lista.add(numero);
            }
            double maior, menor;
            maior = menor = lista.get(0);

            for (Double valor : lista) {
                if (valor > maior) {
                    maior = valor;
                } else if (valor < menor) {
                    menor = valor;

                }

            }  for (int i = 0; i <lista.size(); i++) {
            soma+=lista.get(i);

        }
                System.out.println("maior " + maior);
                System.out.println("menor " + menor);
                System.out.println("Media dos mumero digitados : " + soma/ lista.size());
            }
        }






