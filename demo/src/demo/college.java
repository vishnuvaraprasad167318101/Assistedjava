package demo;

public class college {
	
	int id;
	String name;
	static String college="IIT";
	public college(int id, String name) {
		this.id = id;
		this.name = name;
}
	void display() {
		System.out.println(id=""+name+""+college);
	}
	void change(String newcollege) {
	college=newcollege;	
	}
}
