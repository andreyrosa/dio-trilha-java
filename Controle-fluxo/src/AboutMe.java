import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome> ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome> ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade> ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura> ");
        int altura = scanner.nextInt();


        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + " " + idade + " " + sobrenome);
        System.out.println("Tenho " +idade+ " anos ");
        System.out.println("Minha altura e " + altura + " cm");
        scanner.close();
        }
        catch(InputMismatchException error){
            System.err.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}
