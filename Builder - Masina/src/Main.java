public class Main
{
    public static void main(String[] args)
    {
        Masina masina1 = new MasinaBuilder()
                .setMarca(" BMW" )
                .setModel(" X5 ")
                .setAn(2023)
                .setCuloare(" Negru")
                .setPret(50000)
                .build();



        System.out.println("Masina 1: " + masina1);

        Masina masina2 = new MasinaBuilder()
                .setMarca(" audi " )
                .setModel(" A4 ")
                .setAn( 2022)
                .setCuloare(" Gri")
                .setPret(40000)
                .build();

        System.out.println(" masina 2 : " + masina2);

        Masina masina3 = new MasinaBuilder()
                .setMarca(" mercedes ")
                .setModel(" C-Class ")
                .setAn(2024)
                .build();

        System.out.println(" masina 3: " + masina3);
    }
}