package dataModel;

import java.util.ArrayList;

public class Movie {
	private String title;
	private int id;
	private String movieSummary;
	private String imdbID;
	private String titleSpanish;
	private String imdbPictureURL;
	private String year;
	private String rtID;
	private String rtAllCriticsRating;
	private String rtAllCriticsNumReviews;
	private String rtAllCriticsNumFresh;
	private String rtAllCriticsNumRotten;
	private String rtAllCriticsScore;
	private String rtTopCriticsRating;
	private String rtTopCriticsNumReviews;
	private String rtTopCriticsNumFresh;
	private String rtTopCriticsNumRotten;
	private String rtTopCriticsScore;
	private String rtAudienceRating;
	private String rtAudienceNumRatings;
	private String rtAudienceScore;
	private String rtPictureURL;
	private Country country;
	private Director director;
	private ArrayList<Actor> actors;
	private ArrayList<Genre> genres;
	private ArrayList<String> locations;
	private ArrayList<String> userTags = null;
	private int tagsSum;
	private ArrayList<Double> userRatings = null;
	private int ratingsNum;
	public Movie(String title,int id, String imdbID,String titleSpanish,String imdbPictureURL,String year,String rtID,String rtAllCriticsRating,String rtAllCriticsNumReviews,String rtAllCriticsNumFresh,String rtAllCriticsNumRotten,String rtAllCriticsScore,String rtTopCriticsRating,String rtTopCriticsNumReviews,String rtTopCriticsNumFresh,String rtTopCriticsNumRotten,String rtTopCriticsScore,String rtAudienceRating,String rtAudienceNumRatings,String rtAudienceScore,String rtPictureURL) {
		this.title = title;
		this.id = id;
		this.imdbID = imdbID;
		this.titleSpanish = titleSpanish;
		this.imdbPictureURL = imdbPictureURL;
		this.year = year;
		this.rtID = rtID;
		this.rtAllCriticsRating = rtAllCriticsRating;
		this.rtAllCriticsNumReviews = rtAllCriticsNumReviews;
		this.rtAllCriticsNumFresh = rtAllCriticsNumFresh;
		this.rtAllCriticsNumRotten = rtAllCriticsNumRotten;
		this.rtAllCriticsScore = rtAllCriticsScore;
		this.rtTopCriticsRating = rtTopCriticsRating;
		this.rtTopCriticsNumReviews = rtTopCriticsNumReviews;
		this.rtTopCriticsNumFresh = rtTopCriticsNumFresh;
		this.rtTopCriticsNumRotten = rtTopCriticsNumRotten;
		this.rtTopCriticsScore = rtTopCriticsScore;
		this.rtAudienceRating = rtAudienceRating;
		this.rtAudienceNumRatings = rtAudienceNumRatings;
		this.rtAudienceScore = rtAudienceScore;
		this.rtPictureURL = rtPictureURL;
		this.movieSummary = this.title + " " + this.year + " " + this.id;
	}
	public void fillActorList(ArrayList<Actor> actors) {
		this.actors = actors;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public void fillGenreList(ArrayList<Genre> genres) {
		this.genres = genres;
	}
	public void fillLocationList(ArrayList<String> locations) {
		this.locations = locations;
	}
	public void fillTagsList(ArrayList<String> userTags) {
		this.userTags = userTags;
	}
	public void fillRatingsList(ArrayList<Double> userRatings) {
		this.userRatings = userRatings;
	}
}
