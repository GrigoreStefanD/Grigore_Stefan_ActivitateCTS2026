public class DecoratorSarbatori extends DecoratorNotaDePlata

{


    public DecoratorSarbatori(INotaDePlata notaDePlata)
    {
        super(notaDePlata);

    }




    @Override
    public void printeaza()


    {
        super.printeaza();
        System.out.println("la Multi Ani");
    }



}


