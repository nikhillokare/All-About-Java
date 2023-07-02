package mypack;

class student1
{
	int id; 
	String name;

void disp()
 {
	System.out.println(id+ " " +name);
 }
public static void main(String args[])

  {
	student1 s1=new student1();
	student1 s2=new student1();
	
	s1.disp();
	s2.disp();
   }
}

