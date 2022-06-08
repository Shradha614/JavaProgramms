package BasicPrograms;

public class ClassA {
	int a ;   // Instance variable 
	char b ; 
	boolean c ;
	double d ;
	float f ;
	byte i ; 
	
	void display()
	{
		System.out.println("Program for display default value of datatype");
	}
	void datatype()
	{
		System.out.println("Default value of int : "+a);
		System.out.println("Range  of int : "+a);
		System.out.println("Default value of char : "+b);
		System.out.println("Default value of double :"+d);
		System.out.println("Default value of float :"+f);
		System.out.println("Default value of byte :"+i);
		System.out.println("Default value of boolean :"+c);
	}
	public static void main(String arg[])
	{
		ClassA a = new ClassA();
		a.display();
		a.datatype();
		
	}

}
