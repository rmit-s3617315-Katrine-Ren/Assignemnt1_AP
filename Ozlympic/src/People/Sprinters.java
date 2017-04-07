package People;




public class Sprinters extends Athlete {
	
	private final double minTime = 10;
	private final double maxTime = 20;
	private double score;

	public Sprinters(String id, String name, int age, String state) {
		super(id, name, age, state);
		// TODO Auto-generated constructor stub
	}


    //overriding the Compete( ) in class Athlete
	public void Compete() {
		
		double time;
		time =  minTime + Math.random()*((maxTime - minTime)+1);
		score = Math.round(time*100.0)/100.0;		
	}
	
	public double getScore(){
		return score;
	}
	

	
}
