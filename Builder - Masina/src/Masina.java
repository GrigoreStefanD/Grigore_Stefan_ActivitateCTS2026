

public class Masina

{

    private String marca;
    private String model;
    private int an;
    private String culoare;
    private double pret;


    public Masina(MasinaBuilder builder)

    {

        this.marca = builder.marca;
        this.model = builder.model;
        this.an = builder.an;
        this.culoare = builder.culoare;
        this.pret = builder.pret;

    }


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getAn() {
        return an;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getPret() {
        return pret;
    }


    @Override
    public String toString()

    {
        return "Masina " +
                "{ " +
                " marca  ='" +  marca +  '\'' +

                ", model ='" +  model +  '\'' +

                ",  an= "  +  an +

                ",  culoare='" +  culoare +   '\'' +

                ", pret=" +  pret +
                 '}';
    }
}

