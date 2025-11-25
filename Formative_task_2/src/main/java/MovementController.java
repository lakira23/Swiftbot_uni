
import swiftbot.SwiftBotAPI;

//Calculate speed using the formula
//Move in a V shape (two 30cm arms)
//Ensure movement uses correct speed logic
//Interact with LEDController for start & end celebration lights

public class MovementController {
	 static SwiftBotAPI swiftBot = SwiftBotAPI.INSTANCE;
	
	public static void celebration_movement(int score){
		int bot_power = score * 10;
		
		if (score >= 10) {
			bot_power = 100;
		}
		else if (score < 5) {
			bot_power = 40;
		}
		double bot_speed = bot_power * 0.4212;
		v_movement(bot_power, bot_speed);
	}
	
	private static void v_movement(int power, double speed) {
		System.out.println(power + " < power " + speed + " < speed" );
		//30cm
		// v = s/t
		//t = s/v
		
		double time = (30 / speed) * 1000;
		
		System.out.println("time > " + time);
		
		swiftBot.move(-50, 50, 500); //golden
		swiftBot.move(power, power, (int) time);
		swiftBot.move(-power, -power, (int) time);
		swiftBot.move(50, -50, 500);
		swiftBot.move(power, power, (int) time);
		swiftBot.move(-power, -power, (int) time);
		swiftBot.move(-50, 50, 250);
		
	}
	

}
