package dataModel;

import java.util.ArrayList;

public class Movie {
	private String title;
	private int id;
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

}
