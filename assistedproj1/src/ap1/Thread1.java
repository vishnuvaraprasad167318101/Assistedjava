package ap1;


	class NumberIteration implements Runnable{
		public void run() {
			for(int i=0;i<9;i++) {
				System.out.println(i);
			}
		}
		
	}

	public class Thread1{
		public static void main(String[] args) {
						//normal object
			NumberIteration numi=new NumberIteration();
			//thread obj must be made
			Thread t=new Thread(numi);
			t.start();
		
		}

	}
