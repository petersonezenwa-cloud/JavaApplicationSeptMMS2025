import java.util.scanner;

public class SwitchCaseStatement{
    public static void main(string[] args){
	    scanner input = new scanner(system.in);
		int score;
		string name;
		string subject;
		
		system.out.print("Enter your name:");
		name = input.nextLine();
		
		system.out.print("Enter your subject:");
		subject = input.nextLine();
		
		system.out.print("Enter your score:");
		score = input.nextInt();
		
		System.out.printIn("");
		System.out.printIn("==================");
		
		if (score > 100){
		      system.out.printIn("score can not be greater the 1oo");
		
		switch(score/10){
		    case 0:
			case 1:
			case 2:
			    system.out.printf("Full Name: %s%n", name);
			    system.out.printf("Subject: %s%n", subject);
			    system.out.printf("Score: %d%n",score);
			    system.out.printIn("Grade: A");
			break;
			case 3:
			    system.out.printf("Full Name: %s%n", name);
			    system.out.printf("Subject: %s%n", subject);
			    system.out.printf("Score: %d%n",score);
			    system.out.printIn("Grade: B");
			break;
			case 4:
			    system.out.printf("Full Name: %s%n", name);
			    system.out.printf("Subject: %s%n", subject);
			    system.out.printf("Score: %d%n",score);
			    system.out.printIn("Grade: C");
			Break;
			case 5:
			case 6:
			case 7:
			
			case 8:
			    system.out.printf("Full Name: %s%n", name);
			    system.out.printf("Subject: %s%n", subject);
			    system.out.printf("Score: %d%n",score);
			    system.out.printIn("Grade: F");
			
		}
}	}
