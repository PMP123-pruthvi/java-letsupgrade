import java.util.Scanner;
public class d3q2 {
public static void main(String args[])
{
	String name;
	int age;
	int dob;
	int mob;
	int yob;
	int salary;
	double tax=0.0;
	System.out.println("enter the name");
	Scanner sc=new Scanner(System.in);
	name=sc.next();
	System.out.println("enter the age");
	age=sc.nextInt();
	System.out.println("enter the date of birth");
	dob=sc.nextInt();
	System.out.println("enter the month of birth");
	mob=sc.nextInt();
	System.out.println("enter the year of birth");
	yob=sc.nextInt();
	System.out.println("enter the salary");
	salary=sc.nextInt();
	if(salary>=500000)
	{
		tax=salary*0.2;
	}
	else if(salary>=400000)
	{
		tax=salary*0.15;
	}
	else if(salary>=300000)
	{
		tax=salary*0.1;
	}
	else if(salary>=200000)
	{
		tax=salary*0.05;
	}
	System.out.println("name: "+name);	
	System.out.println("age: "+age);
	System.out.println("annual salary: "+salary);
	System.out.println("tax: "+tax);
	
}
}