
public class FabricaFormeRosii extends FabricaFormeAbstracta

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

