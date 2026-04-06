package clase;



public class AdapterBar extends SoftBar implements ISoftBucatarie
{
    public AdapterBar(String numeOspatar) {
        super(numeOspatar);
    }

    @Override
    public void printeazaFactura(double total) {
        super.printeazaNota(total);
    }
}



