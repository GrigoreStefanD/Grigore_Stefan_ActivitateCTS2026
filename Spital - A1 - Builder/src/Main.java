public class Main

{
    public static void main(String[] args)


    {
        Pacient pacientVIP = new Pacient.PacientBuilder("  Ion  Popescu  ", " 1234567890123  ")
                .adaugaPatRabatabil()
                .adaugaMicDejun()
                .adaugaPapuci()
                .adaugaHalat()
                .build();

        Pacient pacientStandard = new Pacient.PacientBuilder(" Maria  Ionescu ", " 2234567890123 ")
                .adaugaMicDejun()
                .build();

        Pacient pacientSimplu = new Pacient.PacientBuilder(" Vasile  gicu ", " 1990101456789  ")
                .build();

        System.out.println(pacientVIP);

        System.out.println(pacientStandard);

        System.out.println(pacientSimplu);

    }


}