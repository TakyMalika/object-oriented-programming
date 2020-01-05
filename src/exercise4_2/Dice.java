package exercise4_2;

public class Dice {
	  private int score; 
	  public int getScore() { 
		  return score; 
	  }
	  public void roll() { 
		  score = (int)(Math.random()*5)+0; 
	  }
}
