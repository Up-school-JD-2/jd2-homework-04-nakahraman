package musicStoreApp;

public class Song {
	
	private static int id = 1;
	private int songID;
	private String title;
	private String length;
	
	
	public Song(String title, String length) {
		this.songID = id++;
		this.title = title;
		this.length = length;
	}

	public int getSongID() {
		return songID;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getLength() {
		return length;
	}


	public void setLength(String length) {
		this.length = length;
	}

	
	void printSongInfo() {

		System.out.println("Song Title: " + this.title);
		System.out.println("Song Length: " + this.length + " minutes.");
		System.out.println();
	}

}
