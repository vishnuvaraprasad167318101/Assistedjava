class Bike1{
	int speed=200;
	void display() {
		System.out.println("this is a bike"+speed);
	}
}
class B15 extends Bike1{
	void speedOfR15() {
		speed=speed+120;
		System.out.println(speed);
	}
}
class YamahanewR15 extends Bike1{
	void speedofnewR15() {
		System.out.println(speed+200);
	}
}


public class bikeEx1 {
public static void main(String[] args) {
	B15 r15=new B15();
	r15.display();
	r15.speedOfR15();
	
	YamahanewR15 newr15=new YamahanewR15();
	newr15.speedofnewR15();


}
}
