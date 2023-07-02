package mypack;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
	
        //arithmetic Operator:
		int a=10;
		int b=20;
		int c=25;
		int d=25;
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a*b= "+(a*b));
		System.out.println("a/b= "+(a/b));
		System.out.println("b/d= "+(b/d));
		System.out.println("b%a= "+(b%a));
		System.out.println("c%a= "+(c%a));
		System.out.println("a++= "+(a++));
		System.out.println("a--= "+(a--));
		System.out.println("d++= "+(d++));
		System.out.println("++d= "+(++d));
		
		
		//Relational Operator:
		System.out.println("a==b = "+(a==b));
		System.out.println("a!=b = "+(a!=b));
		System.out.println("a>b = "+(a>b));
		System.out.println("a<b = "+(a<b));
		System.out.println("a>=b = "+(a>=b));
		System.out.println("a<=b = "+(a<=b));
		
		
		//bitwise Operator:
		c=a&b;  /* a=0000 1010 b=0001 0100 */
		System.out.println("a&b= " + c);
		c=a|b;
		System.out.println("a|b= " + c);
		c=a^b;
		System.out.println("a^b= " + c);
		c=a&b;
		System.out.println("a&b= " + c);
		c=~a;
		System.out.println("~a= " + c);
		c=a<<2;
		System.out.println("a<<2= " + c);  //left shift
		c=a>>2;
		System.out.println("a>>2= " + c);  //Right shift
		
		//logical Operator:
		boolean g=true;
		boolean h=false;
		System.out.println("g&&h= " +(g&&h));
		System.out.println("g||h= " +(g||h));
		System.out.println("!(g&&h)= " +!(g&&h));
		
		//Assignment:
		c=a+b;  //30
		System.out.println("c=a+b = "+ c);
		c=c+a;
		System.out.println("c=c+a = " + c);
		c=c-a;
		System.out.println("c=c-a = "+ c);
		
		//Conditional and Ternary Operator:
		//variable x (Expression)? value if true : value if false
		b = (a==1)? 20:30;
		System.out.println("Value of b is: " + b);
		b = (a==10)? 20:30;
		System.out.println("value of b is : " + b);
		
		
		
	
		
	}

}
