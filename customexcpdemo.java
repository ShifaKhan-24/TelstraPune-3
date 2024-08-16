

// How to create user-define excpetion
// Create a  user defined exception class and extend it with Exception

// getMessage(),printStackTrace(),getCause(),getInitCause()


class NoInteractionException extends Exception
{
 NoInteractionException()
{
System.out.println("This exception will be raise due non -interaction");
}

}

class Trainer
{
void askQuestion(String question,String answer)throws  NoInteractionException
{

if(question !=null && answer ==null)
{

throw new NoInteractionException();
}
else
{

System.out.println("Question asked by trainer is:"+ question +"Answer is:"+answer);

}
}// end of method
}// end of trainer class

class App
{
public static void main(String a[])throws NoInteractionException
{
Trainer t=new Trainer();
t.askQuestion("What is Programming",null);
}
}
