public class Main
{
    public static void main(String[] args)
    {
        FabricaFormeAbstracta fabricaAlba = new FabricaFormeAlbastre();
        Forma patrat = fabricaAlba.creeazaPatrat();
        Forma cerc = fabricaAlba.creeazaCerc();


        patrat.deseneaza();
        cerc.deseneaza();



        FabricaFormeAbstracta fabricaRosie = new FabricaFormeRosii();
        Forma patrat2 = fabricaRosie.creeazaPatrat() ;
        Forma cerc2 = fabricaRosie.creeazaCerc();


        patrat2.deseneaza();
        cerc2.deseneaza();
    }
}