package dataModel;

public class Movie {
	String title;
	int id;
	String imdbID;
	String titleSpanish;
	String imdbPictureURL;
	String year;
	String rtID;
	String rtAllCriticsRating;
	String rtAllCriticsNumReviews;
	String rtAllCriticsNumFresh;
	String rtAllCriticsNumRotten;
	String rtAllCriticsScore;
	String rtTopCriticsRating;
	String rtTopCriticsNumReviews;
	String rtTopCriticsNumFresh;
	String rtTopCriticsNumRotten;
	String rtTopCriticsScore;
	String rtAudienceRating;
	String rtAudienceNumRatings;
	String rtAudienceScore;
	String rtPictureURL;
	Country country;
	Director director;
	//TO-DO rework the lists
	Actor[] actors;
	Genre[] genres;
	String[] locations;

}
