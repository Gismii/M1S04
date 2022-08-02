import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraysListt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] livrosArray = new String[5];
        List<String> livroList = new ArrayList<>();

        livrosArray [0] = "Livro1";
        livrosArray [1] = "Livro2";
        livrosArray [2] = "Livro3";
        livrosArray [3] = "Livro4";
        livrosArray [4] = "Livro5";

        System.out.println(livroList.size());
        livroList.add("Livro1");
        System.out.println(livroList.size());

    }
}