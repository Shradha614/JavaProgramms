package Package1;

public class Test {
	
	
	public void operator()
	{
		int a = 100;
		int b = 200;
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;

		System.out.println("Addition is  :"  +sum);
		System.out.println("Substraction is :"+sub);
		System.out.println("Multiplication is :"+mul);
		System.out.println("Division is :"+div);
		// decrement will decrease by 1
		
		int x = 20;
		int y = 30;
		x++;
		System.out.println("Value of X after postincrement "+x);  // 20
		++x;
		System.out.println("Value of X after preincremetnt "+x);  // 21 
		y--;
		System.out.println("Value of y after postincrement "+y);
		++y;
		System.out.println("Value of y after preincrement "+y);
		
        
	}
	// logical operator 
	// && - If both condition is true then result is true
     public void validation ()
     {
    	 String name  = "Shradha";
    	 // String used for alphanumeric string 
    	  String  pass = "Sn120";
    	  
    	  if (name.equals("Shradha")&&pass.equals("Sn120"))
    	  {
    		  System.out.println("You are loged in ");
    	  }
    	  else
    	  {
    		  System.out.println("Please check your username & Password ");
    	  }	  
    
     }
   
     public boolean logicaloperator()
     {
      
    	  String username = "sna";
    	  
    	  if(username.equals("sn"))
    	  {
    		  return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
   
    	
    	 
     }
}
