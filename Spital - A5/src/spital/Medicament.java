package spital;


public class Medicament
{

    private String denumire;
    private double pret;


    public Medicament(String denumire, double pret)
    {
        this.denumire = denumire;
        this.pret = pret;
    }


    public void achizitioneazaMedicament()
    {
        prezintaReteta();
        System.out.println("medicamentul " + denumire + " a fost primit cu succes.");
    }


    public void prezintaReteta()
    {
        System.out.println(" reteta pentru medicamentul ;" + denumire + " a fost verificata.");
    }



    public String getDenumire() {
        return denumire;
    }


    public double getPret() {
        return pret;
    }
}



