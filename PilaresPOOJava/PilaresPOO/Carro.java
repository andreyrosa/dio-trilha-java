package PilaresPOOJava.PilaresPOO;

public class Carro extends Veiculo {
    public void ligar(){
        System.out.println("Carro ligado");
        confereCambio();
        confereCombustivel();
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustível");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
