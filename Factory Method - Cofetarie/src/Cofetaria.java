

public abstract class Cofetaria

{


    public abstract Prajitura creazaPrajitura();



    public void comandaPrajitura()

    {

        Prajitura prajitura = creazaPrajitura();
        System.out.println("\n ===   COMANDA   NOUA  ===");

        prajitura.prepara();
        System.out.println();
        prajitura.afiseaza();

        System.out.println("   ================  \n");
    }
}

