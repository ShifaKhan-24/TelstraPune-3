abstract class Bevrages
{
abstract void prepare();


}

class Tea extends  Bevrages
{
void prepare()
{
// Logic here for tea preaption
System.out.println("Tea Prepared");

}
}

class Coffee extends Bevrages
{
void prepare()
{

System.out.println("Prepare Coffee");

}


}


class Juice extends Bevrages
{

void prepare()
{

System.out.println("Prepare Juice");

}
}



class VendingMachine
{
private Bevrages b;
VendingMachine(Bevrages b)
{
this.b=b;

}

void processDrink( )
{
b.prepare();

}

}




class app
{

public static void main(String  a[])
{
/*Bevrages b=new Tea();
b.prepare();

System.out.println(b instanceof Tea);
Tea t=new Tea();
System.out.println(t instanceof Bevrages);
*/

VendingMachine vm=new VendingMachine(new Tea());
vm.processDrink();

vm=new VendingMachine(new Coffee());
vm.processDrink();

}

}

/*from abc import ABC

class Bevrages(ABC):

@abstractmethod
def prepare():
*/