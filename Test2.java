package Package1;

public class Test2 {
    public void calling()
    {
    	System.out.println("This method called in another class");
    }
	public static void main(String arg[])
	{
	    System.out.println("Start");
		Test t = new Test();
		t.operator();
		t.validation();
		boolean flag = t.logicaloperator();
		if(flag)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}

}
