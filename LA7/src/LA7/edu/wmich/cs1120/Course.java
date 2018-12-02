package LA7.edu.wmich.cs1120;

public class Course implements ICourse {
	private String name;
	private int num;
	private int cap;
	private int enrolled = 0;
	private String [] students;
	
	public Course(String n, String numb, String capi) {
		name = n;
		num = Integer.parseInt(numb);
		cap = Integer.parseInt(capi);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (enrolled == cap);
	
	}

	@Override
	public void addStudent(String name) {
		// TODO Auto-generated method stub
		students[enrolled]=name;
		enrolled = enrolled+1;
	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub
		System.out.println("Class List for " + name );
		for(int i = 0; i< students.length;i++) {
			System.out.println(students[i]);
		}

	}
	
	@Override
	public boolean equals(Object arg0) {
		return (arg0.equals(num));
		
	}

}
