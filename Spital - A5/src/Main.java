import adapter.MedicamentAdapter;
import farmacie.IMedicamentFarmacie;
import farmacie.MedicamentFarmacie;
import spital.Medicament;

public class Main
{
    public static void main(String[] args)
    {
        Medicament medicamentSpital = new Medicament("paracetamol", 10.5);
        medicamentSpital.achizitioneazaMedicament();


        System.out.println();


        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("nurofen", 20.0);
        medicamentFarmacie.cumparaMedicament();



        System.out.println();


        IMedicamentFarmacie medicamentAdaptat = new MedicamentAdapter("algocalmin", 15.0);
        medicamentAdaptat.cumparaMedicament();
    }
}




