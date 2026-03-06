public class Main

{

    public static void main(String[] args)
    {


        SamponPar sampon1 = new SamponPar(" sampon premium", "  ingrediente naturale  ", 500);

        System.out.println(" sampon original:   " + sampon1);
          SamponPar sampon2 = sampon1.cloneaza();
            sampon2.setNume(" sampon copie   ");

        System.out.println(" sampon clonat:   " + sampon2);

        System.out.println(" verificare : sampon1 != sampon2 :    " + (sampon1 != sampon2));
          SamponPar sampon3 = sampon1.cloneaza();
             sampon3.setVolum(250);

        System.out.println("sampon CLONAT 3: " + sampon3);

    }

}