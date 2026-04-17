public class VerificareMasaFacade
{
    private GestiuneMese gestiuneMese;
    private CuratenieMese curatenieMese;
    private ServireMese servireMese;

    public VerificareMasaFacade()
    {
        this.gestiuneMese = new GestiuneMese();
        this.curatenieMese = new CuratenieMese();
        this.servireMese = new ServireMese();
    }



    public boolean esteGataPentruClienti(int numarMasa)

    {
        if (!gestiuneMese.esteMasaLibera(numarMasa))
        {
            return false;
        }

        if (!curatenieMese.esteMasaDebarasata(numarMasa))
        {
            return false;
        }


        if (!servireMese.areServeteleNoi(numarMasa))
        {

            return false;
        }


        return true;

    }


}



