import java.io.IOException;

 class UserException extends Exception
{
	UserException()
	{
	}
	UserException(String msg)
	{
	super(msg);
	}
}

class A
{

public  void abc() throws NullPointerException, ArithmeticException, IOException, UserException
{
	int a=50;
	for(int i=1;i<20;i++)
	{
		System.out.println(i);
		int result=a/(a-i);
		if(i==100)
			throw new NullPointerException();
		if(i==120)
			return;
		if(i==80)
			throw new UserException("when is 8");
	}
}

public  void xyz() throws NullPointerException, ArithmeticException, IOException,  UserException
{
	abc();
}
public  void atoz() throws NullPointerException, ArithmeticException, IOException, UserException
{
	xyz();
}
}



public class ExceptionDemo
{
public static void main(String[] args)
{
	try{
		A a=new A();
		a.atoz();
	}
	catch(NullPointerException e)
	{
		System.out.println("Null pointer exception");
	}
	catch(IOException e)
	{
		System.out.println("IO exception");
	}
	catch(UserException e)
	{
		e.printStackTrace();
		System.out.println("User exception");
	}
	catch(Exception e)
	{
		System.out.println("Excpetion handled");
	}
	finally
	{
		System.out.println("Thanks");
	}
	System.out.println("Program completed");


}
}