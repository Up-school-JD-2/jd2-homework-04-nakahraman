package musicStoreApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class User {

	private static int id = 1;
	private int userID;
	private String name;
	private String email;
	private String password;
	private Basket basket;

	public User(String name, String email, String password, Basket basket) {
		this.userID = id++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.basket = basket;
	}

	public int getUserID() {
		return userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket() {
		this.basket = new Basket();
	}

	public boolean checkCredentials(String email, String password) {
		if (this.email.equals(email) && this.password.equals(password)) {
			return true;
		}
		return false;
	}

	public void printUserBasketInfo() {

		System.out.println("*** " + this.name + "'s BASKET ***");
		basket.printBasketInfo();
	}

}
