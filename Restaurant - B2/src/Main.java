public class Main

{
    public static void main(String[] args)
    {
        Rezervare rezervare1 = new Rezervare.RezervareBuilder()
                .setAsezareLaGeam(true)
                .setDecorareaMesei(true)
                .build();



        Rezervare rezervare2 = new Rezervare.RezervareBuilder()
                .setScauneErgonomice(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica("Jazz")
                .build();



        System.out.println(rezervare1);
        System.out.println(rezervare2);

    }


}



