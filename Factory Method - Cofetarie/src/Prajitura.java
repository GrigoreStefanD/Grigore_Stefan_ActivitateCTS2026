public abstract class Prajitura
{

    private String nume;

    private double pret;
    private int calorii;

    public Prajitura(String nume, double pret, int calorii)
    {

        this.nume = nume;
        this.pret = pret;

        this.calorii = calorii;
    }

    public String getNume()

    {
        return nume;

    }

    public double getPret() {
        return pret;

    }

    public int getCalorii() {
        return calorii;
    }

    public abstract void prepara();

    public void afiseaza() {

        System.out.println("  Prajitura: " + nume);
        System.out.println("  Pret  : " + pret + " RON");

        System.out.println("  Calorii: " + calorii);
    }
}

