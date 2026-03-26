public class Main {
    public static void main(String[] args)
    {
        ContClient clientVechit = new ContClient(" Ion popescu", " ion@email.com", "0722 111 222");
        System.out.println(" S-a creat contul initial");



        ContClient clientRevenit = clientVechit.clone();
        System.out.println(" Clientul a revenit S-a clonat contul existent ");

        System.out.println(clientVechit);
        System.out.println(clientRevenit);


    }



}



