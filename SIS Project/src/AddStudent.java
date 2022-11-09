import java.util.Scanner;


public class AddStudent
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner userIntput1 = new Scanner(System.in);
		
		public static void menu() {
			
			System.out.println("Would you like to (1) add or (2) delete a student?");
			int input = userInput.nextInt();
			if(input == 1) {
				addStudent();
			}
			else if(input == 2) {
				deleteStudent();
			}
			else {
				menu();
			}
		}
		
		public static void deleteStudent()
			{
				
				System.out.println("Pick a Student to Delete: ");
				// lists students
				
				System.out.println();
				System.out.println("Are you sure you want to delete " + Student.roster.getFirstName.get() + " (1) Yes (2) No" );
				int delete = userInput.nextInt();
				if(delete == 1) {
					// deletes
				}
				else if(delete == 2) {
					
					//Return
				}
				else {
					deleteStudent();
				}
			}

		public static void addStudent() {
			System.out.println();
			System.out.println("Add a Student");
			System.out.println();
			System.out.print("First Name: ");
			String firstName = userInput.nextLine();
			System.out.print("Last Name: ");
			String lastName = userInput.nextLine();
			System.out.print("Period One: ");
			String periodOne = userInput.nextLine();
			System.out.print("Period One Grade: ");
			String periodOneGrade = userInput.nextLine();
			System.out.print("Period Two: ");
			String periodTwo = userIntput1.nextLine();
			System.out.print("Period Two Grade: ");
			String periodTwoGrade = userInput.nextLine();
			System.out.print("Period Three: ");
			String periodThree = userIntput1.nextLine();
			System.out.print("Period Three Grade: ");
			String periodThreeGrade = userInput.nextLine();
			
			Student.roster.add(new Student(firstName,lastName,periodOne,periodOneGrade,periodTwo,periodTwoGrade,periodThree,periodThreeGrade));
			
			
			System.out.println();
			System.out.println("New Student Data: ");
			System.out.println(" Name: " + firstName + " " + lastName);
			System.out.println(" GPA: ");
			System.out.println();
			System.out.println(" Period 1: " + periodOne + "... " + periodOneGrade);
			System.out.println(" Period 2: " + periodTwo + "... " + periodTwoGrade);
			System.out.println(" Period 3: " + periodThree + "... " + periodThreeGrade);
			
			System.out.println();
			System.out.println("Are you sure you want to add this student? (1) Yes (2) No");
			int adding = userIntput1.nextInt();
			if(adding == 1) {
				
				System.out.println(Student.roster.getFirstName( + Student.roster.getLastName() + " has been added to the roster."));
				
			}
			else if(adding == 2) {
				
				int last = Student.roster.size();
				Student.roaster.remove(last);
				
			}
			else {
				addStudent();
			}
			
		}
	}
