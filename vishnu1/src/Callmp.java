class CalImp implements Calculator3{

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}


	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}

	
	
}

public class Callmp {
public static void main(String[] args) {
	CalImp imp=new CalImp();
	imp.div(49, 7);
	
}

}

