public class CofetariaEconomica extends Cofetaria

{

    @Override

    public Prajitura creazaPrajitura()

    {
        System.out.println(" Cofetaria Economica creeaza o Placinta  ");


        return new Placinta();

    }
}

