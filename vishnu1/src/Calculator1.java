interface Calculator1 {
	 public abstract void sum(int a,int b);
	 public abstract void sub(int a,int b);

}
interface Calculator2{
	public abstract void mul(int a,int b);
}
interface Calculator3 extends Calculator1{
	public abstract void div(int a,int b);
	
}