import java.util.Scanner;

public class SISRunner
	{

		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("What would you like to do?");
			System.out.println("1) add or delete a student");
			System.out.println("2) change student grades/schedule");
			System.out.println("3) sort students");
			int number = userInput.nextInt();
			
			if(number == 1)
				{
					AddStudent.menu();
				}
			else if (number == 2)
				{
					//change
				}
			else if(number == 3)
				{
				SortStudents.sortRoster();
				}
				
			
			
				
				
			
//				Main Menu
//				What would you like to do?
//				add or delete a student
//				change student grades/schedule
//				sort students
	
				



			}
}
