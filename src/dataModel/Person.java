package dataModel;

import java.util.ArrayList;

public abstract class Person {
	
	String uniqueID;
	String name;
	ArrayList<Movie> movies;
	
	public Person(String n, String id) {
		uniqueID = id;
		name = n;
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
	}

}
