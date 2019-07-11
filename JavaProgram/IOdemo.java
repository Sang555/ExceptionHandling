import java.io.*;
public class IOdemo
{

	public static void main(String[] args)
	{
	try
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENter file name");
		String fname=br.readLine();
		File f=new File(fname);
		String line;
		if(f.exists())
		{
			BufferedReader fr=new BufferedReader(new FileReader(f));
			while((line=fr.readLine())!=null)
			{
			System.out.println(line);
			}
			fr.close();
		}
		else
		{
		System.out.println("Not found");
		}
		br.close();
		
	}
	catch(Exception e)
	{
	}

	}

}