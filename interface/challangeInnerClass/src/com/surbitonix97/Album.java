package com.surbitonix97;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String title;
    private ArrayList<Song> songs;
    private String playlistName;
    //private ArrayList<Playlist> playlist;


    public Album(String title)
    {
        this.title=title;
        this.songs = new ArrayList<Song>();

    }

    public String getTitle()
    {
        return title;
    }



    public void addSong(String songName, double songDuration)
    {
        if (songCheck(songName))
        {
            Song song = new Song(songName,songDuration);
            this.songs.add(song);
            System.out.println("Adding song "+  songName +" to album "+ getTitle().toUpperCase());
        }else
            {
                System.out.println(songName+ " song already in Album...skipping");
            }
    }

    public void songList()
    {
        System.out.println("ALBUM\n"+getTitle().toUpperCase());
        int counter = 1;
        for (int i=0;i<this.songs.size();i++)
        {
            System.out.println( counter+". "+this.songs.get(i).getName()+" - "+this.songs.get(i).getDuration());
            counter++;
        }
    }

    //private methods
    public boolean songCheck(String songName)
    {
        for (int i=0;i<this.songs.size();i++)
        {
            Song song = this.songs.get(i);
            if (song.getName().equals(songName))
            {
               return false;
            }
        }
        return true;
    }

 /*   public Playlist songCheckPlaylist(String songName)
    {
        boolean check;
        for (int i=0;i<this.songs.size();i++)
        {
            Song song = this.songs.get(i);
            if (song.getName().equals(songName))
            {
                check = true;
            }
        }
        check = false;

    }

    public void addSongToPlaylist(String PlaylistName, String songName)
    {
        if (songCheckPlaylist(songName)!=null)
        {
            this.playlist.add(songName);

        }

    }

    private class Playlist
    {
        private String name;
        private ArrayList<String> songList;

        public Playlist(String name)
        {
            this.name=name;
            this.songList = new ArrayList<String>();
        }

        public String getName()
        {
            return name;
        }

        public ArrayList<String> addSong(String songName)
        {
            this.songList.add(songName);
            return songList;
        }
    }
*/


}
