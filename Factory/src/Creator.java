public abstract class Creator {


    public abstract Produs factoryMethod();


    public void operate() {
        Produs p = factoryMethod();
        System.out.println(p);
    }
}

