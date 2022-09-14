package application;

import java.util.Locale;
import java.util.Scanner;

import model.Shorter;
import model.exceptions.InvalidURLException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Link: ");

			String link = sc.nextLine();
			Shorter shorter = new Shorter(link);			

			System.out.println();
			System.out.print(shorter);
		} catch (InvalidURLException e) {
			System.out.println("Invalid URL " + e.getMessage());
		}

		sc.close();

	}

}
