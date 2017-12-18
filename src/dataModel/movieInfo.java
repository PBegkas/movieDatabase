package dataModel;

import java.util.ArrayList;

public abstract class MovieInfo {
	String name;
	ArrayList<Movie> movies;
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public MovieInfo(String n) {
		name = n;
	}
}