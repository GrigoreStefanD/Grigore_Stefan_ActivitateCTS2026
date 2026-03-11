import prototype.Reteta; 
import prototype.RetetaManager; 
import prototype.RetetaMedicament; 

import java.util.HashMap; 
import java.util.Map; 

public class Main
{
    public static void main(String[] args)
    {
        RetetaManager manager = new RetetaManager();

        Map<String, Double> solutiiParacetamol = new HashMap<>(); 
        solutiiParacetamol.put("paracetamol", 500.0);
        solutiiParacetamol.put("Panadol", 100.0);
        Reteta prototipParacetamol = new RetetaMedicament("Paracetamol 500mg", solutiiParacetamol); 
        manager.adaugaReteta("Paracetamol", prototipParacetamol);


        System.out.println("\n creare medicament nou pe baza retetei de Paracetamol..........");
        Reteta retetaNurofen = manager.getReteta("Paracetamol");
        ((RetetaMedicament) retetaNurofen).setNumeMedicament("Nurofen");

        System.out.println("\n Reteta prototip:");

        System.out.println(prototipParacetamol);

        System.out.println("\n reteta noua ( clonata si modificata )");

        System.out.println(retetaNurofen);

    }

}