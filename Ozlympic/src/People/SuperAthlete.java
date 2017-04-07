package People;

/**
 * @author Kaixin Ren
 * 
 * SuperAthlete can play all types of game
 * The final score of super athlete is the sum of three games' score.
 */
public class SuperAthlete extends Athlete{
	
	private double totalScore;
	
	
	public SuperAthlete(String id, String name, int age, String state) {
		super(id, name, age, state);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see People.Athlete#Compete()
	 */
	@Override
	public void Compete() {
		
		double runningTime;
		double swimmingTime;
		double cyclingTime;
		double totalTime;
			
		runningTime = 10 + Math.random()*((20 - 10)+1);
		swimmingTime = 100 + Math.random()*((200 - 100)+1);
		cyclingTime = 500 + Math.random()*((800 - 500)+1);
		
		totalTime = runningTime + swimmingTime + cyclingTime;
		totalScore = Math.round(totalTime*100.0)/100.0;
	}
	
	public double getScore(){
		return totalScore;
	}
	
	

}
