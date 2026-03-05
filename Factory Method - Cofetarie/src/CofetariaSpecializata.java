public class CofetariaSpecializata extends Cofetaria

{

    private boolean eclairMode = true;

    @Override

    public Prajitura creazaPrajitura()

    {

        if (eclairMode)

        {

            System.out.println("  Cofetaria Specializata creeaza un Eclair   ");
              eclairMode = false;
              return new Eclair();

        }

        else
        {

            System.out.println("   C ofetaria Specializata creeaza o Savarina   ");
               eclairMode = true;
              return new Savarina();

        }

    }

}

