package formative_task_2;

import swiftbot.SwiftBotAPI;

//Calculate speed using the formula
//Move in a V shape (two 30cm arms)
//Ensure movement uses correct speed logic
//Interact with LEDController for start & end celebration lights

public class MovementController {
	 SwiftBotAPI swiftBot = SwiftBotAPI.INSTANCE;
	
	public static void main(String[] args) {
		celebration_movement(5);
//		celebration_movement(45);
//		celebration_movement(25);
	}
	public static void celebration_movement(int score){
		//speed = distance * time
		//time = speed / distance
		//distance = 30 cm --> 0.3m, 
		//speed = score * 10 
		//if  score < 5: speeed = 40
		//if score>40: speed = 40
		
		int speed = score * 10;
		
		if (score < 5) {
			speed = 40;
		}
		else if (score >= 10) {
			speed = 100;
		}
		
		System.out.println("speed" + speed);
		double time = speed / 0.3 ;
		SwiftBotAPI.INSTANCE.move(50,70,2000);
		System.out.println("time double " + time);
		//used chatgbt to figure out a ratio which links with the velocity, the angle which the robot should move in based on the distance between the two wheels:
		
		v_movement(speed, (int)time * 1000);
		
	}
	
	private static void v_movement(int speed, int time) {
		System.out.println("time int " + time);
		//swiftBot.move(-45, 45, 200 ); //make the robot diagonal
//		swiftBot.move(speed,speed, time);
//		swiftBot.move(-speed, -speed, time);
		
	}

}
