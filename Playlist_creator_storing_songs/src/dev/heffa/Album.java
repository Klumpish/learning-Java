package dev.heffa;

import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
    // write code here
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>(); //initializes the field
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            Song song = new Song(title, duration);
            songs.add(song);
            return true;
        }
        return false; //returns false if song already exists
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index < songs.size()) {
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }


}
