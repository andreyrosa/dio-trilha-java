public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? "+ smartTv.ligada);
        System.out.println("Volume Atual: "+smartTv.volume);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(19);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada?  "+ smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? "+ smartTv.ligada);


    }

}
