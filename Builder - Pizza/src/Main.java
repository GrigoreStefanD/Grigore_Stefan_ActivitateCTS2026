public class Main
{
    public static void main(String[] args)
    {
        PizzaBuilder builder = new PizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);



        Pizza margherita = director.makeMargherita();

        Pizza capriciosa = director.makeCapriciosa();



        Pizza custom = new PizzaBuilder()
                .setAluat(" groasa")
                .setSos(" crema")
                .addTopping(" nanas")
                .addTopping(" sunca")
                .setMarime("  mare ")
                .build();



        System.out.println(" Margherita  : " + margherita);
        System.out.println("Capriciosa : " + capriciosa);
        System.out.println(" Custom:   " + custom);
    }
}



