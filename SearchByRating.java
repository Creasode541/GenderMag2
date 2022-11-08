package hw6package;

import java.util.Comparator;

public class SearchByRating implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return (int) o1.getMovieRating();
	}

}
