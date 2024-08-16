import java.util.ArrayList;
import java.util.Iterator;

public class SortAnyListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	
	ArrayList <Integer>al=new ArrayList<>(); 
	al.add(10);
	al.add(89);
	al.add(1);
		
	System.out.println(al);
	
for(int i=0;i<al.size();i++)
{
	
	System.out.println(al.get(i));

}
	
// How to iterate over any collection
// call the iterator() over that collection
Iterator <Integer>iobj=al.iterator();

//System.out.println(iobj.hasNext());
//
//System.out.println(iobj.next());

	
while(iobj.hasNext())
{
Integer iob=iobj.next();

System.out.println(iob);	
}
	}

}
