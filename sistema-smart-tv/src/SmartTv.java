import java.util.Scanner;

public class SmartTv{

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(int canal){
        canal++;
    }
    public void diminuirCanal(int canal){
        canal--;
    }

    public void ligar(){
        ligada = true;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);

    }

    public void desligar(){
        ligada = false;
    }
}