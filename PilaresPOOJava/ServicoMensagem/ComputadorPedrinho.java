package PilaresPOOJava.ServicoMensagem;

import PilaresPOOJava.ServicoMensagem.Apps.FacebookMessenger;
import PilaresPOOJava.ServicoMensagem.Apps.MSNMessenger;
import PilaresPOOJava.ServicoMensagem.Apps.ServicoDeMensagem;
import PilaresPOOJava.ServicoMensagem.Apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoDeMensagem smi = null;
        String appEscolhido = "fb";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("tg"))
            smi = new Telegram();
        else if(appEscolhido.equals("fb"))
            smi = new FacebookMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}