
import java.util.Scanner;

import swiftbot.SwiftBotAPI;

public class SimionSwift {

	static SwiftBotAPI swiftBot = SwiftBotAPI.INSTANCE;
	static int lives = 3;
	static boolean game_status = true;
	static int score = 0;
	static int level = 0;

	public static void main(String[] args) throws InterruptedException {

		try {
			Scanner input = new Scanner(System.in);
			while (lives >= 0 && game_status) {
				level ++;

				System.out.println("current score > "+ score);
				System.out.println("currrent level > "+ level);
				System.out.println("cuurent lives > "+ lives);

				if (score % 5 == 0 && level != 1) {

					System.out.println("Enter 'quit' if required to quit else 'continue'> ");

					String user_quit_input = input.next();

					if (user_quit_input.equals("quit")) {
						game_status = false;

						System.out.println("performing celebration dive! ");
						MovementController.celebration_movement(score);
						break;
					}

				} 

				Thread.sleep(250);
				System.out.println("1..");
				Thread.sleep(250);
				System.out.println("2..");
				Thread.sleep(250);
				System.out.println("3..");
				Thread.sleep(250);

				System.out.println("starting game!");

				SequenceManager.AddRandomColour(); //add a random colour

				System.out.println("the sequence" + SequenceManager.Get_Sequence()); //prints the colour

				LEDController.display_sequence(SequenceManager.Get_Sequence());

				System.out.println("");

				while (InputHandler.get_userinput().size() < level) {
					InputHandler.start_InputHandle();

				}

				System.out.println("user input > "+ InputHandler.get_userinput());
				InputHandler.get_userinput().equals(SequenceManager.Get_Sequence());
				System.out.println("the sequence > "+ SequenceManager.Get_Sequence());

				if (InputHandler.get_userinput().equals(SequenceManager.Get_Sequence())) {
					score ++;
					System.out.println("Score incremented!!");

				}
				else {
					lives = lives - 1;
					System.out.println("wrong sequnce");
				}
				input.close();
				InputHandler.reset_input_handler();
			}
		}

		catch (Exception e) {
			System.out.println("not workin gbro!");
			System.exit(5);
		}


	}

}
