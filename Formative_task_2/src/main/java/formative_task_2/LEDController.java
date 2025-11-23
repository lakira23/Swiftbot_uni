package formative_task_2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import swiftbot.*;

//Light/blink the correct LED for a colour
//Display the full sequence
//Flash random celebration colours

public class LEDController {
	static SwiftBotAPI swiftBot = SwiftBotAPI.INSTANCE;


	static int[][] colours_int = {
			{ 255, 0, 0 }, // Red
			{ 0, 255, 0 }, // Green
			{ 0, 0, 255 }, // Blue
			{ 255, 255, 255 } // White
	};

	static String[][] colours_str = {
			{"Red"},
			{"Green"},
			{"Blue"},
			{"White"}
	};

	static HashMap<String, int[]> colour_map = new HashMap<>();

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 4 ; i++) {
			colour_map.put(colours_str[i][0], colours_int[i]);
		};

		//System.out.println((colour_map.get("Red")));
		ArrayList<String> test_sequence = new ArrayList<>();
		test_sequence.add("Red");
		test_sequence.add("Blue");

		//display_sequence(test_sequence);
		celebration_lights();
	}


	public static void display_sequence(ArrayList<String> colour_Sequence) throws InterruptedException {

		for (int i= 0; i < colour_Sequence.size(); i++) {
			int[] current_colour = colour_map.get(colour_Sequence.get(i));
			System.out.println(current_colour);
			swiftBot.fillUnderlights(current_colour);
			Thread.sleep(500);
		}
		swiftBot.disableUnderlights();
	};

	public static void celebration_lights() throws InterruptedException { 
		Random rand = new Random();
		int randomInt = rand.nextInt(4);
		swiftBot.fillUnderlights(colours_int[randomInt]);
		Thread.sleep(300);

		swiftBot.disableUnderlights();


	}

}
