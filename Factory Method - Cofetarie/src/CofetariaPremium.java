


public class CofetariaPremium extends Cofetaria

{

    @Override

    public Prajitura creazaPrajitura()


    {
        System.out.println(" Cofetaria Premium creeaza un   Tort   ");

        return new Tort();
    }
}

