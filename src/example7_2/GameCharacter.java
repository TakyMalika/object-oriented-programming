package example7_2;

public class GameCharacter {
	public String name;
    public int health;


    public void looseHealth(int amount){
        if (health > amount){
            health -= amount;
            System.out.println(name + " looses health by " + amount);
        }
        else {
            health = 0;
            System.out.println(name + " dies!");
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}
