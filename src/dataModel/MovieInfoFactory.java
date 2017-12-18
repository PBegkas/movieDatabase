package dataModel;

public class MovieInfoFactory {
	
	public MovieInfo createInfo(String name, String type) {
		
		switch(type) {
		case "country":
			return new Country(name);
		case "genre":
			return new Genre(name);
		default:
			System.out.println("MovieFactory error");
			return null;
		}
	}


}