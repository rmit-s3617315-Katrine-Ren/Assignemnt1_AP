package People;

public abstract class Participant {
	
	public String id;
	public String name;
	public int age;
	public String state;
	
	
	public Participant(String id, String name, int age, String state){
		this.id = id;
		this.name=name;
		this.age = age;
		this.state = state;
	}

	public String getName(){
		return name;
	}
	
	public String getID(){
		return id;
	}
	
	public String getState(){
		return state;
	}
	
	public int getAge(){
		return age;
	}

	
	

}
