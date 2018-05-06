package io.edy.oblig2;

public class Episode {
    private int episodeNumber;
    private int season;
    private String titel;
    private int playTime;

    public Episode(int episodeNumber, int season, String titel, int playTime) {
        this.episodeNumber = episodeNumber;
        this.season = season;
        this.titel = titel;
        this.playTime = playTime;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    @Override
    public String toString() {
        return "\n" + "Titel: " + titel + " Season: " + season + " Episode: " + episodeNumber + " Time: " + playTime + " min";
    }


}
