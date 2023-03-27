package musicStoreApp;

public class AlbumManager {

	public void addAlbum(Album album) {
		RepoGenerator.albums.add(album);
	}

	public void removeAlbum(Album album) {
		RepoGenerator.albums.remove(album);
	}

	public Album retrieveAlbum(String albumName) {
		for (Album album : RepoGenerator.albums) {
			if (albumName.equalsIgnoreCase(album.getTitle()))
				return album;
		}
		return null;
	}

	public void printAlbums() {

		for (Album album : RepoGenerator.albums) {
			album.printAlbumInfo();

		}

	}
	
	public void printAlbumDetails() {

		for (Album album : RepoGenerator.albums) {
			album.printAlbumDetails();

		}

	}
}
