package spital;


public class FacadeInternare
{
    private Medic medic;
    private Salon salon;

    public FacadeInternare(Medic medic, Salon salon)
    {
        this.medic = medic;
        this.salon = salon;
    }



    public boolean verificaInternare(Pacient pacient)
    {
        if (!pacient.esteStareGrava())
        {
            System.out.println("Pacientul " + pacient.getNume() + " nu are o stare suficient de grava pentru internare.");
            return false;
        }

        if (!medic.confirmaInternare(pacient))
        {
            System.out.println("Medicul nu a confirmat internarea pentru pacientul " + pacient.getNume());
            return false;
        }

        if (!salon.arePaturiLibere())
        {
            System.out.println("Nu exista paturi libere in salon pentru pacientul " + pacient.getNume());
            return false;
        }

        System.out.println("Pacientul " + pacient.getNume() + " poate fi internat.");
        salon.ocupaPat();
        return true;
    }




}




