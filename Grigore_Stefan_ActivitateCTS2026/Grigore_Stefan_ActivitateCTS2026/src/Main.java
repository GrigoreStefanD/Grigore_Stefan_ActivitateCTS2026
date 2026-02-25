public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstanta();


        Singleton s2 = Singleton.getInstanta();


        s1.afiseazaMesaj();


        System.out.println("   s1 == s2?   " + (s1 == s2));
    }
}