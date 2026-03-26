import java.util.ArrayList;
import java.util.List;



public class ContClient implements Cloneable
{
    private String nume;
    private String email;
    private String telefon;
    private List<String> preferinte;

    public ContClient(String nume, String email, String telefon)
    {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
        this.preferinte = new ArrayList<>();

        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private ContClient() {}

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public ContClient clone()
    {
        ContClient copie = new ContClient();
        copie.nume = this.nume;
        copie.email = this.email;
        copie.telefon = this.telefon;
        copie.preferinte = new ArrayList<>(this.preferinte);
        return copie;
    }


    @Override
    public String toString()
    {
        return "ContClient{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", preferinte=" + preferinte +
                '}';
    }

}




