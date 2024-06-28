public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(true,23,15);
        System.out.println("SmarTV1 :");
        smartTv.imprimir();

        SmartTv smartTv2 = new SmartTv();
        System.out.println("SmarTV2 :");
        smartTv2.mudarCanal(20);
        smartTv2.imprimir();

    }
}
