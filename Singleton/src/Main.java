public class Main {
    public static void main(String[] args) {
        Animal animal1 = Animal.getInstance();
        animal1.setNume("leu");
        animal1.setSpecie("Pisica ");

        Animal animal2 = Animal.getInstance();
        animal2.setNume("Tigru ");
        animal2.setSpecie(" Tigru");

        Animal animal3 = Animal.getInstance();

        System.out.println("  ---Test Singleton Pattern---  ");
        System.out.println("  Animal 1 - Nume  " + animal1.getNume() + "  Specie  " + animal1.getSpecie());
        System.out.println("  Animal  2 - Nume  " + animal2.getNume() + "  Specie  " + animal2.getSpecie());
        System.out.println("  Animal 3 - Nume " + animal3.getNume() + "  Specie  " + animal3.getSpecie());
        System.out.println();
        System.out.println("  Animal 1 == Animal 2  " + (animal1 == animal2));
        System.out.println("  Animal   2 == Animal 3   " + (animal2 == animal3));
        System.out.println("  Animal 1 == Animal 3   " + (animal1 == animal3));
        System.out.println();
        System.out.println("  verificare  Doar o singura instanta exista");
    }
}