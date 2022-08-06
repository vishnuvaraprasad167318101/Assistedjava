package ap1;

public class Throws
{
    void Division() throws ArithmeticException
    {
        int a=45,b=45,rs;
rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }
     public static void main(String[] args)
    {
Throws C = new Throws();
         try
        {
            C.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }
}
