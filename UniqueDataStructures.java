import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

// In python use  set in es6



class sortbyid implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.eid > o2.eid)
		{
			
			return 1;
			
		}
		else if(o1.eid < o2.eid)
		{
			
			return -1;
			
		}
		
		
		return 0;
	}
}

class sortbyname implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.ename.compareTo(o2.ename);
		
	}
}

	
	class Employee 
	{
		
		int eid;
		
		
		String ename;
		public Employee(int eid, String ename) {
			super();
			this.eid = eid;
			this.ename = ename;
		}
		
	
		
		public String toString()
		{
			
			return eid +" "+ ename;
		}
	}



	





//class Employee implements Comparable<Employee>
//{
//	
//	int eid;
//	
//	
//	String ename;
//	public Employee(int eid, String ename) {
//		super();
//		this.eid = eid;
//		this.ename = ename;
//	}
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		
//		if(this.eid > o.eid)
//		{
//			
//			return 1;
//			
//		}
//		else if(this.eid < o.eid)
//		{
//			
//			return -1;
//			
//		}
//		
//		
//		return 0;
//	}
//	
//	
//
//	
//	public String toString()
//	{
//		
//		return eid +" "+ ename;
//	}
//}


//class Employee1 implements Comparable<Employee1>
//{
//	
//	int eid;
//	
//	
//	String ename;
//	public Employee1(int eid, String ename) {
//		super();
//		this.eid = eid;
//		this.ename = ename;
//	}
//	@Override
//	public int compareTo(Employee1 o) {
//		// TODO Auto-generated method stub
//		
//		return this.ename.compareTo(o.ename);
//		
//	}
//	
//	
//
//	
//	public String toString()
//	{
//		
//		return eid +" "+ ename;
//	}
//}
//


public class UniqueDataStructures {

	public static void main(String[] args) 
	{
		
		

		
		
//		tr.add(10);
//		tr.add(1);
//		tr.add(2);
//		tr.add(5);
//		tr.add(4);
		
		
//		tr.add(new Employee1(10,"Sahil"));
//		tr.add(new Employee1(1,"Omkar"));
//		tr.add(new Employee1(6,"Aakash"));
//		tr.add(new Employee1(5,"Dakshatha"));
//		tr.add(new Employee1(7,"Shifa"));

	
		
		
	//	TreeSet tr=new TreeSet(new sortbyid());
		
		TreeSet tr=new TreeSet(new sortbyname());
		
		
		
		tr.add(new Employee(10,"Sahil"));
		tr.add(new Employee(1,"Omkar"));
		tr.add(new Employee(6,"Aakash"));
		tr.add(new Employee(5,"Dakshatha"));
		tr.add(new Employee(7,"Shifa"));

		
		
		
		
		System.out.println(tr);
		
	// Iterator---Interface
	//ListIterator---Interface
		
	
		
		
		
	
	
		
		

	}

}
