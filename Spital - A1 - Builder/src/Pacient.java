public class Pacient
{
    private final String nume;
    private final String cnp;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatInterior;


    private Pacient(PacientBuilder builder)
    {
        this.nume = builder.nume;
        this.cnp = builder.cnp;
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciDeCamera = builder.papuciDeCamera;
        this.halatInterior = builder.halatInterior;
    }


    @Override
    public String toString()
    {
        return "Pacient: " + nume + "  |Facilitati:  " +
                (patRabatabil ? " [Pat Rabatabil]  " : "") +
                (micDejunInclus ? " [Mic Dejun]  " : "") +
                (papuciDeCamera ? " [Papuci]  " : "") +
                (halatInterior ? " [Halat]  " : "");
    }


    public static class PacientBuilder
    {
        private String nume;
        private String cnp;
        private boolean patRabatabil = false;
        private boolean micDejunInclus = false;
        private boolean papuciDeCamera = false;
        private boolean halatInterior = false;


        public PacientBuilder(String nume, String cnp)
        {
            this.nume = nume;
            this.cnp = cnp;
        }


        public PacientBuilder adaugaPatRabatabil()
        {
            this.patRabatabil = true;
              return this;
        }

        public PacientBuilder adaugaMicDejun()
        {
            this.micDejunInclus = true;
              return this;
        }

        public PacientBuilder adaugaPapuci()
        {
            this.papuciDeCamera = true;
              return this;
        }

         public PacientBuilder adaugaHalat()
        {
             this.halatInterior = true;
              return this;
        }

         public Pacient build()
          {
              return new Pacient(this);
        }
    }
}

