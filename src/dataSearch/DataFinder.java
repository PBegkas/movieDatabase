package dataSearch;
import java.util.ArrayList;
import dataModel.*;
import dataLoading.DataLoader;

public class DataFinder {
	
	private DataLoaderFactory a = new DataLoaderFactory();
	private ArrayList<Movie> movies;
	private ArrayList<Actor> actors;
	private ArrayList<Country> countries;
	private ArrayList<Director> directors;
	
	
	public DataFinder(DataLoaderFactory a) {
		this.a = a;
		movies = a.getMovieList;
		actors = a.getActorList;
		countries = a.getCountryList;
		directors = a.getDirectorList;
	}
	
	//Search for a movie by id
	public Movie findMovie(int id) {
		for(int i=0; i<movies.size(); i++) {
			if (movies.get(i).getID() == id) {
				return movies.get(i);
			}
		}
		return null;
	}
	
	//Search for a movie by a given string
	public Movie findMovie(String movieName) {
		for(int i=0; i<movies.size(); i++) {
			if (movies.get(i).getTitle().equals(movieName)) {
				return movies.get(i);
			}
		}
		return null;
	}
	
	//Search for movies of the given genre 
	public ArrayList<Movie> findMoviesByGenre(String genre) {
		ArrayList<Movie> rlist = new ArrayList<Movie>();
		for(int i=0; i<movies.size(); i++) {
			ArrayList<Genre> temp = new ArrayList<Genre>();
			temp = movies.get(i).getGenreList();
			for(int j=0; j<temp.size(); j++) {
				if(temp.get(j).getN().equals(genre)) {
					rlist.add(movies.get(i));
				}
			}
		}
		return rlist;
	}
	
	//Search for movies made by the given country
	public ArrayList<Movie> findMoviesByCountry(String country) {
		ArrayList<Movie> rlist = new ArrayList<Movie>();
		for(int i=0; i<movies.size(); i++) {
			if(movies.get(i).getCountry().getN().equals(country)) {
				rlist.add(movies.get(i));
			}
		}
		return rlist;
	}

	
	//Search for movies that the given actor participates
	public ArrayList<Movie> findMoviesByActor(String actor) {
		ArrayList<Movie> rlist = new ArrayList<Movie>();
		for(int i=0; i<movies.size(); i++) {
			ArrayList<Actor> temp = new ArrayList<Actor>();
			temp = movies.get(i).getActorList();
			for(int j=0; j<temp.size(); j++) {
				if(temp.get(j).getN().equals(actor)) {
					rlist.add(movies.get(i));
				}
			}
		}
		return rlist;
	}
	
	//Search for movies that where directed by the given director
	public ArrayList<Movie> findMoviesByDirector(String director) {
		ArrayList<Movie> rlist = new ArrayList<Movie>();
		for(int i=0; i<movies.size(); i++) {
			if(movies.get(i).getDirector().getN().equals(director)) {
				rlist.add(movies.get(i));
			}
		}
		return rlist;
	}
}