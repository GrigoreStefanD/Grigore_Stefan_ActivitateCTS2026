public abstract class DecoratorNotaDePlata implements INotaDePlata
{

    protected INotaDePlata notaDePlata;

    public DecoratorNotaDePlata(INotaDePlata notaDePlata)
    {
        this.notaDePlata = notaDePlata;
    }



    @Override
    public void printeaza()
    {
        this.notaDePlata.printeaza();
    }
}


