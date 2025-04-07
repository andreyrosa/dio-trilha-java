package PilaresPOOJava.ServicoMensagem.Apps;

public abstract class ServicoDeMensagem {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // Somente os filhos conhecem este metodo

    protected void validarConexaoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

}
