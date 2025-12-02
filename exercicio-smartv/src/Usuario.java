public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status: Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status 2: TV Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(12);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
