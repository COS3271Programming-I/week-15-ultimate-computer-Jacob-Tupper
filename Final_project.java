package final_project;

//Importing the different Programs
import program_1_Display_APP.*; //Display_Text
import oppish_app.*; //OPPISH_APP
import program_2_Text_Art_App.*; //Text_Art_App
import encouragement_APP.*; //Encouragment_APP
import dice_app.*;	//Dice_APP
import fibonacci_app.*;	//Fibonacci_APP
import double_factorial_app.*;	//Double_factorial_APP
import calculator_APP.*;	//Calculator_APP
import binary_calculator_APP.*;	//Binary_Calculator_APP

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.PrintStream;

public class Final_project {
	//Created Scanner and PrintStream variables
	static Scanner usin = new Scanner(System.in);
	static PrintStream so = System.out;
	
	@SuppressWarnings("unused")
	//Created a Function to check the input of the user
	public static int check() {
		//Created variables
		PrintStream so = System.out;
		int number = 0;
		String TRASH;
		//Created the try loop
		while (true) {
			try {
			//Asking user for their input
				so.print("\n1. Display Text\n2. Text Art\n3. Need Encouragment\n4. Oppish Translation\n"
						+ "5. Roll the Dice\n6. Fibonacci\n7. Double Factorial\n8. Calculator\n9. Binary Calculator\n"
						+ "10. End Program\nSelection: ");
			number = usin.nextInt();
			if (number>0 && number<11)return number; //Checking if the user input is within the valid range
			else {so.print("\nIncorrect input please enter a valid number(1-10)\n");continue;}
			}
			//Checking if the user placed the incorrect type
			catch(InputMismatchException e) {
				so.print("\nIncorrect input please try again\n");
				TRASH = usin.nextLine();
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		//Created tag to break the loop
		outerloop:
		while (true) {
			//Switch case to select the programs
			switch(check()) {
			case(1) : {Display_Text.main(args); break;}
			case(2) : {Text_Art_App.main(args); break;}
			case(3) : {Encouragment_APP.main(args); break;}
			case(4) : {OPPISH_APP.main(args); break;}
			case(5) : {Dice_App.main(args);break;}
			case(6) : {Fibonacci_APP.main(args);break;}
			case(7) : {Double_Factorial_APP.main(args);break;}
			case(8) : {Calc.main(args);break;}
			case(9) : {b_c_app.main(args);break;}
			default : break outerloop;
			}
		}
	}
}
