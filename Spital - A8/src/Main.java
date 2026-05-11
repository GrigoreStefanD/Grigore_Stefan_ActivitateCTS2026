public class Main
{


    public static void main(String[] args)

    {

        StructuraSpital spital = new Departament("Spital Judetean");

        StructuraSpital cardiologie = new Departament("Cardiologie");

        StructuraSpital chirurgie = new Departament("Chirurgie");

        StructuraSpital sectieCardio1 = new Sectie("Cardiologie Infantila");

        StructuraSpital sectieCardio2 = new Sectie("Terapie Intensiva Cardio");

        StructuraSpital sectieChirurgie1 = new Sectie("Chirurgie Generala");

        cardiologie.adaugaStructura(sectieCardio1);

        cardiologie.adaugaStructura(sectieCardio2);

        chirurgie.adaugaStructura(sectieChirurgie1);

        spital.adaugaStructura(cardiologie);

        spital.adaugaStructura(chirurgie);

        spital.afiseaza("");


    }
}




