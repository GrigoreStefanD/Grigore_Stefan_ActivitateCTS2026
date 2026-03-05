public class Placinta extends Prajitura
{

    public Placinta()
    {

        super("Placinta cu Mere  ", 6.50, 200);
    }

    @Override

    public void prepara()
    {
        System.out.println("Se prepara aluatul pentru placinta. ");

        System.out.println(" Se curata si se taie merele ");
        System.out.println("  Se pune aluatul in tava si se umple cu mer ");

        System.out.println(" Se coace la cuptor pana se rumenest   ");
    }
}

