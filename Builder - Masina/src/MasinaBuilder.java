public class MasinaBuilder
{
    public String marca = " Necunoscuta  ";
    public String model = " Necunoscut ";
    public int an = 0;
    public String culoare = " alb ";
    public double pret = 0;


    public MasinaBuilder setMarca(String marca)
    {
        this.marca = marca;
        return this;
    }


    public MasinaBuilder setModel(String model)
    {
        this.model = model;
        return this;
    }


    public MasinaBuilder setAn(int an)
    {
        this.an = an;
        return this;
    }


    public MasinaBuilder setCuloare(String culoare)
    {
        this.culoare = culoare;
        return this;
    }


    public MasinaBuilder setPret(double pret)
    {
        this.pret = pret;
        return this;
    }

    public Masina build() {
        return new Masina(this);
    }
}

