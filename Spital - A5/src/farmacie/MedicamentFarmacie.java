package farmacie;

public class MedicamentFarmacie implements IMedicamentFarmacie
{
    private String nume;
    private double pret;

    public MedicamentFarmacie(String nume, double pret)
    {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void cumparaMedicament()

    {
        System.out.println("Medicamentul " + nume + " a fost cumparat fara reteta.");
    }


}





