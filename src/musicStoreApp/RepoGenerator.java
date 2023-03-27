package musicStoreApp;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoGenerator {

	public static List<Song> songs = new ArrayList<>();
	public static List<Album> albums = new ArrayList<>();
	public static List<Performer> performers = new ArrayList<>();
	public static List<User> users = new ArrayList<>();

	public static void generateMusicaStoreRepo() {

		// Create users
		users.add(new User("HELEN", "h", "1", new Basket()));
		users.add(new User("RACHEL", "r", "1", new Basket()));
		users.add(new User("DANIEL", "d", "1", new Basket()));
		

		// Create performers
		performers.add(new Performer(EnumPerformers.MADONNA));
		performers.add(new Performer(EnumPerformers.METALLICA));
		performers.add(new Performer(EnumPerformers.MILES_DAVIS));
		performers.add(new Performer(EnumPerformers.NIRVANA));

		// Create songs and add them to songs list, then create album and add songs list
		// to albums list. Add the album to performer
		Album album;
		songs.add(new Song("Till Death Do Us Part", "5:18"));
		songs.add(new Song("Dear Jessie", "4:22"));
		songs.add(new Song("Act of Contrition", "2:19"));
		songs.add(new Song("Love Song", "4:53"));
		album = new Album("Like a Prayer", Genre.POP, 20.0, Year.of(1989), performers.get(0), songs);
		albums.add(album);
		performers.get(0).addAlbum(album);

		songs = new ArrayList<>();
		songs.add(new Song("Veni Vedi Vici", "4:39"));
		songs.add(new Song("Iconic", "4:33"));
		songs.add(new Song("Beautiful Scars", "4:19"));
		songs.add(new Song("Illuminati", "3:43"));
		album = new Album("Rebel Heart", Genre.POP, 30.0, Year.of(2015), performers.get(0), songs);
		performers.get(0).setAlbums(album);
		albums.add(album);

		songs = new ArrayList<>();
		songs.add(new Song("Whiplash", "4:09"));
		songs.add(new Song("No Remorse", "6:27"));
		songs.add(new Song("Hit the Lights", "4:17"));
		songs.add(new Song("The Four Horsemen", "7:13"));
		album = new Album("Kill 'Em All", Genre.METAL, 40.0, Year.of(1983), performers.get(1), songs);
		performers.get(1).setAlbums(album);
		albums.add(album);

		songs = new ArrayList<>();
		songs.add(new Song("Flamencob Sketchers", "9:25"));
		songs.add(new Song("So What", "9:05"));
		songs.add(new Song("Blue in Green", "5:29"));
		songs.add(new Song("Freddie Freeloader", "9:36"));
		songs.add(new Song("All Blues", "11:34"));
		album = new Album("Kind of Blue", Genre.JAZZ, 50.0, Year.of(1953), performers.get(2), songs);
		performers.get(2).setAlbums(album);
		albums.add(album);

		songs = new ArrayList<>();
		songs.add(new Song("Territorial Pissins", "2:23"));
		songs.add(new Song("On a Plain", "3.16"));
		songs.add(new Song("Something in the Way", "3:52"));
		songs.add(new Song("Smells Like Teen Spirit", "5:01"));
		album = new Album("Nevermind", Genre.ROCK, 60.0, Year.of(1991), performers.get(3), songs);
		performers.get(3).setAlbums(album);
		albums.add(album);
		
	}

}
