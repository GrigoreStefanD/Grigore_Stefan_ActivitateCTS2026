package prototype;


import java.util.HashMap;
import java.util.Map; 



public class RetetaMedicament implements Reteta
{
    private String numeMedicament; 
    private Map<String, Double> cantitatiSolutii; 

    public RetetaMedicament(String numeMedicament, Map<String, Double> cantitatiSolutii) { 
        this.numeMedicament = numeMedicament; 
        this.cantitatiSolutii = cantitatiSolutii; 
        System.out.println(" initializare costisitoare pentru reteta  " + numeMedicament);

        try
        {
            Thread.sleep(2000); 
        }
        catch (InterruptedException e)
        {
            e.printStackTrace(); 
        } 
    } 

    private RetetaMedicament()  { }

    public void setNumeMedicament(String numeMedicament)
    {
        this.numeMedicament = numeMedicament;
    } 


    @Override 
    public String toString()
    {
        return "retetaMedicament { " +
                "numeMedicament  ='" + numeMedicament + "'" +
                ",  cantitatiSolutii =" + cantitatiSolutii +
                " } ";
    } 



    @Override 
    public Reteta clone()
    {
        System.out.println("clonare reteta pentru " + this.numeMedicament);
        RetetaMedicament clona = new RetetaMedicament(); 
        clona.numeMedicament = this.numeMedicament; 
        clona.cantitatiSolutii = new HashMap<>(this.cantitatiSolutii); 

        return clona;
    }





}