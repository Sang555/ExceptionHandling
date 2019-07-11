import java.io.*;
public class IOdemo2
{

	public static void main(String[] args)
	{
	try
	{
		RandomAccessFile raf=new RandomAccessFile("Abc.txt","rw");
		raf.seek(raf.length());
		raf.writeBytes("Greet");
		
	}
	catch(Exception e)
	{
	}

	}

}