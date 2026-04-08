package spital;

public class Medic
{
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean confirmaInternare(Pacient pacient) {
        return pacient.getGravitate() > 4;
    }
}


