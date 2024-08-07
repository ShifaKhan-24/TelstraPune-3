import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Stack<String> stack=new Stack<String>();
	
	System.out.println(stack.empty());
	
	//lets add some items to stack
	
	stack.push("Structured programming");
	stack.push("Modular Programming");
	stack.push("Object Oriented Programming");
	stack.push("Functional Programming");
	
	System.out.println(stack.empty());
	
	System.out.println(stack);
	
	// remove an item from top
	stack.pop();
	System.out.println(stack);
	stack.pop();
	stack.pop();
	
//stack.pop();// throws an excpetion if no items available on top of the stack
	 String item=stack.pop();// add this code to get the item out from the stack
	
	 System.out.println(item);
	 
	 // it will not throw exception System.out.println(item);
	 
	// or use peek
	//stack.peek();
	
	System.out.println(stack);
	// ucan alsoe do a search
	System.out.println(stack.search("Modular Programming"));
	
	
	
	// lets demostarte outof menory heap space by pushing some items to stack 
	
	/*for(int i=0;i<1000000000;i++)
	{
		stack.push("something");
	}
	
	}*/
	
	

}







// Uses of Stack
/*
 * undo /redo features in text editors
 * moving back and forward through browser history
 * backtracking algorithms
 * calling functions
 */
