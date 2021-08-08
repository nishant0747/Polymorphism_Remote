package polymorphism;
// polymorphism is OOPs principle where one object showing different behaviour at different stages of life cycle

public class overloading 
{ 
	// In compiletime polymorphism method declaration going to get binded to it's definition at compilation time, based on argument is known as compiletime polymorphism

	//method overloading is an example of compiletime polymorphism
	
	//declaring multiple methods with same name but different arguments in a same class is called method overloading
	public void add(int a, int b)
	{
		
		System.out.println("addition: "+(a+b));	
	}
	
	public void add(int a, int b, int c)
	{
		
		System.out.println("addition: "+(a+b+c));	
	}
	
	public void add() 
	{
		System.out.println("hello world");
		
	}
}
