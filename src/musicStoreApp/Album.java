package musicStoreApp;

import java.time.Year;  
import java.util.List;

public class Album {

	private static int id = 1;
	private int albumID;
	private String title;
	private Genre genre;
	private double price;
	private Year releaseYear;
	private Performer performer;
	private List<Song> songs;
	

	public Album(String title, Genre genre, double price, Year releaseYear, Performer performer, List<Song> songs) {
		this.albumID = id++;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.releaseYear = releaseYear;
		this.performer = performer;
		this.songs = songs;
	}


	public int getAlbumID() {
		return albumID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Year getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Year releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Performer getPerformer() {
		return performer;
	}

	public void setPerformer(Performer performer) {
		this.performer = performer;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public void removeSong(Song song) {
		songs.remove(song);
	}
	
	
	public void printAlbumInfo(){
		
		System.out.println("ALBUM ID: " +  getAlbumID());
		System.out.println("ALBUM TITLE: " + this.title);
		System.out.println("PERFORMER NAME: " + performer.getName());
		System.out.println("PRICE: $" + this.price);
		System.out.println();
		
	}

	public void printAlbumDetails(){
		
		System.out.println("ALBUM ID: " + getAlbumID());
		System.out.println("ALBUM TITLE: " + this.title);
		System.out.println("GENRE: " + this.genre);
		System.out.println("PRICE: $" + this.price);
		System.out.println("PERFORMER NAME: " + performer.getName());
		System.out.println("--SONGS IN THE ALBUM--");
		for(Song song : songs) {
			System.out.println(song.getTitle() + " - " + song.getLength());
		}
		
		System.out.println();
		
	}
	
}
