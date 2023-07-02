package assignment4;

public class Enum  
{ 
	public enum Day{SUNDAY(0), MONDAY(1);
		
		public int value;
		private Day(int value)
		{
			this.value=value;
		}
		
	
	
}	
    public static void main(String[] args) 
	{
		for(Day d:Day.values())
    	
		{
			System.out.println(d+ " " +d.value);
		}
		

	}

}
