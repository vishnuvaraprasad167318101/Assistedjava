package ap1;

public class MethodOverload{
	
	public void area(int b,int h)
	    {
	         System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(int r) 
	    {
	         System.out.println("Area of Circle : "+(3.14*r*r));
	    }

	    public static void main(String args[])
	   {

	    	MethodOverload ob=new MethodOverload();
	       ob.area(7,3);
	       ob.area(8);  
	   }
	}
