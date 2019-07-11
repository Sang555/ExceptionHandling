import java.io.*;
public class SerializeDemo
{

	public static void main(String[] args)
	{
	try
	{
	Person p=new Person();
	p.name="Sang";
	p.age=21;
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("person.ser"));
	oos.writeObject(p);
	oos.close();
	System.out.println("serialized");
		
	}
	catch(Exception e)
	{
	}

	}

}