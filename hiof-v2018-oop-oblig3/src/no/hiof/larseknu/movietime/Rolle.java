package no.hiof.larseknu.movietime;

public class Rolle extends Person{
    private String karakterFornavn;
    private String karakterEtternavn;
    private String skuespiller;

    public Rolle(String fornnavn, String etternavn, String karakterFornavn, String karakterEtternavn) {
        super(fornnavn, etternavn);
        this.karakterFornavn = karakterFornavn;
        this.karakterEtternavn = karakterEtternavn;
    }

    // GETTER
    public String getKarakterFornavn() {
        return karakterFornavn;
    }

    public String getKarakterEtternavn() {
        return karakterEtternavn;
    }

    public String getSkuespiller() {
        return skuespiller;
    }

    // SETTER
    public void setKarakterFornavn(String karakterFornavn) {
        this.karakterFornavn = karakterFornavn;
    }

    public void setKarakterEtternavn(String karakterEtternavn) {
        this.karakterEtternavn = karakterEtternavn;
    }

    public void setSkuespiller(String skuespiller) {
        this.skuespiller = skuespiller;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +  " spiller " + getKarakterFornavn() + " " + getKarakterEtternavn();
    }
}
