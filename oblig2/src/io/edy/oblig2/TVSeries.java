package io.edy.oblig2;

import java.util.ArrayList;

public class TVSeries {
    private String title;
    private String desc;
    private ArrayList<Episode> episodeList = new ArrayList<>();
    private int date;
    private int seasons = 0;
    private int averageTime;

    public TVSeries(String title, String desc, int date, int seasons) {
        this.title = title;
        this.desc = desc;
        this.date = date;
        this.seasons = seasons;
    }


    // Getters / Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<Episode> getEpisodeList() {
        return episodeList;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodeList(ArrayList<Episode> episodeList) {
        this.episodeList = episodeList;
    }


    // Add an episode to a season and get the average play time
    public void addEpisode(Episode episode) {

        if (episode.getSeason() == seasons + 1) {
            episodeList.add(episode);
        }

        else {

            if (episode.getSeason() == seasons +1) {
                seasons += 1;
            }
            episodeList.add(episode);

            averagePlayTime();
        }

    }

    // List episodes from a specific season
    public ArrayList<Episode> ListEpisodesFromSeason(int x){

        int i;

        ArrayList<Episode> episodes = new ArrayList<>();

        for ( i=0; i < episodeList.size(); i++ ){
            if ( episodeList.get(i).getSeason() == x ){
                episodes.add(episodeList.get(i));
            }
        }

        return episodes;
    }


    @Override
    public String toString() {
        return title + " - " + desc + " " + episodeList;
    }


    // method for getting average time for printed episodes. This executes every time episode is added
    private void averagePlayTime(){
        int i;
        int totalPlayTime = 0;

        for ( i=0; i < episodeList.size(); i++ ){

            totalPlayTime += episodeList.get(i).getPlayTime();
        }

        averageTime = totalPlayTime / episodeList.size();
    }

    public int getAverageTime() {
        return averageTime;
    }
}
