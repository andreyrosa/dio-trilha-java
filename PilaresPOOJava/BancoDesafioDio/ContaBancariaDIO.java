package PilaresPOOJava.BancoDesafioDio;

import java.util.Scanner;

public class ContaBancariaDIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Digite a primeira transação: ");
        double transacao1 = scanner.nextDouble();

        System.out.print("Digite a segunda transação: ");
        double transacao2 = scanner.nextDouble();

        System.out.print("Digite a terceira transação: ");
        double transacao3 = scanner.nextDouble();

        System.out.println();
        double saldoFinal = (transacao1 + transacao2 + transacao3) + saldoInicial;

        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
