import java.util.Scanner;
public class ArrayTranspose
{
	public static void main(String[] args)
	{
		int i,j,temp,r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Size:");
		r=sc.nextInt();
		System.out.println("Enter Column Size:");
		c=sc.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(i<=j)
				{
					temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=a.length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
