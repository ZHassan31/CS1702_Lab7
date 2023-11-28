import java.text.DecimalFormat;
import java.lang.Math;
public class CS1702_Lab7 
{

	public static void main(String[] args) 
	{
		//Q_Strings();
		//Q_Mathematical_Functions();
		
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

}
