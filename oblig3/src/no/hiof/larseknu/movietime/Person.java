package no.hiof.larseknu.movietime;

public class Person {
    private String fornavn;
    private String etternavn;

    public Person(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    @Override
    public String toString() {
        return fornavn + " " + etternavn;
    }

}
