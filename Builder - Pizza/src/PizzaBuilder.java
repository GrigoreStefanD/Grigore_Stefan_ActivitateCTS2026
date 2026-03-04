import java.util.ArrayList;
import java.util.List;


public class PizzaBuilder
{
    private String aluat = " subtire";
    private String sos = " rosii";
    private List<String> toppinguri = new ArrayList<>();
    private String marime = " medie";


    public PizzaBuilder setAluat(String aluat)
    {
        this.aluat = aluat;
        return this;
    }


    public PizzaBuilder setSos(String sos)
    {
        this.sos = sos;
        return this;
    }



    public PizzaBuilder addTopping(String topping)
    {
        this.toppinguri.add(topping);
        return this;
    }


    public PizzaBuilder setMarime(String marime)
    {
        this.marime = marime;
        return this;
    }


    public Pizza build() {
        return new Pizza(aluat, sos, toppinguri, marime);
    }


}



