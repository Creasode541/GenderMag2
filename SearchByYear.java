package hw6package;

import java.util.Comparator;

public class SearchByYear implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getReleaseYear();
	}
	
	public int compare2(Movie o1, Movie o2) {
		return (int) o1.getMovieRating();
	}

}
