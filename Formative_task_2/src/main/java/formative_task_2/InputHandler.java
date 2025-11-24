package formative_task_2;

import java.util.ArrayList;
import swiftbot.Button;
import swiftbot.SwiftBotAPI;

public class InputHandler {
	static SwiftBotAPI swiftBot = SwiftBotAPI.INSTANCE;
	static ArrayList<String> userinput = new ArrayList<String>();

	public static void main (String[] args) {

		try {
			swiftBot.enableButton(Button.A, () -> {userinput.add("Red");});
			swiftBot.enableButton(Button.B, () -> {userinput.add("Blue");});
			swiftBot.enableButton(Button.X, () -> {userinput.add("Green");});
			swiftBot.enableButton(Button.Y, () -> {userinput.add("White");});
		}

		catch (Exception e) {
			System.out.println("please enter a correct key!!");
		}
		
	}
	
	public static void reset_input_handler() {
		userinput.clear();
	}
	
	public ArrayList<String> get_userinput() {
		return userinput;
	}
	
}
