package no.hiof.larseknu.movietime.model;

public class Rolle {
    private String karakterFornavn, karakterEtternavn;
    private Person skuespiller;

    public Rolle(String karakterFornavn, String karakterEtternavn, Person skuespiller) {
        this.karakterFornavn = karakterFornavn;
        this.karakterEtternavn = karakterEtternavn;
        this.skuespiller = skuespiller;
    }

    public String getKarakterFornavn() {
        return karakterFornavn;
    }

    public void setKarakterFornavn(String karakterFornavn) {
        this.karakterFornavn = karakterFornavn;
    }

    public String getKarakterEtternavn() {
        return karakterEtternavn;
    }

    public void setKarakterEtternavn(String karakterEtternavn) {
        this.karakterEtternavn = karakterEtternavn;
    }

    public Person getSkuespiller() {
        return skuespiller;
    }

    public void setSkuespiller(Person skuespiller) {
        this.skuespiller = skuespiller;
    }

    @Override
    public String toString() {
        return karakterFornavn + " " + karakterEtternavn + " spilles av " + skuespiller;
    }
}
