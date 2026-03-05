public class Main

{

    public static void main(String[] args)

    {
        System.out.println("      ");

        System.out.println("       FABRICA DE PRAJITURI   - FACTORY METHOD           ");

        System.out.println(" \n");
        Cofetaria cofetariaPremium = new CofetariaPremium();
         Cofetaria cofetariaEconomica = new CofetariaEconomica();
         Cofetaria cofetariaSpecializata = new CofetariaSpecializata();

        System.out.println("   COMANDA DE LA COFETARIA  PREMIUM:  ");
          cofetariaPremium.comandaPrajitura();

          System.out.println("  COMANDA DE LA COFETARIA   ECONOMICA: ");
        cofetariaEconomica.comandaPrajitura();

        System.out.println("  COMANDA DE LA COFETARIA SPECIALIZATA  (Eclair): ");
         cofetariaSpecializata.comandaPrajitura();

          System.out.println(">  COMANDA DE LA COFETARIA SPECIALIZATA (Savarina) :");
        cofetariaSpecializata.comandaPrajitura();

        System.out.println(" ");

        System.out.println(" MULTUMESC    ");

        System.out.println(" ");
    }
}