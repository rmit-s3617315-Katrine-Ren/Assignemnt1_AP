package People;

public class Cyclist extends Athlete {
	
	private final double maxTime =800;
	private final double minTime =500;
	private double score;

	public Cyclist(String id, String name, int age, String state) {
		super(id, name, age, state);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void Compete() {
		double time;
		time =  minTime + Math.random()*((maxTime - minTime)+1);
		score = Math.round(time*100.0)/100.0;
	}
	
	public double getScore(){
		return score;
	}

	
	
	
}
