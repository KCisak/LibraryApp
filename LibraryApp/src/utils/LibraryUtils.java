package utils;

import java.util.Arrays;

import data.Book;
import data.Magazine;
import data.Library;
import data.Publication;

public class LibraryUtils {

	public static void printBooks(Library lib) {
		Publication[] publications = lib.getPublications();
		//sortowanie tablic
		int publicationsNumber = lib.getPublicationsNumber();
		 Arrays.sort(publications, new Library.AlphabeticalComparator());
		int countBooks = 0;
		for (int i = 0; i < publicationsNumber; i++) {
			if (publications[i] instanceof Book) {
				System.out.println(publications[i]);
				countBooks++;
			}
		}
		if (countBooks == 0) {
			System.out.println("Brak książek w bibliotece");
		}
	}

	public static void printMagazines(Library lib) {
		Publication[] publications = lib.getPublications();
	    Arrays.sort(publications, new Library.AlphabeticalComparator());
		int publicationsNumber = lib.getPublicationsNumber();
	   	int countMagazines = 0;
		for (int i = 0; i < publicationsNumber; i++) {
			if (publications[i] instanceof Magazine) {
				System.out.println(publications[i]);
				countMagazines++;
			}
		}

		if (countMagazines == 0) {
			System.out.println("Brak Magazynów w bibliotece");
		}
	}

}
