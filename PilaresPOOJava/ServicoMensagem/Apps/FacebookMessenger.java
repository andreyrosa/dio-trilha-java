package PilaresPOOJava.ServicoMensagem.Apps;

public class FacebookMessenger extends ServicoDeMensagem {

    @Override
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }

}
