
public class Student
	{



		private String firstName;
		private String lastName;
		private String gpa;
		private String firstPeriod;
		private String firstPeriodGrade;
		private String secondPeriod;
		private String secondPeriodGrade;
		private String thirdPeriod;
		private String thirdPeriodGrade;
	    public Student (String fN, String lN, String g, String fp, String fpg, String sp, String spg, String tp, String tpg)
	        {
	        	firstName=fN;
	        	lastName=lN;
	        	gpa=g;
	        	firstPeriod=fp;
	        	firstPeriodGrade=fpg;
	        	secondPeriod=sp;
	        	secondPeriodGrade=spg;
	        	thirdPeriod=tp;
	        	thirdPeriodGrade=tpg;
	        }
	    public String getFirstName()
	        {
	        return firstName;
	        }
	    public void setFirstName(String firstName)
	        {
	        this.firstName = firstName;
	        }
	    public String getLastName()
	        {
	        return lastName;
	        }
	    public void setLastName(String lastName)
	        {
	        this.lastName = lastName;
	        }
	    public String getGpa()
	        {
	        return gpa;
	        }
	    public void setGpa(String gpa)
	        {
	        this.gpa = gpa;
	        }
	    public String getFirstPeriod()
	        {
	        return firstPeriod;
	        }
	    public void setFirstPeriod(String firstPeriod)
	        {
	        this.firstPeriod = firstPeriod;
	        }
	    public String getFirstPeriodGrade()
	        {
	        return firstPeriodGrade;
	        }
	    public void setFirstPeriodGrade(String firstPeriodGrade)
	        {
	        this.firstPeriodGrade = firstPeriodGrade;
	        }
	    public String getSecondPeriod()
	        {
	        	
	        return secondPeriod;
	        }
	    public void setSecondPeriod(String secondPeriod)
	        {
	        this.secondPeriod = secondPeriod;
	        }
	    public String getSecondPeriodGrade()
	        {
	        	
	        return secondPeriodGrade;
	        }
	    public void setSecondPeriodGrade(String secondPeriodGrade)
	        {
	        this.secondPeriodGrade = secondPeriodGrade;
	        }
	    public String getThirdPeriod()
	        {
	        return thirdPeriod;
	        }
	    public void setThirdPeriod(String thirdPeriod)
	        {
	        this.thirdPeriod = thirdPeriod;
	        }
	    public String getThirdPeriodGrade()
	        {
	        return thirdPeriodGrade;
	        }
	    public void setThirdPeriodGrade(String thirdPeriodGrade)
	        {
	        this.thirdPeriodGrade = thirdPeriodGrade;
	        }

	}
