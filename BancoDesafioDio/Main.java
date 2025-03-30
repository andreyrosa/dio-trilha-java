package BancoDesafioDio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor do seu salário: ");
        float valorSalario = scan.nextFloat();

        System.out.print("Valor do benefício: ");
        float valorBeneficios = scan.nextFloat();

        calcularImposto(valorSalario, valorBeneficios);
    }

    static void calcularImposto(float salario, float beneficios){
        float imposto;
        if(salario >= 0 && salario <= 1100){
            // Atribuiu a aliquota de 5%
            imposto = 0.05f * salario;
        } else if(salario >= 1100.01 && salario <= 2500.00){
            imposto = 0.10f * salario;
        } else {
            imposto = 0.15f * salario;
        }
        float saida = (salario - imposto) + beneficios;
        System.out.printf("%.2f", saida);
    }

}