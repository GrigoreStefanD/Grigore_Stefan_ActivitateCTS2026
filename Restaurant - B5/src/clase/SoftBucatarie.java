package clase;

public class SoftBucatarie implements ISoftBucatarie {
    private String numeBucatar;

    public SoftBucatarie(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    @Override
    public void printeazaFactura(double total) {
        System.out.println("Bucatarul " + numeBucatar + " a emis factura: " + total + " RON");
    }
}
