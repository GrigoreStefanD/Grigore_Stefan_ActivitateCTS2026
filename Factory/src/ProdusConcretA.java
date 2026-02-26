public class ProdusConcretA implements Produs {
    private final String name = " ProdusConcret A ";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Creat  " + name;
    }
}

