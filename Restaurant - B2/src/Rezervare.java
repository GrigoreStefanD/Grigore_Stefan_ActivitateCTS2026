public class Rezervare
{
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;


    Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzicaAmbientalaPersonalizata, String genMuzica)
    {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;


    }





    public boolean isAsezareLaGeam() {
        return asezareLaGeam;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public boolean isDecorareaMesei() {
        return decorareaMesei;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public boolean isMuzicaAmbientalaPersonalizata() {
        return muzicaAmbientalaPersonalizata;
    }



    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata)
    {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }


    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }



    @Override
    public String toString()
    {
        return "Rezervare{" +
                " asezareLaGeam=" + asezareLaGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareaMesei=" + decorareaMesei +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica  ='" + genMuzica + '\'' +
                '}';
    }



    public static class RezervareBuilder
    {
        private boolean asezareLaGeam;
        private boolean scauneErgonomice;
        private boolean decorareaMesei;
        private boolean muzicaAmbientalaPersonalizata;
        private String genMuzica;



        public RezervareBuilder()
        {
            this.asezareLaGeam = false;
            this.scauneErgonomice = false;
            this.decorareaMesei = false;
            this.muzicaAmbientalaPersonalizata = false;
            this.genMuzica = null;
        }


        public RezervareBuilder  setAsezareLaGeam(boolean asezareLaGeam)
        {
            this.asezareLaGeam = asezareLaGeam;
            return this;
        }



        public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice)
        {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }



        public RezervareBuilder setDecorareaMesei(boolean decorareaMesei)
        {
            this.decorareaMesei = decorareaMesei;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata)
        {
            this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }



        public RezervareBuilder setGenMuzica(String genMuzica)
        {
            this.genMuzica = genMuzica;
            return this;
        }



        public Rezervare build()
        {
            return new Rezervare(asezareLaGeam, scauneErgonomice, decorareaMesei, muzicaAmbientalaPersonalizata, genMuzica);
        }




    }



}