package LA7.edu.wmich.cs1120;

public class Request<T> implements Comparable<T> {
	private String name;
	private String sdept;
	private String level;
	private String cdept;
	private int num;
	private double[][] gpa;

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// Constructor
	public Request(String studentName, String studentDept, String studentLevel, String courseDept, int courseNumber, double[][] GPA_Array) {
		name = studentName;
		sdept = studentDept;
		level = studentLevel;
		cdept = courseDept;
		num =courseNumber;
		gpa = GPA_Array;
		
		
	}
	// Returns number of years to graduation (0 for seniors, 1 for juniors etc.). This is determined from the 
	// student’s level – senior, junior, etc.
	public int yearsFromGraduation(String level) {
		if(level.equals("Senior")){
			return 0;
		}else if(level.equals("Junior")){
			return 1;
		}else if(level.equals("Sophmore")){
			return 2;
		}else {
			return 3;
		}
		
	}

	// Calculate the GPA for a particular student.
	private double GPA_Cal(double[][] GPA_Array) {
		return 0;
		
	}

	// Getters for a student’s name and department, and the department and number of a course 


}
