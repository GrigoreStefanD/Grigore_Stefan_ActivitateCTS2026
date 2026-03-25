
public class FabricaSupa implements FabricaAbstracta
{

    @Override
    public Supa creareSupa(TipSupa tip)
    {

        switch (tip)
        {

            case LEGUME:

                return new SupaLegume();

            case CIUPERCI:

                return new SupaCiuperci();

            case VITA:

                return new SupaVita();

            default:

                throw new IllegalArgumentException("Tip supa necunoscut");

        }

    }

    @Override
    public Desert creareDesert(TipDesert tip)
    {

        return null;

    }

}



