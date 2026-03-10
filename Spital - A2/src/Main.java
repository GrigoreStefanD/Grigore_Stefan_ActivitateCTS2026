
public class Main
{
    public static void main(String[] args)
    {
        PersonalSpital p1 = PersonalFactory.createPersonal(TipPersonal.Medic, " Dr. Gopel ");


        PersonalSpital p2 = PersonalFactory.createPersonal(TipPersonal.Asistent, " Ioonescu ");


        PersonalSpital p3 = PersonalFactory.createPersonal(TipPersonal.Brancardier, " vasile ");



        p1.descriere();
        p2.descriere();
        p3.descriere();


    }


}