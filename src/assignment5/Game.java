package assignment5;
class g
{
	void play()
	{
		System.out.println("Playing Game");
	}
	
}
class boradgame extends g
{
	void plays()
	{
		System.out.println("Playing Board Game");
	}
}
class chess extends g
{
	void checkmate()
	{
		System.out.println("You are checkmate");
	}
	void out()
	{
		System.out.println("You lose the game");
	}
}

public class Game 
{

	public static void main(String[] args) 
	{
		chess s=new chess();
		s.checkmate();
		s.out();
		s.play();
		
		
	}

}
