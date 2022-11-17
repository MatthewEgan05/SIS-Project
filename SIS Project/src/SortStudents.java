import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class SortStudents
	{
		public static void sortRoster()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Sort Students");
			System.out.println("1) Sort by last name");
			System.out.println("2) Sort by GPA");
			System.out.println("3) Sort by period");
			int answer = userInput.nextInt();
			
			if(answer == 1)
				{
					sortLastName();
				}
			else if (answer == 2)
				{
					sortGPA();
				}
			else if(answer == 3)
				{
					sortPeriod();
				}
			


			}
		
		public static void sortLastName()
			{
			SortName sortName = new SortName();
			Collections.sort(Roster.roster, sortName);
			
			
			for(int i = 0; i < Roster.roster.size(); i ++)
			{
			System.out.println(Roster.roster.get(i).getFirstName() + " " + Roster.roster.get(i).getLastName() + "   " + 
			Roster.roster.get(i).getGpa() + "   " + Roster.roster.get(i).getFirstPeriod() + " " + Roster.roster.get(i).getFirstPeriodGrade() + "   " + Roster.roster.get(i).getSecondPeriod() + " " + 
					Roster.roster.get(i).getFirstPeriodGrade() + "   " + Roster.roster.get(i).getThirdPeriod() + " " + Roster.roster.get(i).getThirdPeriodGrade());	
			}
		
			
			}
		
		public static void sortGPA()
			{
			SortGPA sortGPA = new SortGPA();
			Collections.sort(Roster.roster, sortGPA);
			
			for(int i = 0; i < Roster.roster.size(); i ++)
				{
				System.out.println(Roster.roster.get(i).getFirstName() + " " + Roster.roster.get(i).getLastName() + "   " + 
				Roster.roster.get(i).getGpa() + "   " + Roster.roster.get(i).getFirstPeriod() + " " + Roster.roster.get(i).getFirstPeriodGrade() + "   " + Roster.roster.get(i).getSecondPeriod() + " " + 
						Roster.roster.get(i).getFirstPeriodGrade() + "   " + Roster.roster.get(i).getThirdPeriod() + " " + Roster.roster.get(i).getThirdPeriodGrade());	
				}
		
			
			}
		
	
		
		public static void sortPeriod()
			{
			SortPer sortPer = new SortPer();
			Collections.sort(Roster.roster, sortPer);
			
			
			
			for(int i = 0; i < Roster.roster.size(); i ++)
				{
				System.out.println(Roster.roster.get(i).getFirstName() + " " + Roster.roster.get(i).getLastName() + "   " + 
				Roster.roster.get(i).getGpa() + "   " + Roster.roster.get(i).getFirstPeriod() + " " + Roster.roster.get(i).getFirstPeriodGrade() + "   " + Roster.roster.get(i).getSecondPeriod() + " " + 
						Roster.roster.get(i).getFirstPeriodGrade() + "   " + Roster.roster.get(i).getThirdPeriod() + " " + Roster.roster.get(i).getThirdPeriodGrade());	
				}
			}
		
		
	}



