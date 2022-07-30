
public class MethodExecution {


		public int multipynumbers(int b,int c) {
			int a=b*c;
			return a;
		}

		public static void main(String[] args) {

			MethodExecution c=new MethodExecution();
			int ans= c.multipynumbers(100,25);
			System.out.println("Multipilcation is :"+ans);
			}

}
