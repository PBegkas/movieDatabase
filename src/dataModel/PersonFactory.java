package dataModel;

public class PersonFactory {
	
	public PersonFactory() {
		// TODO Auto-generated constructor stub
	}
	
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
