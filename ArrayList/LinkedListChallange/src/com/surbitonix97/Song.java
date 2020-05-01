package com.surbitonix97;

public class Song {
    private String songName;
    private double duration;

    public Song(String title, double duration){
        this.songName=songName();
        this.duration=duration;
    }

    public void setTitle(String title){
        this.songName=title;
    }

    public String songName(){
        return songName;
    }

    public void setDuration(double duration){
        this.duration=duration;
    }

    public double getDuration()
    {
        return duration;
    }

    public static Song addSong(String title,double duration){
        return new Song(title,duration);
    }






}
