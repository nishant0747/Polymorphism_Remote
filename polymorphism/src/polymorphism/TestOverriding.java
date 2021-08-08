package polymorphism;

public class TestOverriding 
{
	public static void main(String[] args) 
	{
		goodEvening s = new goodEvening();
		s.m1();
		s.m1(45);
		System.out.println(s.a);
	
		
		goodEvening.m2();
		goodEvening.m3();
	
		
	}

}

