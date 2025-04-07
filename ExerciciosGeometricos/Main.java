package ExerciciosGeometricos;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args){
        int option;
        GeometricForm geometricForm = null;
        while (true){
            System.out.println("Escolha a forma Geometrica para calcular a Área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair do programa");
            System.out.print("Digite uma das opções: ");
            option = scanner.nextInt();
            if(option == 1) {
                geometricForm = createSquare();
            }else if(option == 2){
                geometricForm = createRectangle();
            }else if (option == 3){
                geometricForm = createCircle();
            }else if(option == 4) {
                break;
            } else {
                System.out.println("Opção Inválida");
                continue;
            }
            System.out.println("O restulado do cálculo da área foi de " + geometricForm.getArea());
            break;
        }
    }
    private static GeometricForm createSquare(){
        System.out.print("Informe os tamanhos dos lados: ");
        var side = scanner.nextDouble();
        return new Square(side);
    }
    private static GeometricForm createRectangle(){
        System.out.print("Informe a base: ");
        double base = scanner.nextDouble();
        System.out.print("Informe a altura: ");
        double height = scanner.nextDouble();
        return new Rectangle(height, base);
    }
    private static GeometricForm createCircle(){
        System.out.print("Informe o Raio: ");
        double radio = scanner.nextDouble();
        return new Circle(radio);
    }

}
