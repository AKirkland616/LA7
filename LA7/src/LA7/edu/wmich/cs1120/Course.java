package LA7.edu.wmich.cs1120;

public class Course implements ICourse {
	private String name;
	private int num;
	private int cap;
	
	public Course(String n, String numb, String capi) {
		name = n;
		num = Integer.parseInt(numb);
		cap = Integer.parseInt(capi);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addStudent(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public boolean equals(Object arg0) {
		return false;
		
	}

}
