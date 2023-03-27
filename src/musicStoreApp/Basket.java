package musicStoreApp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Basket {
	
	private UUID id;
	private List<Album> albums;
	private double totalPrice;
	private int totalItems;
	

	public Basket() {
		this.id = UUID.randomUUID();
		this.albums = new ArrayList<>();
		this.totalPrice = 0.0;
		this.totalItems = 0;
	}

	public UUID getId() {
		return id;
	}
	
	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
	public void addAlbum(Album album) {
		albums.add(album);
	}
	
	public void removeAlbum(Album album) {
		albums.remove(album);
	}
	
	public void printBasketInfo() {
		totalPrice = 0.0;
		totalItems = 0;
		
		for(Album album : albums) {
		
			totalPrice += album.getPrice();
			totalItems++;
			System.out.println("Album ID: " + album.getAlbumID());
			System.out.println("Album Title: " + album.getTitle());
			System.out.println("Price: $" + album.getPrice());
			System.out.println();
		}
		
		System.out.println("Total Item(s) in the Basket: " + totalItems);
		System.out.println("Total Price: $" + totalPrice);
		System.out.println();
	}
	
	public void printDetailedBasketInfo() {
		totalPrice = 0.0;
	
		
		for(Album album : albums) {
			totalPrice += album.getPrice();
			totalItems++;
			album.printAlbumInfo();
		}
		
		System.out.println("Total Item(s) in the Basket: " + totalItems);
		System.out.println("Total Price: $" + totalPrice);
		System.out.println();
	}
	

	
}
