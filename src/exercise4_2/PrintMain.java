package exercise4_2;

import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean roll = true;
		String rolls;
		
		Distribution d1 = new Distribution(0,5);
		PrintDis printer1 = new PrintDis(d1);
		
		Dice dice = new Dice();
		
		while (roll) {
			dice.roll();
			d1.insertValue(dice.getScore());
			System.out.println("You got : " + dice.getScore());
			System.out.println("Do you want to roll the dice again y/n");
			rolls=sc.next();
			if(rolls.equalsIgnoreCase("Y")) {
				continue;
			}
			else {
				roll = false;
			}
		}
		printer1.print();

	}

}
