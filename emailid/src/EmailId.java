import java.util.Scanner;
    public class EmailId {
	
		
		public static void main(String[] args)
			{
	       System.out.println("Enter total  email id's");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String str[] = new String[n];
			for(int i=0; i<n ; i++)
			{
				System.out.println("Enter email id");
				str[i] = sc.next();
			}
			System.out.println("Enter email id for searching: ") ;
			String sr  = sc.next();
			boolean flag = false ; 
			for(int j=0; j<n ; j++)
			{
				if(sr.equals(str[j]))
				{
				System.out.println("Required email id found at: "+(j+1));
			flag = true ;
				}
			}
		       if(!flag)
					System.out.println("Mail is not in array list");
			}
			
		}