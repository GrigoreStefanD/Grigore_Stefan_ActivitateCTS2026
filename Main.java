public class Main
{

    public static void main(String[] args)

    {
        INotaDePlata nota = new NotaDePlata(150.5);
        nota.printeaza();


        System.out.println("-----");


        INotaDePlata notaCuSarbatori = new DecoratorSarbatori(nota);
        notaCuSarbatori.printeaza();
    }


}


