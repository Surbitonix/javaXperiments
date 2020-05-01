package com.surbitonix97;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //create the album
        Album testAlbum = new Album("testAlbum");
        //add song
        testAlbum.addSong("test2",2.37);
        //create link list to get list of songs under the album
        LinkedList<Album> albmum001 = new LinkedList<Album>();
        albmum001.add(testAlbum);
        //create playlist
        Playlist myPlaylist = new Playlist("myPlaylist");
        myPlaylist.addSong("test001",2);

    }
}
