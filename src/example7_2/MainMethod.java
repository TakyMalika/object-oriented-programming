package example7_2;

public class MainMethod {

	public static void main(String[] args) {
        //GameCharacter monster = new GameCharacter();
        //monster.name = "Spook";
        //monster.health = 20;
        
        Fighter myHero = new Fighter();
        myHero.name = "My Hero";
        myHero.health = 20;
        myHero.damage = 25;
        
        //myHero.strike(monster);
        //System.out.println();
        
        Fighter anotherMonster = new Fighter();
        anotherMonster.name = "Ork";
        anotherMonster.health = 30;
        anotherMonster.damage = 15;
        while(anotherMonster.isAlive() && myHero.isAlive()){
            anotherMonster.strike(myHero);
            if (myHero.isAlive()) {
                myHero.strike(anotherMonster);
            }
        }
    }

}
