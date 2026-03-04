public class Pizza
{
    private final String aluat;
    private final String sos;
    private final java.util.List<String> toppinguri;
    private final String marime;


    Pizza(String aluat, String sos, java.util.List<String> toppinguri, String marime) {
        this.aluat = aluat;
        this.sos = sos;
        this.toppinguri = java.util.Collections.unmodifiableList(new java.util.ArrayList<>(toppinguri));
        this.marime = marime;
    }


    public String getAluat() {
        return aluat;
    }

    public String getSos() {
        return sos;
    }

    public java.util.List<String> getToppinguri() {
        return toppinguri;
    }

    public String getMarime() {
        return marime;
    }


    public String toString()

    {
        return " marime=" + marime + ", aluat  =  " + aluat + ", sos =  " + sos + ", toppinguri=  " + toppinguri;
    }
}



