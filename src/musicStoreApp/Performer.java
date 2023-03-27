package musicStoreApp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Performer {
	
	private UUID id;
	private EnumPerformers name;
	private List<Album> albums = new ArrayList<>();
	
	public Performer(EnumPerformers name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}

	public Performer(EnumPerformers name, List<Album> albums) {
		this(name);
		this.albums = albums;
	}

	public UUID getId() {
		return id;
	}
	
	public EnumPerformers getName() {
		return name;
	}

	public void setName(EnumPerformers name) {
		this.name = name;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(Album album) {
		this.albums.add(album);
	}

	public void addAlbum(Album album) {
		albums.add(album);

	}

	public void removeAlbum(Album album) {
		albums.remove(album);
	}

	public void printPerformerInfo() {

		System.out.println("PERFORMER NAME: " + this.name);
		System.out.println("NUMBER OF ALBUM(S) OF PERFORMER: " + albums.size());
		for (Album album : albums) {
			System.out.println(album.getTitle());
		}

		System.out.println();
	}
	
}
