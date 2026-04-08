import spital.Pacient;
import spital.Medic;
import spital.Salon;
import spital.FacadeInternare;



public class Main

{
    public static void main(String[] args)

    {
        Pacient p1 = new Pacient("   Ion Popescu", 8);
        Pacient p2 = new Pacient("  Vasile Ionescu", 3);
        Pacient p3 = new Pacient("   Maria Georgescu", 6);

        Medic medic = new Medic("  Dr. Smith");
        Salon salon = new Salon(2);

        FacadeInternare facade = new FacadeInternare(medic, salon);

        System.out.println("\n   Incercare internare p1  ");
        facade.verificaInternare(p1);

        System.out.println("\n    Incercare internare p2  ");
        facade.verificaInternare(p2);

        System.out.println("\n    Incercare internare p3  ");
        facade.verificaInternare(p3);

        Pacient p4 = new Pacient(" Elena Radu  ", 9);
        System.out.println("\n   Incercare internare p4 (fara locuri ) - ");
        facade.verificaInternare(p4);




    }


}






