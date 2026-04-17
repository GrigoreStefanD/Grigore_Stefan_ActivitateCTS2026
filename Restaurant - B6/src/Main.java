public class Main
{

    public static void main(String[] args)
    {
        VerificareMasaFacade facade = new VerificareMasaFacade();

        int numarMasa = 12;
        if (facade.esteGataPentruClienti(numarMasa))
        {
            System.out.println("  Masa " + numarMasa + " este gata pentru clienti");
        }

        else
        {
            System.out.println(" Masa " + numarMasa + " nu este gata");
        }


    }

}




















