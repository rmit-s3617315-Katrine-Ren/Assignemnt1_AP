package Data;

import java.util.ArrayList;
import java.util.Iterator;

import People.Athlete;
import People.Sprinters;
import People.Cyclist;
import People.Official;
import People.SuperAthlete;
import People.Swimmer;


/**
 * @author Kaixin Ren
 *
 *Class Database is to store hard-coded information of participants.
 */
public class Database {
	private int point; // The bonus point for top 3
	private double score;  // The time to complete the race
	protected String athleteID;
	
	public static ArrayList<Database>PointList = new ArrayList<Database>();
	public static ArrayList<Swimmer>SwimmerList = new ArrayList<Swimmer>();
	public static ArrayList<Sprinters>SprinterList = new ArrayList<Sprinters>();
	public static ArrayList<Cyclist>CyclistList = new ArrayList<Cyclist>();
	public static ArrayList<SuperAthlete>SuperAthleteList = new ArrayList<SuperAthlete>();

	public static ArrayList<Official>OfficialList = new ArrayList<Official>();

	public static ArrayList<String> menu = new ArrayList<String>(); // menu stores the option of game type for user to select
	

	public Database(int point, int score, String athleteID){
		this.point = point;
		this.score = score;
		this.athleteID = athleteID;
	}
	
	static Swimmer s1 = new Swimmer("s1", "Andy", 24, "USA");
	static Swimmer s2 = new Swimmer("s2", "Betty", 23, "China");
	static Swimmer s3 = new Swimmer("s3", "Candy", 22, "UK");
	static Swimmer s4 = new Swimmer("s4", "Diana", 21, "Russia");
	static Swimmer s5 = new Swimmer("s5", "Elle", 20, "Australia");
	static Swimmer s6 = new Swimmer("s6", "Fred", 19, "French");
	static Swimmer s7 = new Swimmer("s7", "Greg", 18, "India");
	static Swimmer s8 = new Swimmer("s8", "Hadid", 17, "Australia");
	static Swimmer s9 = new Swimmer("s9", "Iris", 16, "USA");
	
	static Sprinters r1 = new Sprinters("r1", "Allen", 24, "USA");
	static Sprinters r2 = new Sprinters("r2", "Belle", 23, "China");
	static Sprinters r3 = new Sprinters("r3", "Caren", 22, "UK");
	static Sprinters r4 = new Sprinters("r4", "Diva", 21, "Russia");
	static Sprinters r5 = new Sprinters("r5", "Edmend", 20, "Australia");
	static Sprinters r6 = new Sprinters("r6", "Fiona", 19, "French");
	static Sprinters r7 = new Sprinters("r7", "Gigi", 18, "India");
	static Sprinters r8 = new Sprinters("r8", "Holland", 17, "Australia");
	static Sprinters r9 = new Sprinters("r9", "Ivanka", 16, "USA");

	static Cyclist c1 = new Cyclist("c1", "Amy", 24, "USA");
	static Cyclist c2 = new Cyclist("c2", "Billy", 23, "China");
	static Cyclist c3 = new Cyclist("c3", "Caroline", 22, "UK");
	static Cyclist c4 = new Cyclist("c4", "David", 21, "Russia");
	static Cyclist c5 = new Cyclist("c5", "Eric", 20, "Australia");
	static Cyclist c6 = new Cyclist("c6", "Fan", 19, "French");
	static Cyclist c7 = new Cyclist("c7", "Gulu", 18, "India");
	static Cyclist c8 = new Cyclist("c8", "Harry", 17, "Australia");
	static Cyclist c9 = new Cyclist("c9", "Ian", 16, "USA");
	
	static SuperAthlete sa1 = new SuperAthlete("sa1", "Aron", 24, "USA");
	static SuperAthlete sa2 = new SuperAthlete("sa2", "Ben", 23, "China");
	static SuperAthlete sa3 = new SuperAthlete("sa3", "Camila", 22, "UK");
	static SuperAthlete sa4 = new SuperAthlete("sa4", "Danny", 21, "Russia");
	static SuperAthlete sa5 = new SuperAthlete("sa5", "Emily", 20, "Australia");
	static SuperAthlete sa6 = new SuperAthlete("sa6", "Flora", 19, "French");
	static SuperAthlete sa7 = new SuperAthlete("sa7", "Gal", 18, "India");
	static SuperAthlete sa8 = new SuperAthlete("sa8", "Hilary", 17, "Australia");
	static SuperAthlete sa9 = new SuperAthlete("sa9", "Ida", 16, "USA");
	
	static Official o1 = new Official("offi1","Sam",38,"Brazil");
	static Official o2 = new Official("offi2","Ram",39,"USA");
	static Official o3 = new Official("offi3","Cam",40,"Japan");
	static Official o4 = new Official("offi4","Tam",41,"Russia");

	
	public static void addSwimmer(){
		SwimmerList.add(s1);
		SwimmerList.add(s2);
		SwimmerList.add(s3);
		SwimmerList.add(s4);
		SwimmerList.add(s5);
		SwimmerList.add(s6);
		SwimmerList.add(s7);
		SwimmerList.add(s8);
		
	}
	
	public static void addSprinter(){
		SprinterList.add(r1);
		SprinterList.add(r2);
		SprinterList.add(r3);
		SprinterList.add(r4);
		SprinterList.add(r5);
		SprinterList.add(r6);
		SprinterList.add(r7);
		SprinterList.add(r8);
		SprinterList.add(r9);
	}	
		
	public static void addCyclist(){
		CyclistList.add(c1);
		CyclistList.add(c2);
		CyclistList.add(c3);
		CyclistList.add(c4);
		CyclistList.add(c5);
		CyclistList.add(c6);
		CyclistList.add(c7);
		CyclistList.add(c8);
		CyclistList.add(c9);
		
		
	}	
		
	public static void addSuper(){
		SuperAthleteList.add(sa1);
		SuperAthleteList.add(sa2);
		SuperAthleteList.add(sa3);
		SuperAthleteList.add(sa4);
		SuperAthleteList.add(sa5);
		SuperAthleteList.add(sa6);
		SuperAthleteList.add(sa7);
		SuperAthleteList.add(sa8);
		SuperAthleteList.add(sa9);
		
	}	
		
	
	
	public static void addOfficial(){
		OfficialList.add(o1);
		OfficialList.add(o2);
		OfficialList.add(o3);
		OfficialList.add(o4);
		
	}
	
	public static void addMenu(){
		menu.add("G1");
		menu.add("G2");
		menu.add("G3");
		menu.add("G4");
		menu.add("G5");
	}
	
	/**
	 * @return the point
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * @param point the point to set
	 */
	public void setPoint(int point) {
		this.point = point;
	}

	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * @return the athleteID
	 */
	public String getAthleteID() {
		return athleteID;
	}

	/**
	 * @param athleteID the athleteID to set
	 */
	
	
	
	
	
	public void setAthleteID(String athleteID) {
		this.athleteID = athleteID;
	}
	
	
	public static void printPointList(ArrayList<Database>list){
		for(Database d :list){
			System.out.println("Athlete's ID : " + d.getAthleteID() );
			System.out.println("Athlete's point : "+ d.getPoint());
			System.out.println("Athlete's score " + d.getScore() );
			System.out.println();
		}

		
		
	}	
	
	public static void setPointList(Athlete[] randomPlayer){
		for(int i=0;i<randomPlayer.length;i++){
			PointList.add(new Database(0,0,randomPlayer[i].getID()));
		}
		}
	
	
	
		
	}
	


