import clase.AdapterBar;
import clase.ISoftBucatarie;
import clase.SoftBucatarie;

public class Main
{
    public static void printeaza(ISoftBucatarie soft, double total)
    {
        soft.printeazaFactura(total);
    }

    public static void main(String[] args)
    {
        ISoftBucatarie softBucatarie = new SoftBucatarie(" Gigel");
        printeaza(softBucatarie, 150.5);

        ISoftBucatarie adapterBar = new AdapterBar("   Dorel");
        printeaza(adapterBar, 45.0);
    }
}


