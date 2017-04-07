package People;

public class Swimmer extends Athlete {

	private final double maxTime =200;
	private final double minTime =100;
	private double score;
	
	
	public Swimmer(String id, String name, int age, String state) {
		super(id, name, age, state);
	}

	
	/* (non-Javadoc)
	 * @see Game.Athlete#Compete()
	 */
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
