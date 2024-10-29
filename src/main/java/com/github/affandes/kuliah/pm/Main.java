package com.github.affandes.kuliah.pm;
class Song {
    String title;
    Song next;
public class Main {
    public static void main(String[] args) {
        public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    Song head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
        } else {
            Song current = head;
            while (current != null) {
                System.out.println(current.title);
                current = current.next;
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        playlist.displayPlaylist();
    }
    }
}
