

public class SamponPar implements Cloneable
{
    private String nume;
    private String ingrediente;
    private int volum;

    public SamponPar(String nume, String ingrediente, int volum)
    {
        this.nume = nume;
        this.ingrediente = ingrediente;
        this.volum = volum;
    }

    public SamponPar cloneaza()
    {
        try
        {
            return (SamponPar) super.clone();
        }

        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }



    @Override
    public String toString()

    {
        return "samponPar{" +
                " nume ='" + nume + '\'' +
                ", ingrediente  ='" + ingrediente + '\'' +
                ", volum =   " + volum +
                '}';
    }
}

