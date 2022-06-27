package execution;

public abstract class baseGamer {   // Abstract classes have to need abstract methods or can't be override methods
	
	public abstract void account();
	
	
	public final void gameOver() { // It can't be overriden. Because we have used final keyword.
		
		System.out.println("Gamer over.");
		
	}

}
