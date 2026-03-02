

public class FabricaFormeAlbastre extends FabricaFormeAbstracta

{
    @Override
    public Forma creeazaPatrat() {
        return new Patrat();
    }


    @Override
    public Forma creeazaCerc() {
        return new Cerc();
    }
}

