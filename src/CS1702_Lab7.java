import java.text.DecimalFormat;
import java.lang.Math;
import java.io.File;
import java.util.Random;
import java.io.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class CS1702_Lab7 
{

	public static void main(String[] args) throws IOException
	{
		//Q_Strings();
		//Q_Mathematical_Functions();
		//Q_System_Commands();
		//Q_Random_Numbers();
		Q_File_Handling();
	}
		public static void Q_Strings()
		{
		
		// TODO Auto-generated method stub
		double number = 1.0/3.0, x = 123.456, y = 17.0/3.0, z = Math.pow(2.0, 2);
		
		String a = "Hello", b = "World";
		
		DecimalFormat number_format = new DecimalFormat("#.###");
		System.out.println(y);
		String formatted_string = number_format.format(y);
		System.out.println(formatted_string);
		}

		public static void Q_Mathematical_Functions()
		/*
		{
			RoundingTest(10.2);
		}
		private static void RoundingTest(double x) 
		{
			System.out.println(x);
			System.out.println(Math.floor(x));
			System.out.println(Math.ceil(x));
			System.out.println(Math.round(x));
		}
*/
		{
		int a = 10;
		double b = 15.789;
		String s = String.format("b = %2$.2f a = %1$d",a,b);
		System.out.println(s);

		}
		
		public static void Q_System_Commands()
		{
			String dir_name = "C:\\ "; //Or another directory
			File dir = new File(dir_name);
				
			File[] dir_list = dir.listFiles();
			for(int i=0;i<dir_list.length;++i)
			{
				System.out.println(dir_list[i].getName());
			}

		}
		
		public static void Q_Random_Numbers() 
		{
			Random rand = new Random();
			{
				for(int i=0;i<1;++i)
			{
					System.out.println("1)" + rand.nextInt() % 101);
			}
			}
			
			{
				for(int i=0;i<1;++i)
			{
					int x=rand.nextInt() % 10;
					System.out.println("2)" + x+5);
			}
			}
			
			{
				for(double i=0;i<1;++i)
			{
					System.out.println("3)" + rand.nextDouble());
			}
			}
			
			{
				for(int i=0;i<1;++i)
			{

					double x=rand.nextDouble() % 1;
					System.out.println("4)" + x);
			}
			}
			

		}
		
		public static void Q_File_Handling() throws IOException
		{
		//Write file	
			{
				   FileWriter writehandle = new FileWriter("\\\\ikb\\home\\19\\2303419\\Desktop\\Hello_World.txt");

				   BufferedWriter bw = new BufferedWriter(writehandle);
				   for(int i=0;i<10;++i)
				   {
				      String line = "My number is " + i;
				      bw.write(line);
				      bw.newLine();
				   }
				   bw.close();
				   writehandle.close();
				}
			//Read file
			{
				   FileReader readhandle = new FileReader("\\\\ikb\\home\\19\\2303419\\Desktop\\Hello_World.txt");
				   BufferedReader br = new BufferedReader(readhandle);
				   String line = null;
				   while((line = br.readLine()) != null)
				   {
				      System.out.println(line);
				   }
				   br.close();
				   readhandle.close();
				}
		}
}
