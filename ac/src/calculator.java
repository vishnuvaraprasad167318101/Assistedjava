import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
 char operator;
 Double digit1, digit2, Solution;
 Scanner input = new Scanner(System.in);
 System.out.println("Enter a first value ");
 digit1 = input.nextDouble();
 System.out.println("Enter a second value");
 digit2 = input.nextDouble();
 System.out.println("enter an operator: +, -, *, or /");
 operator = input.next().charAt(0);
 switch (operator) {
 case '+':
	 Solution = digit1 + digit2;
     System.out.println(digit1 + " + " + digit2 + " = " + Solution);
     break;
 case '-':
	 Solution = digit1 - digit2;
	 System.out.println(digit1 + " - " + digit2 + " = " + Solution);
	 break;
 case '*':
	 Solution = digit1 * digit2;
	 System.out.println(digit1 + " * " + digit2 + " = " + Solution);
	 break;
 case '/':
	 Solution = digit1 / digit2;
	 System.out.println(digit1 + " / " + digit2 + " = " + Solution);
	 break;
	 default:
	 System.out.println("Invalid operator");
	 break;
	 }
	 input.close();

	}
	}
