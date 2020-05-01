
package com.surbitonix97;

import java.util.ArrayList;

public class PlayList {
    private String playlist;
    private ArrayList<Album> Album;
    private ArrayList<String> playlistSongs;

    public PlayList(String playlist)
    {
        this.playlist=playlist;
        this.Album =new ArrayList<Album>();
    }

    public String getPlaylist()
    {
        return playlist;
    }

    public void addSong(String songName)
    {
        if (checkSong(songName))
        {
            this.playlistSongs.add(songName);
        }

    }

    public void playlistSongs()
    {
        for (int i=0;i<this.playlistSongs.size();i++)
        {
            System.out.println(this.playlistSongs.indexOf(i));
        }
    }

    private boolean checkSong(String songName)
    {
        for (int i = 0; i<this.Album.size(); i++)
        {
            Album album = this.Album.get(i);
            if (!album.songCheck(songName))
            {
                System.out.println("found song");
                return true;
            }
             System.out.println("song not found...skipping");
        }
        return false;
    }


}
