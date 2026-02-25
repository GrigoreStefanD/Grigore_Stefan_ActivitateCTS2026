
public class Singleton {

    private static Singleton instanta;


    private Singleton() {
    }


    public static Singleton getInstanta() {
        if (instanta == null) {
            instanta = new Singleton();
        }
        return instanta;
    }

    public void afiseazaMesaj() {
        System.out.println(" Salut eu sunt instanta Singleton  ");
    }
}

