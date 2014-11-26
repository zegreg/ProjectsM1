import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex1 {




	public static File read(File f,File f1) throws IOException
	{

		File file3=new File("Result.txt");
		PrintWriter output=new PrintWriter(file3);
		
		BufferedReader sc=new BufferedReader(new FileReader(f));
		BufferedReader sc1=new BufferedReader(new FileReader(f1));
	
		String mensage = null;
		String mensage1 = null;
		
		while((mensage = sc.readLine())!= null)
		{
			
			output.println(mensage);
			

		}
		while((mensage1 =sc1.readLine())!= null)
		{
			
			output.println(mensage1);

		}
		
		output.close();

		return file3;
	}
	/**
	 *
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) {
		try
		{
			File file1=new File("File1.txt");
			File file2=new File("File2.txt");
			File file3=read(file1,file2);

			BufferedReader sc=new BufferedReader(new FileReader(file3));
			String msg = null;
			while((msg =sc.readLine()) != null)
				System.out.println(msg);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

