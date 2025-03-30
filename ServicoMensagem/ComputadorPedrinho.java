package ServicoMensagem;

import ServicoMensagem.Apps.FacebookMessenger;
import ServicoMensagem.Apps.MSNMessenger;
import ServicoMensagem.Apps.ServicoDeMensagem;
import ServicoMensagem.Apps.Telegram;

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