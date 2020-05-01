package com.surbitonix97;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> albumSongs;

    public Album (String albumName)
    {
        this.albumName=albumName;
        this.albumSongs = new ArrayList<Song>();
    }

    public void setAlbumName(String albumName){
        this.albumName=albumName;
    }

    public String getAlbumName(){
        return albumName;
    }

    public ArrayList<Song> getAlbumSongs(){
        return albumSongs;
    }

    public void addSong(String songName, double duration)
    {
        Song song = new Song(songName,duration);
        if (checkSong(song)==true)
        {
            System.out.println("Adding song to album "+this.albumName);
            albumSongs.add(song);
        }else
            {
                System.out.println(songName);
            }

    }

    //check if song is already in the album
    private boolean checkSong(Song songName)
    {
        for (int i = 0;i<this.albumSongs.size();i++)
        {
            Song song = this.albumSongs.get(i);
            if (song.songName().equals(songName))
            {
                return true;
            }

        }
        return false;
    }





}
