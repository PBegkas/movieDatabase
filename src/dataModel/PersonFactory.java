package dataModel;

public class PersonFactory {
	
	public Person createPerson(String n, String id, String type) {
		
			switch(type) {
			case "actor":
				return new Actor(n,id);
			case "director":
				return new Director(n,id);
			default:
				System.out.println("PersonFactory error");
				return null;
			}

	}

}
