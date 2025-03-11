public class calcularDividaExponencial {
    public static void main(String[] args) {
        dividaExponencial();
    }

    public static double dividaExponencial() {

        double valorParcela = 50.0;
        double valorMontante = 0.0;

        for(int x = 1; x <= 5; x++){
            double valorCalculado = valorParcela * x;
            valorMontante += valorCalculado;
            System.out.println(valorMontante);
        }
        return valorMontante;
    }
}
