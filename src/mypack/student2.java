package mypack;
// parameterized Constructor
class Student2
{
     int id;
     String name;
       
       Student2(int i , String n)
       {
    	   id=i;
    	   name=n;
       }
        
       void disp()
       {
    	   System.out.println(id+ " " +name);
       }
       public static void main(String args[])
       {
    	   Student2 s1=new Student2(1,"Nikhil");
    	   Student2 s2=new Student2(2,"Aniket");
    	   s1.disp();
    	   s2.disp();
       } 
}
       