package musicStoreApp;

import java.util.Scanner;

public class Main {

	static Scanner scan;

	public static void main(String[] args) {

		int choice = 0;
		scan = new Scanner(System.in);

		RepoGenerator.generateMusicaStoreRepo();

		System.out.println("!!!FOR TESTING PURPOSES, PLEASE FIND THE USER INFO BELOW!!!");
		System.out.println("----------------------------------");
		for (User user : RepoGenerator.users) {
			System.out.println("User Number: " + user.getUserID());
			System.out.println("User Email: " + user.getEmail());
			System.out.println("User Password: " + user.getPassword());
			System.out.println("----------------------------------");
		}

		do {

			System.out.print("Enter email: ");
			String email = scan.next();
			System.out.print("Enter password: ");
			String password = scan.next();
			System.out.println();

			for (User user : RepoGenerator.users) {
				if (!user.checkCredentials(email, password)) {
					continue;
				} else {
					System.out.println("Welcome " + user.getName());

					do {
						System.out.println();
						System.out.println("1. View your basket");
						System.out.println("2. View albums");
						System.out.println("3. View album details");
						System.out.println("4. View performers");
						System.out.println("5. Add album to your basket");
						System.out.println("6. Remove album from your basket");
						System.out.println("7. Buy the itmes in your basket");

						isValidNumber();
						choice = scan.nextInt();

						switch (choice) {
						case 1 -> {
							user.printUserBasketInfo();
						}

						case 2 -> {
							AlbumManager albumManager = new AlbumManager();
							albumManager.printAlbums();
						}
						case 3 -> {
							AlbumManager albumManager = new AlbumManager();
							albumManager.printAlbumDetails();
						}
						case 4 -> {
							for (Performer performer : RepoGenerator.performers) {
								performer.printPerformerInfo();
							}
						}
						case 5 -> {
							System.out.println("Enter the code of the album: ");
							isValidNumber();
							int code = scan.nextInt();
							if (code < 1 || code > RepoGenerator.albums.size()) {
								System.out.println("Please enter a valid code");
								break;
							} else {
								user.getBasket().addAlbum(RepoGenerator.albums.get(code - 1));
								user.printUserBasketInfo();
							}
						}
						case 6 -> {
							System.out.println("Enter the code of the album: ");
							isValidNumber();
							int code = scan.nextInt();
							if (code < 1 || code > RepoGenerator.albums.size()) {
								System.out.println("Please enter a valid code");
								break;
							} else {
								user.getBasket().removeAlbum(RepoGenerator.albums.get(code - 1));
								user.printUserBasketInfo();
							}
						}
						case 7 -> {
							user.setBasket();
							user.printUserBasketInfo();
						}
						default -> {
							if (choice == -1) {
								System.out.println("Bye Bye " + user.getName());
								System.out.println("To continue with another user, please provide");
							} else {
								System.out.println("Enter a valid choice or -1 to exit");
							}
						}
						}
					} while (choice != -1);
				}
			}
		} while (true);
	}

	static void isValidNumber() {

		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.print("Please enter a valid number: ");
		}
	}
}
