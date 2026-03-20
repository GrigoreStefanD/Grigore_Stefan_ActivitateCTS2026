public class Main
{
    public static void main(String[] args)
    {
        SupaFactory factory = new SupaFactory();

        try
        {
            Supa s1 = factory.creareSupa(TipSupa.LEGUME);
            s1.serveste();

            Supa s2 = factory.creareSupa(TipSupa.CIUPERCI);
            s2.serveste();

            Supa s3 = factory.creareSupa(TipSupa.VITA);
            s3.serveste();

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}






