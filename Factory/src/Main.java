
public class Main {
    public static void main(String[] args) {
        System.out.println(" Demo  Factory Method pattern (exemplu simplu)");


        Creator creatorA = new CreatorA();
        Creator creatorB = new CreatorB();



        System.out.print(" CreatorA ->  ");
        creatorA.operate();


        System.out.print(" Creator B - > ");
        creatorB.operate();



        Produs p = creatorA.factoryMethod();
        System.out.println(" direct factorymethod  " + p.getName());
    }
}