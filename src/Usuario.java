public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Ligada: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Ligada: " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Ligada: " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(240);
        System.out.println("Canal: " + smartTv.canal);
    }
}
