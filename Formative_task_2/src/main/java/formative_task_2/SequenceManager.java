package formative_task_2;

import java.util.Random;
import java.util.ArrayList;
public class SequenceManager {
	 static ArrayList<String> sequence = new ArrayList<String>(); 
	
	public static void main(String[] args) {
		System.out.println("test");
		
		AddRandomColour();
		AddRandomColour();
		ResetSequence();
		System.out.println(Get_Sequence());
		
		
	}
	
	public static void AddRandomColour () {
		String[] colours = {"red","blue","green","white"};
		Random rand = new Random();
		String randomColour = colours[rand.nextInt(colours.length)];
		System.out.println(randomColour);
		
		sequence.add(randomColour);
	}
	
	public static ArrayList<String> Get_Sequence() {
		return sequence;
	}
	
	public static void ResetSequence() {
		sequence.clear();
	  
	}

}