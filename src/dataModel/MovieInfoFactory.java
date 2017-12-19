package dataModel;

public class MovieInfoFactory {
	
	public MovieInfoFactory() {
		// TODO Auto-generated constructor stub
	}
	
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