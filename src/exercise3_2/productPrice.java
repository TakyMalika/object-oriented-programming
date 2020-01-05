package exercise3_2;

import java.util.HashMap;
import java.util.Scanner;

public class productPrice {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> product = new HashMap<>();
		
		int PNumber = 0;
		String ans = " ";
		
		boolean x = true;
		
		product.put(1,20.5);
		product.put(2,10.0);
		product.put(3,15.0);
		product.put(4,12.5);
		
		Scanner sc = new Scanner(System.in);
		
		while(x) {
			System.out.println(">Input the key of product you want to search");
			PNumber=sc.nextInt();
			
			if(product.containsKey(PNumber)) {
				System.out.println("Price : " + product.get(PNumber));
			}
			else {
				System.out.println("The key " + PNumber + " does not exist.");
			}
			
			System.out.println("Do you want to search again? (y/n)");
			ans=sc.next();
			
			if (ans.equalsIgnoreCase("y")) {
				continue;
			}
			else {
				break;
			}	
		}

	}

}
