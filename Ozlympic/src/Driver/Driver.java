package Driver;

import java.util.Scanner;

import Data.Database;
import Game.Game;
import People.Athlete;
//import People.Cyclist;
//import People.Sprinters;
//import People.SuperAthlete;
//import People.Swimmer;

import java.util.ArrayList;


/**
 * @author Kaixin Ren
 *
 *Notice: The order of main menu is slightly different from the assignment example!
 * User should start a game before making prediction.
 * The system will only print out the list of players in game after starting the game.
 * User can input ID of selected athletes based on the list to predict the winner. 
 *  
 */
public class Driver {
	
	
	static Scanner reader = new Scanner(System.in);
	
	private static String selectGame;
	private boolean error;
	private String prediction;
	private int option;

	
	//start by the deck
	public void runGame(){
		
		displayMenu();
		option();
		
		
	}

	// Displays the game menu
		public void displayMenu(){
			
			System.out.println();
			System.out.println();
			System.out.println("Ozlympic Game");
			System.out.println("=========================");
			System.out.println("1. Select a game to run");
			System.out.println("2. Start the game");
			System.out.println("3. Predict the winner of the game");
			System.out.println("4. Display the final result of game");
			System.out.println("5. Display the points of all athletes");
			System.out.println("6. Exit");
			
			
		
		}
		
		
		
		public void option(){
			
			// d = new Driver();
		  
		    System.out.println("Please enter your option");
		    checkInput1();
			
			while (option <1 || option>6 )
			{
	        	System.out.println("Please enter number between 1-6");
	        	checkInput1();
			}
			
			
			switch(option)
			{ case 1: 		selectGame();
				break;
			  case 2: 		start(); runGame();	                
				break;
			  case 3: 		predict();
				break;
			  case 4 : 		printResult();
				break;
			  case 5 : 		printAthletePoint();
				break;
			  case 6 :      System.out.println("See you later :)"); System.exit(0);
			  	break;
				}
				
		}
		
		
		
		
		public void selectGame(){
			
			
			System.out.println("Please ENTER the game you want to play");
			System.out.println("======================================");
			System.out.println("G1.Running");
			System.out.println("G2.Cycling");
			System.out.println("G3.Swimming");
			System.out.println("G4.Triathlon");
			System.out.println("G5.Back to Menu");
			
			checkInput2(); 
			
			if(selectGame == "G5"){
				  runGame();	}
			
			runGame();//check if the input is String & whether it match the option
			//Game game = null;//cause no point exception!!
			
			//game.get(0).setAthlete();--Need VALID REFERENCE!!
			
			
			
		}
		
		
		
		
		
		public void predict(){
			
			if(selectGame == null){
				System.out.println("Please select a game at first!");
				runGame();
			}
			
			else {
				System.out.println("Please enter the ID of Athlete :");
				prediction = reader.next(); 
				runGame();}
			
		}
		
		public String getPrediction(){
			return prediction;
		}
		
		public static String getGameSelected(){
			return selectGame;
		}
		
		
		public void start(){

			Game.generateScore(Game.setAthlete());
		}

		
		public void printResult(){
			
		
			if(selectGame == null){
				System.out.println("Please select a game at first!");
				runGame();
			}
			if(Database.PointList.size()==0){
				System.out.println("No result! Please start a game at first!");
				runGame();
			}
			
			if(getPrediction()==null){
				System.out.println("You have not predicted the winner!");
				runGame();
			}
			else{
					
				if(Game.CompareTo()==true){
				
					System.out.println("Congratulations! You win!");
		
				}else 
					System.out.println("Sorry, You lose!");
			   }  runGame();
			
			
			}
		
		public void printAthletePoint(){
			if(selectGame == null){
				System.out.println("Please select a game at first!");
				runGame();
			}
			if(Database.PointList.size()==0){
				System.out.println("No result! Please start a game at first!");
				runGame();
			}
			else Game.sortList();
			     runGame();
		}
		
		
		
		
		public void checkInput1(){
			/*Check input is an Integer or not
			 */
			
		  do{
			try{
				int instruction = reader.nextInt();
				option = instruction;
				error = false;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Invalid input!\n"
						+"Please input only number between 1-6 : ");
				reader.next();
				error = true;
			}
		  }while(error);
		  
		  
		}
		

		
		public void checkInput2(){
			/*
			 * Check input of selected game type is the valid option in menu
			 */
			boolean flag = false;
			Database.addMenu();
			
			do{	
				System.out.println("Your option is: "+ " \nPlease input the correct option!");
					String input = reader.next();
					selectGame = input;	
					if(Database.menu.contains(selectGame)){
						flag=false;
						System.out.println("Successful input");
						System.out.println();
				}
					else flag = true;
				
			  }while(flag); 
			
		}
			  
			
			
		
}
