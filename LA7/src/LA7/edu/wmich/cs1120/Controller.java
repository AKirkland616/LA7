package LA7.edu.wmich.cs1120;

import java.io.BufferedReader;
import java.io.IOException;

public class Controller implements IController {
	PriorityQueue<Request> pq;
	LinkedList<Course> ll;
	BufferedReader course;
	BufferedReader request;

	public Controller(PriorityQueue<Request> requestQueue, LinkedList<Course> courses, BufferedReader fileIn, BufferedReader fileIn1) {
		// TODO Auto-generated constructor stub
		pq = requestQueue;
		ll = courses;
		course = fileIn;
		request =fileIn1;
	}

	@Override
	public void readCourseFile() {
		// TODO Auto-generated method stub
		try {
			String s = course.readLine();
			while(s!=null) {
			System.out.println(s);
			String [] v = s.split(",");
//			String courseDept = v[0];
//			String courseNum = v[1];
//			String cap = v[2];
			Course c = new Course(v[0],v[1],v[2]);
			ll.add(c);
			s = course.readLine();	
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void readRequestFile() {
		// TODO Auto-generated method stub
		try {
			String s = request.readLine();
			while(s!=null) {
			System.out.println(s);
			String [] v = s.split(",");
			double[][] grades = new double [4][2];
			grades[0][0]= Double.parseDouble(v[5]);
			grades[0][1]= Double.parseDouble(v[6]);
			grades[1][0]= Double.parseDouble(v[7]);
			grades[1][1]= Double.parseDouble(v[8]);
			grades[2][0]= Double.parseDouble(v[9]);
			grades[2][1]= Double.parseDouble(v[10]);
			grades[3][0]= Double.parseDouble(v[11]);
			grades[3][1]= Double.parseDouble(v[12]);
			Request r =new Request(v[0],v[1],v[2],v[3],Integer.parseInt(v[4]),grades);
			addRequest(r);
			s=request.readLine();
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	@Override
	public void processRequests() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub
		for (int i =0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

	}

	@Override
	public void addRequest(Request req) {
		// TODO Auto-generated method stub
		pq.enqueue(req);
	}

	@Override
	public Course getCourse(String courseDept, int courseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
