package hw6package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {
	// Main Driver class
	public static void main(String[] args) throws Exception {

		// create a file instance for movies.txt
		System.out.println(new File(".").getAbsolutePath());
		File file = new File("movies.txt");

		// create a scanner for movies.txt
		Scanner input = new Scanner(file);

		// create an ArrayList of movies
		ArrayList<Movie> movieArrList = new ArrayList<>();

		// create a list of movies
		List<Movie> movieList = new ArrayList<>();

		// print out the headers for each category
		System.out.print("ID, number of viewers, rating, release year, movie name\n");

		// read data from movies.txt
		while (input.hasNext()) {
			int movieIDFile = input.nextInt();
			int movieViewsFile = input.nextInt();
			double movieRatingFile = input.nextDouble();
			int movieReleaseYearFile = input.nextInt();
			String movieNameFile = input.nextLine();
			Movie movie = new Movie(movieIDFile, movieViewsFile, movieRatingFile, movieReleaseYearFile, movieNameFile);
			movieArrList.add(movie);
			movieList.add(movie);
			System.out.println(movieIDFile + " " + movieViewsFile + " " + movieRatingFile + " " + movieReleaseYearFile
					+ " " + movieNameFile);
		}

		// close the file
		input.close();

		// convert ArrayList to array
		Object[] movieArr = movieArrList.toArray();

		// crate an array to hold movie ratings
		double[] movieRatingsArray = new double[100];

		// search movieRatingsArray for a specific rating
		for (int i = 0; i < movieArr.length - 1; i++) {
			Movie tempmovie = (Movie) movieArr[i];
			double movieRatings = tempmovie.getMovieRating();
			movieRatingsArray[i] = movieRatings;
			if (movieRatingsArray[i] == 4.3) {
				System.out.println("is true");
			}
		}
		
		// search list by year and then by rating
		boolean index1 = movieList.contains(1998);
		boolean index2 = movieList.contains(2.4);
		
		// print out results from list search
		System.out.println(index1);
		System.out.println(index2);

	}
}