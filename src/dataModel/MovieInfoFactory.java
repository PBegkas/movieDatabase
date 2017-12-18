package dataModel;

public class MovieInfoFactory {
	
	public MovieInfo createInfo(String name, String type) {
		
		switch(type) {
		case "actor":
			return Actor(name);
		case "director":
			return Director(name);
			
	}

}
