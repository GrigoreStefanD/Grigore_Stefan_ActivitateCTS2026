
public class Main
{



    public static void main(String[] args)
    {

        FabricaAbstracta fabricaSupa = new FabricaSupa();

        Supa supa1 = fabricaSupa.creareSupa(TipSupa.LEGUME);

        Supa supa2 = fabricaSupa.creareSupa(TipSupa.CIUPERCI);

        Supa supa3 = fabricaSupa.creareSupa(TipSupa.VITA);

        supa1.afiseazaDescriere();

        supa2.afiseazaDescriere();

        supa3.afiseazaDescriere();


        FabricaAbstracta fabricaDesert = new FabricaDesert();

        Desert desert1 = fabricaDesert.creareDesert(TipDesert.PAPANASI);

        Desert desert2 = fabricaDesert.creareDesert(TipDesert.CLATITE);

        Desert desert3 = fabricaDesert.creareDesert(TipDesert.CHEESECAKE);

        desert1.afiseazaDescriere();

        desert2.afiseazaDescriere();

        desert3.afiseazaDescriere();

    }


}

