 import java.util.Scanner;
 
 public class UserInput{
     public static void main (String[] args){
	 Scanner input = new Scanner (system.in);
	 
	 System.out.print("Enter your name:");
	 String name = input.nextline();
	 
	 System.out.printf("Enter your gender:");
	 String gender = input.next();
	 
	 System.out.printf("Enter your age:");
	 byte age = input.nextByte();
	 
	 System.out.printf("Enter the number of student in your class:");
	 short  numberOfStudent = input.nextShort();
	 
	 System.out.printf("Enter the number of stduent in your school:");
	 int totalNumberOfStudent = input.nextInt();
	 
	 System.out.printf("Enter your grade");
	 char grade = input.next().charAt(0);
	 
	 System.out.printf("Do you love learning java(true/false):");
	 boolean loveJava = input.nextBoolean();
	 
	 System.out.printin("");
	 System.out.printf("information about %s%n",name);
	 System.out.printin("==================================");
	 
	 System.out.printf("Hello %s, you are welcome to NIIT",name);
	 System.out.printf("You are a %s and you are %d year old%n", gender,age); 
	 System.out.printf("There are %d student in your class%n", numberofstudent);
	 System.out.printf("The total number of student in your school is %d%n", totalNumberOfStudent);
	 System.out.printf("your grade is %c%n",grade);
	 System.out.printf("Do you love java? %b%n",loveJava);
	 
	 }	
 }	 