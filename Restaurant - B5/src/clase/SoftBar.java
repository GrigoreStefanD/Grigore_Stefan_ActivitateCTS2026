package clase;

public class SoftBar
{
    private String numeOspatar;

    public SoftBar(String numeOspatar) {
        this.numeOspatar = numeOspatar;
    }

    public void printeazaNota(double pret) {
        System.out.println("Ospatarul " + numeOspatar + " a printat nota de plata: " + pret + " RON");
    }
}




