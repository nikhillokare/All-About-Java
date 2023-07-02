package mypack;
import java.awt.*;

 class JavaAwtExample
 {
   public JavaAwtExample() 
{
	  Frame fm=new Frame("New Frame");
	  Label lb=new Label("Welcome to the refresh java");
	  fm.add(lb);
	  fm.setSize(500,600);
	  fm.setVisible(true);
	  
}
	public static void main(String args[]) 
	{
		JavaAwtExample awt=new JavaAwtExample();
	}

}
