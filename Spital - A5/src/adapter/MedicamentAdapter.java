package adapter;

import farmacie.IMedicamentFarmacie;
import spital.Medicament;




public class MedicamentAdapter extends Medicament implements IMedicamentFarmacie
{


    public MedicamentAdapter(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}




