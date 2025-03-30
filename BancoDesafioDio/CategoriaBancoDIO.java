package BancoDesafioDio;

import java.util.Scanner;

public class CategoriaBancoDIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // TO-DO: Implemente a classificação do cliente com base no saldo:

        System.out.print("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        if(saldo < 0){
            System.out.println("Negativado");
        } else if(saldo < 500){
            System.out.println("Baixo");
        } else {
            System.out.println("Confortavel");
        }
        scanner.close();
    }
}
