public abstract class StructuraSpital
{


    protected String nume;

    public StructuraSpital(String nume)
    {
        this.nume = nume;
    }

    public abstract void adaugaStructura(StructuraSpital structura);
    public abstract void stergeStructura(StructuraSpital structura);
    public abstract StructuraSpital getStructura(int index);
    public abstract void afiseaza(String indentare);


}

