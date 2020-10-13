import java.io.*;
 class employee
{
	String name;
	int age;
	String city;
	public void display(String name,int age,String city)
	{
		System.out.println("The name is "+ name);
		System.out.println("The age is "+ age);
		System.out.println("The city is "+ city);
		
	}
	
	
}
public class day2
{
	public static void main(String args[])
	{
		employee e1=new employee();
		employee e2=new employee();
		e1.display("manoj", 20,"bangalore");
		e2.display("prithvi", 20, "bangalore");
	}
}