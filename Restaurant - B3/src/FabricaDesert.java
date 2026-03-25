
public class FabricaDesert implements FabricaAbstracta
{


    @Override
    public Supa creareSupa(TipSupa tip)
    {

        return null;

    }




    @Override
    public Desert creareDesert(TipDesert tip)
    {

        switch (tip) {

            case PAPANASI:

                return new Papanasi();

            case CLATITE:

                return new Clatite();

            case CHEESECAKE:

                return new CheeseCake();

            default:

                throw new IllegalArgumentException("Tip desert necunoscut");

        }

    }

}




