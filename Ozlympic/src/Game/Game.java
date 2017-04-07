package Game;

import People.Athlete;
import People.Cyclist;
import People.Official;
import People.Sprinters;
import People.SuperAthlete;
import People.Swimmer;
import Driver.Driver;
import Data.Database;

import java.util.*;

/**
 * @author Kaixin Ren
 * 
 *The number of players should be randomly generated, numAthlete should be in [4,8].
 *The players should be drawn randomly by their index.
 */
public class Game {
	
	
    
	static Random random = new Random();
	
	private static int numAthlete;// the random number of players in each round
	static final int minAthlete = 4;
	static final int maxAthlete =8;
	static int totalAthlete = 9;
	
	static Athlete[] randomPlayer ;
	private String gameID;
	
	public Game(String gameID ){
		this.gameID = gameID;
		
	}
	
	
	//
	public static Athlete[] setAthlete(){
		
		System.out.println("The list of athletes : ");
		
		//set number of player randomly
		numAthlete = minAthlete + (int)(Math.random() * ((maxAthlete - minAthlete) + 1));
		
		Athlete[] players = new Athlete[numAthlete];//an array for swapping the value
		int indexNum= 30;
		boolean[] exist = new boolean[indexNum]; 
		
		for(int i = 0; i < players.length; i++){
			int index;
			//make sure there is no duplicate index has been created
			do{
			        index = random.nextInt(totalAthlete-2);
			        
			     }while(exist[index]);
			
			exist[index]=true;
		
		//cast randomPlayers to the chosen type
		
		if(Driver.getGameSelected().equals(Database.menu.get(0))){
			Database.addSprinter();
			randomPlayer = new Sprinters[numAthlete];		
			players[i]=Database.SprinterList.get(index);
			randomPlayer[i]=players[i]; //randomPlayer[ ] cannot store value!
		}
		else if(Driver.getGameSelected().equals(Database.menu.get(1))){
			Database.addCyclist();
			randomPlayer = new Cyclist[numAthlete];			
			players[i]=Database.CyclistList.get(index);
			randomPlayer[i]=players[i];
		}
		else if(Driver.getGameSelected().equals(Database.menu.get(2))){
			Database.addSwimmer();
			randomPlayer = new Swimmer[numAthlete];
			players[i]=Database.SwimmerList.get(index);
			randomPlayer[i]=players[i];
		}
		else if(Driver.getGameSelected().equals(Database.menu.get(3))){
			Database.addSuper();
			randomPlayer = new SuperAthlete[numAthlete];
			players[i]=Database.SuperAthleteList.get(index);
			randomPlayer[i]=players[i];  }
		
		
		System.out.println(randomPlayer[i].getID() +" " +randomPlayer[i].getName() +" " + randomPlayer[i].getState());
		
		}
		return players;
		
	}
	
		
	
		public static void generateScore(Athlete[] randomPlayer){
			
		    double[] score= new double[numAthlete];
			Database.setPointList(randomPlayer);
			//Database.printPointList(Database.PointList);
			
			
			//assign athletes' result into array score
			for(int i=0;i<Database.PointList.size();i++){
				if (randomPlayer[i] instanceof Swimmer){
					((Swimmer)randomPlayer[i]).Compete();
					score[i]=((Swimmer)randomPlayer[i]).getScore();
					//System.out.println(score[i]);
					for(int j=0;j<randomPlayer.length;j++){
						if(Database.PointList.get(i).getAthleteID().equals(randomPlayer[j].getID())){
							Database.PointList.get(i).setScore(score[j]);
						}
					}
					
				}
				
				else if (randomPlayer[i] instanceof Sprinters){
					
					((Sprinters)randomPlayer[i]).Compete();
					score[i]=((Sprinters)randomPlayer[i]).getScore();
					for(int j=0;j<randomPlayer.length;j++){
						if(Database.PointList.get(i).getAthleteID().equals(randomPlayer[j].getID())){
							Database.PointList.get(i).setScore(score[j]);
						}
					}
					
				}
				else if (randomPlayer[i] instanceof Cyclist){
					((Cyclist)randomPlayer[i]).Compete();
					score[i]=((Cyclist)randomPlayer[i]).getScore();
					for(int j=0;j<randomPlayer.length;j++){
						if(Database.PointList.get(i).getAthleteID().equals(randomPlayer[j].getID())){
							Database.PointList.get(i).setScore(score[j]);
						}
					
				}
				}
				else if (randomPlayer[i] instanceof SuperAthlete){
					((SuperAthlete)randomPlayer[i]).Compete();
					score[i]=((SuperAthlete)randomPlayer[i]).getScore();
					for(int j=0;j<randomPlayer.length;j++){
						if(Database.PointList.get(i).getAthleteID().equals(randomPlayer[j].getID())){
							Database.PointList.get(i).setScore(score[j]);
						}
					
				}
				
			}
			
			
		}
	}
			
			public static void sortList(){
				Database temp;
				//sorting the PointList in ascending order
				for(int i=0;i<Database.PointList.size();i++){
					for(int j = 0; j < Database.PointList.size()-1; j++){
						if(Database.PointList.get(i).getScore() < Database.PointList.get(j).getScore()){
							temp=Database.PointList.get(j);
							Database.PointList.set(j, Database.PointList.get(i));
							Database.PointList.set(i, temp);}
					}
			}
				//add Point based on ranking
				for(int k=0;k<Database.PointList.size();k++){
				if(Database.PointList.indexOf(Database.PointList.get(k))==0){
					Database.PointList.get(k).setPoint(5);
				}
				
				if(Database.PointList.indexOf(Database.PointList.get(k))==1){
					Database.PointList.get(k).setPoint(2);
				}
				
				if(Database.PointList.indexOf(Database.PointList.get(k))==2){
					Database.PointList.get(k).setPoint(1);
				}
				
		 }
				Database.printPointList(Database.PointList);
	}
		
			

			//check user prediction and the compare it to the result by athlete's id
			public static boolean CompareTo(){
				Driver d = new Driver();
				int count=0;
				
				for(int i=0;i<Database.PointList.size();i++){
					if(Database.PointList.get(i).getScore()==5 && d.getPrediction().equals(Database.PointList.get(i).getAthleteID())){
						count++;
					}
			}
				if(count>0){
					return true;
				}
				
				else return false;
				}

		
	
	
	
	
	

}
