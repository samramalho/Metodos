public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual "+ smartTv.volume);


        System.out.println("Canal  atual "+ smartTv.canal);
         smartTv.mudarCanal(18);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Novo Canal " + smartTv.canal);
        System.out.println("Volume com a SmartTv ligada " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv desligada ? " + smartTv.ligada);



    }
}