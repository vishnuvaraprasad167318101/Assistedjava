import java.util.Scanner;
public class DemoArray3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size of an array ");
		int row=sc.nextInt();
		System.out.println("enter the cols size of an array");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for (int i=0;i<row;i++) {
			for (int j=0;j<row;j++) {
				System.out.println("enter the value of index"+i+","+j);
				a[i][j]=sc.nextInt();
				
			}
			
			
		}
		for (int i=0;i<row;i++) {
			for (int j=0;j<row;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");

	}

	}
}
