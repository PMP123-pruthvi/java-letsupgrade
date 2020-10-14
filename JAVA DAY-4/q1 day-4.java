import java.util.*;
class avengers
{
	String name;
	int age;
	int power;
	String weapon;
	String planet;
	Scanner sa=new Scanner(System.in);
	public void getdetails() 
	{
		
		System.out.println("Enter the name");
		this.name = sa.next();
		System.out.println("Enter the age");
		this.age=sa.nextInt();
		System.out.println("Enter the power");
		this.power=sa.nextInt();
		System.out.println("Enter the weapon");
		this.name=sa.next();
		System.out.println("Enter the planet");
		this.name=sa.next();
	}
	public void displaydetails()
	{
		System.out.println("name: "+this.name);
		System.out.println("age: "+this.age);
		System.out.println("power: "+this.power);
		System.out.println("weapon: "+this.weapon);
		System.out.println("planet: "+this.planet);
	}
}
public class d4q1 {
	public static void main(String args[]) 
	{
	avengers[] a=new avengers[5];
	for(int i=0;i<5;i++)
	{
		a[i].getdetails();
		a[i].displaydetails();
	}
	}

}