package example7_2;

public class Fighter extends GameCharacter {

    public int damage;

    public void strike(GameCharacter character){
        System.out.println(this.name + " attacks " + character.name);
        character.looseHealth(damage);
    }
}
