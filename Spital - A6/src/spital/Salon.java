package spital;


import java.util.ArrayList;
import java.util.List;



public class Salon
{
    private List<Boolean> paturiOcupate;


    public Salon(int nrPaturi)
    {
        paturiOcupate = new ArrayList<>();
        for (int i = 0; i < nrPaturi; i++)
        {
            paturiOcupate.add(false);
        }
    }



    public  boolean arePaturiLibere()
    {
        for (boolean ocupat : paturiOcupate)
        {
            if (!ocupat)
            {
                return true;
            }
        }
        return false;
    }



    public void ocupaPat()
    {
        for (int i = 0; i < paturiOcupate.size(); i++)
        {
            if (!paturiOcupate.get(i))
            {
                paturiOcupate.set(i, true);
                break;
            }
        }
    }
}
