 

public class PizzaDirector

{
    private final PizzaBuilder builder;


    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makeMargherita()

    {
        return builder
                .setAluat(" subtire")
                .setSos(" rosii")
                .addTopping(" mozzarella ")
                .addTopping(" busuioc  ")
                .setMarime(" mica")
                .build();
    }




    public Pizza makeCapriciosa()
    {
        return builder
                .setAluat(" groasa ")
                .setSos("  rosii")
                .addTopping(" sunca")
                .addTopping(" ciuperci  ")
                .addTopping(" masline")
                .setMarime(" mare")
                .build();
    }
}






