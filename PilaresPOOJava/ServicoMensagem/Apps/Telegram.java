package PilaresPOOJava.ServicoMensagem.Apps;
public class Telegram extends ServicoDeMensagem {
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");

    }
}
