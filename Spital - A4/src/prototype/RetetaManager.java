package prototype;

import java.util.HashMap;
import java.util.Map;

public class RetetaManager
{
    private Map<String, Reteta> prototipuri = new HashMap<>();

    public void adaugaReteta(String nume, Reteta reteta)
    {
        prototipuri.put(nume, reteta);
    } 

    public Reteta getReteta(String nume)
    {
        Reteta reteta = prototipuri.get(nume);
        if (reteta == null) {
            throw new IllegalArgumentException("Reteta cu numele '" + nume + "' nu exista in manager.");
        }
        return reteta.clone();
    }

}