import java.io.*;
public class Deserialize
{

	public static void main(String[] args)
	{
	try
	{

	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("person.ser"));
	Person p=(Person)ois.readObject();
	ois.close();
	System.out.println("Age: "+p.name);
		
	}
	catch(Exception e)
	{
	}

	}

}