package PilaresPOOJava.PilaresPOO;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("48923");
//        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("94514");
//        z400.ligar();

        Veiculo coringa = z400;
        coringa.ligar();

    }
}
