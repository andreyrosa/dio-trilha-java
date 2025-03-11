import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            // chamando o metodo contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (Exception Error) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro (Erro ->" + Error.getMessage() + ")");
        }

    }

    public static class ParametrosInvalidosException extends RuntimeException {
        public ParametrosInvalidosException(String mensagem){
            super(mensagem);
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // validar se parametro Um é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            System.out.println(new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo."));
        } else {
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for(int indice = 1; indice <= contagem; indice++){
                System.o    ut.println("Imprimindo o número " + indice + ".");
            }
        }
    }
}
