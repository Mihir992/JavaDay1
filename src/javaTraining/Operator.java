package javaTraining;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic Operator
		int a,b;
		a=12;
		b=3;
		
		System.out.println("Arithmetic is " + (a+b));
		System.out.println("Sub is " + (a-b));
		System.out.println("Mul is " + (a*b));
		System.out.println("Div is " + (a/b));
		System.out.println("Remander is " + (a%b));
		
		//Assignment operator
		System.out.println(a +=5);
		System.out.println("Text" +(a +=5));
		
		//Logical operator
		// &&
		// ||
		
		//Conditional statement
		//if else
		
		
		if(a>5) 
		{
			System.out.println("A is greater than 5");
		}else if(a<5) {
			System.out.println("A is less than than 5");
		}
		else{
			System.out.println("A is not greater or less to 5");
		}
		
		if(a>5 && a<11) 
		{
			System.out.println("A is greater than 5 and less than 11");
		}
		else {
			System.out.println("A is greater than 5 and not less than 11");
		}
		
		if(a>5 || a<11) 
		{
			//true if any of condition
			System.out.println("A is greater than 5 and less than 11");
		}

	}
}
