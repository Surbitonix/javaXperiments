package com.surbitonix97;

import java.util.LinkedList;

public class Playlist {
    private String playlistName;
    private LinkedList<String> playlist;

    public Playlist(String playlistName){
        this.playlistName=playlistName;
    }

    public String getPlaylistName(){
        return playlistName;
    }

    public void setPlaylist(LinkedList<String> playlist){
        this.playlist=playlist;
    }

    public void addSong(String songName,double duration)
    {
        Song song = new Song(songName,duration);
        if (checkSong(song)==true){
            System.out.println("adding song");
            this.playlist.add(songName);
        }else {
            System.out.println("song already exists");
        }
    }

    private boolean checkSong(Song songName)
    {
        for (int i=0;i<playlist.size();i++){
            if (playlist.get(i).equals(songName)){
                return false;
            }
        }
        return true;
    }


}
