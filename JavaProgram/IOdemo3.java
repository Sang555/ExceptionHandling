import java.io.*;
public class IOdemo3
{

	public static void main(String[] args)
	{
	try
	{
/*
		PrintWriter pw=new PrintWriter(new FileOutputStream("Abc.txt",true));
		pw.print("Hello");
		pw.flush();
		pw.close();
*/
		File dir1=new File("abc");
		dir1.mkdir();
		File dir2=new File(dir1,"xyz");
		dir2.mkdir();
		File f=new File(dir2,"atoz.txt");
		PrintWriter pw=new PrintWriter(new FileOutputStream("atoz.txt",true));
		pw.print("Hello");
		pw.flush();
		pw.close();
		
		
	}
	catch(Exception e)
	{
	}

	}

}