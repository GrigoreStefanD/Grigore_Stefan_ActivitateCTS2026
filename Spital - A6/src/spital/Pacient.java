package spital;



public class Pacient
 {
    private String nume;
    private int gravitate;

    public Pacient(String nume, int gravitate)
    {
        this.nume = nume;
        this.gravitate = gravitate;
    }



    public String getNume() {
        return nume;
    }


    public int getGravitate() {
        return gravitate;
    }


    public boolean esteStareGrava() {
        return gravitate > 5;
    }

}

