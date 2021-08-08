package polymorphism;

public class goodEvening extends goodMorning
{
	//In method overriding acquiring superclass method into subclass with the help of extend keyword and changing it's definition, according to subclasss specification is called method overriding
    int a = 4; 
	void m1()
	{
		System.out.println("Good evening");
		
	}
	
	public static void m2() 
	{
		System.out.println("I am overrided m2");
		
	}
	
	public void m1(int a) 
	{
		System.out.println(a);
		
	}
	
	static void m3()
	{
		System.out.println("static 2");
	}
	

	
	


}
