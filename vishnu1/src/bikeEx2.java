class Bike2{
	int speed=200;
	void display() {
		System.out.println("this is a bike"+speed);
	}
}
class C15 extends Bike2{
	int speed=300;
	void speedOfC15() {
		speed=super.speed+120;
		System.out.println(speed);
	}
}
class YamahanewC15 extends Bike2{
	void speedofnewC15() {
		System.out.println(speed+200);
	}
}


public class bikeEx2 {
public static void main(String[] args) {
	C15 c15=new C15();
	c15.display();
	c15.speedOfC15();
	
	YamahanewC15 newc15=new YamahanewC15();
	newc15.speedofnewC15();
	
	
	
}
}


