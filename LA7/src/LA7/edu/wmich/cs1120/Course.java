package LA7.edu.wmich.cs1120;
/**
 * 
 * @author Chris Niersbach and Anthony Kirkland
 *
 */
public class Course implements ICourse {
	private String name;
	private int num;
	private int cap;
	private int enrolled = 0;
	private String [] students;
	/**
	 * 
	 * @param n makes a string for the name
	 * @param numb makes a string parseint the number for the course
	 * @param capi makes a strign parseint for the capacity of the course
	 */
	public Course(String n, String numb, String capi) {
		name = n;
		num = Integer.parseInt(numb);
		cap = Integer.parseInt(capi);
		students = new String[cap];
	}
/**
 * 
 *@return if the class is full set enrolled to the cap
 */
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (enrolled == cap);
	
	}
/**
 * @param name adds the student by their name
 */
	@Override

	public void addStudent(String name) {
		// TODO Auto-generated method stub
		students[enrolled]=name;
		enrolled = enrolled+1;
	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub
		System.out.println("Class List for " + name +" " +num);
		for(int i = 0; i< students.length;i++) {
			if(students[i]!=null)
			System.out.println(students[i]);
		}

	}
	
	/**
	 * @param arg0 takes an object to pass in the equals method
	 * @return set the object equal to number
	 */
	@Override
	public boolean equals(Object arg0) {
		return (arg0.equals(num));
		
	}

	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public int getCap() {
		return cap;
	}
}
