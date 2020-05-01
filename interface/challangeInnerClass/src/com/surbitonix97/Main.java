package com.surbitonix97;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Album myAlbum = new Album("travails");
        myAlbum.addSong("travalis",1.50);
        myAlbum.addSong("parkanuka",2.50);
        myAlbum.songList();
        myAlbum.addSong("travalis",1.50);
        myAlbum.songList();

        PlayList myPlaylist = new PlayList("myPlaylist");
        myPlaylist.addSong("travalis");
        System.out.println(myPlaylist.getPlaylist());



    }
}
