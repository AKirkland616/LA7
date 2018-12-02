package LA7.edu.wmich.cs1120;

public class Request<T> implements Comparable<T> {
	private String name;
	private String sdept;
	private String level;
	private String cdept;
	private int num;
	private double gpa;

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		if(o.equals(sdept.equals(cdept))) {
			if(this.level.compareTo("Senior") ==0) {
				o.equals(0);
			}
			else if(this.level.compareTo("Junior") == 1) {
				
			}
			else if (this.level.compareTo("Freshman") == 3) {
				
			}
			else {
							// ECE 
			}
		}
		return o;
	}
	
	// Constructor
	public Request(String studentName, String studentDept, String studentLevel, String courseDept, int courseNumber, double[][] GPA_Array) {
		name = studentName;
		sdept = studentDept;
		level = studentLevel;
		cdept = courseDept;
		num =courseNumber;
		gpa = GPA_Cal(GPA_Array);
		
		
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
		}else { //freshman
			return 3;
		}
		
	}

	// Calculate the GPA for a particular student.
	private double GPA_Cal(double[][] GPA_Array) {
		double ch = GPA_Array[0][1]+GPA_Array[1][1]+GPA_Array[2][1]+GPA_Array[3][1];
		double qp = 0;
		for(int i = 0;i<GPA_Array.length;i++) {
			qp+= (GPA_Array[i][0]*GPA_Array[i][1]);
		}
		//System.out.println((qp/ch));
		return (qp/ch);
		
	}

	// Getters for a students name and department, and the department and number of a course 
	public String getName() {
		return name;
	}
	public String getSDept() {
		return sdept;
	}
	public String getCDept() {
		return cdept;
	}
	public int getCourseNum() {
		return num;
	}

}
