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
			//System.out.println(s);
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
			//System.out.println(s);
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
			Request r =new Request(v[0],v[2],v[1],v[3],Integer.parseInt(v[4]),grades);
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
		//System.out.println("<<<<<<<<<<<< Beginning of Queue Contents >>>>>>>>>>>>>>>>>");
		System.out.println("");
		pq.Qprint();
		System.out.println("");
//		Request co1;// = pq.dequeue();
//		Request co2 = pq.dequeue();
////		while(!pq.isEmpty()) {
////			co1 = pq.dequeue();
////			System.out.println("dequed something");
////			System.out.println(co1.compareTo(co2));
////		}
//		while(!pq.isEmpty()) {
//			co1 = pq.dequeue();
//			//System.out.println("dequed something");
//			
//			if(co1.compareTo(co2)== -1) {
//				pq.enqueue(co1);
//				co1 = co2;
//			}else if(co1.compareTo(co2) == 1) {
//				if (getCourse(co1.getCDept(),co1.getCourseNum())==ll.get(0)) {
//					ll.get(0).addStudent(co1.getName());
//					System.out.println("adding " + co1.getName()+ " to " + co1.getCDept()+ " " + co1.getCourseNum());
//				}else {
//					ll.get(1).addStudent(co1.getName());
//					System.out.println("adding " + co1.getName()+ " to " + co1.getCDept()+ " " + co1.getCourseNum());
//				}
//			}else {//if equal
//				if (getCourse(co1.getCDept(),co1.getCourseNum())==ll.get(0)) {
//					ll.get(0).addStudent(co1.getName());
//					System.out.println("adding " + co1.getName()+ " to " + co1.getCDept()+ " " + co1.getCourseNum());
//				}else {
//					ll.get(1).addStudent(co1.getName());
//					System.out.println("adding " + co1.getName()+ " to " + co1.getCDept()+ " " + co1.getCourseNum());
//				}
//			}
//			if(pq.isEmpty()) {
//				break;
//			}
//		}
		
		//System.out.println("<<<<<<<<<<<< End of Queue Contents >>>>>>>>>>>>>>>>>");
		while(!pq.isEmpty()) {
			Request co1 = pq.dequeue();
			if (getCourse(co1.getCDept(),co1.getCourseNum())==ll.get(0)) {
				if(!ll.get(0).isFull()) {
					System.out.println(co1.getName()+" successfully registered for " + co1.getCDept()+ " "+ co1.getCourseNum());
					ll.get(0).addStudent(co1.getName());
				}else {
					System.out.println(co1.getName()+" cannot register for " + co1.getCDept()+ " "+ co1.getCourseNum());
				}
				
				
			}else if (getCourse(co1.getCDept(),co1.getCourseNum())==ll.get(1)) {
				if(!ll.get(1).isFull()) {
					System.out.println(co1.getName()+" successfully registered for " + co1.getCDept()+ " "+ co1.getCourseNum());
					ll.get(1).addStudent(co1.getName());
				}else {
					System.out.println(co1.getName()+" cannot register for " + co1.getCDept()+ " "+ co1.getCourseNum());
				}
				
				
			}else {
				System.out.println("Class not available" );
			}
			
		}
		System.out.println("");
		pq.Qprint();
		System.out.println("");
		
	}

	@Override
	public void printClassList() {
		// TODO Auto-generated method stub
		for (int i =0; i < ll.size(); i++) {
			//System.out.println("Class list for "+ll.get(i).getName()+" "+ ll.get(i).getNum());
			System.out.println("");
			ll.get(i).printClassList();
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
		for(int i =0; i< ll.size();i++) {
			if(ll.get(i).getName().equals(courseDept )&& ll.get(i).getNum()==courseNumber) {
				return ll.get(i);
			}
		}
		return null;
	}

}
