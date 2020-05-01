package com.surbitonix97;

public class Song {
    private String name;
    private double duration;

    public Song(String name, double duration)
    {
        this.name=name;
        this.duration=duration;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setDuration()
    {
        this.duration=duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration()
    {
        return duration;
    }

    public Song addSong(String name,double duration)
    {
        return new Song(name,duration);
    }
}
