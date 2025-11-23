package formative_task_2;
import java.util.ArrayList;

import swiftbot.*;

public class SimionSwift {

	static SwiftBotAPI swiftBot;
	
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> test_sequence = new ArrayList<>();
		test_sequence.add("Red");
		test_sequence.add("Blue");
		
//		LEDController test = new LEDController();
//		test.display_sequence(test_sequence);
		
		MovementController tester = new MovementController();
		tester.celebration_movement(5);
		
		System.out.println("hi");
		

	}

}
