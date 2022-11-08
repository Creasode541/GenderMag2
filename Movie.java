package hw6package;

public class Movie {
	// instantiating variables
	private int movieID;
	private int movieViews;
	private double movieRating;
	private int releaseYear;
	private String movieName;
	
	// no-arg constructor for Movie
	public Movie() {
		super();
	}
	
	// arg constructor for Movie
	public Movie(int ID, int views, double rating, int year, String name) {
		movieID = ID;
		movieViews = views;
		movieRating = rating;
		releaseYear = year;
		movieName = name;
	}
	// getter for movieID
	public int getMovieID() {
		return movieID;
	}
	
	// setter for movieID
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	// getter for movieRating
	public double getMovieRating() {
		return movieRating;
	}

	// setter for movieRating
	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	// getter for movieName
	public String getMovieName() {
		return movieName;
	}
	
	// setter for movieName
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	// getter for releaseYear
	public int getReleaseYear() {
		return releaseYear;
	}

	// setter for releaseYear
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Movie [ID number=" + movieID + ", Rating=" + movieRating + ", Year of Release="
				+ releaseYear + ", Name of Movie=" + movieName + "]";
	}

	// getter for movieViews
	public int getMovieViews() {
		return movieViews;
	}

	// setter for movieViews
	public void setMovieViews(int movieViews) {
		this.movieViews = movieViews;
	}
}
