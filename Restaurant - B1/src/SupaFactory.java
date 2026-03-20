public class SupaFactory
{
    public Supa creareSupa(TipSupa tip) throws Exception
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
                throw new Exception("tipul de supa nu exista");


        }

    }

}


