package exercise8_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class SearchWord {

	public static void main(String[] args) throws IOException {
		String word, path, name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the name of file");
		name = sc.next();
		System.out.println("Insert the path of the file");
		path= sc.next();
		System.out.println("Write down the word you want to search for");
		word= sc.next();
	
		File f = new File(path + "\\" + name + ".txt");
		InputStream stream = new FileInputStream(f);
		InputStreamReader streamReader = new InputStreamReader(stream, Charset.forName("UTF-8"));
		BufferedReader b = new BufferedReader(streamReader);
		String line;  
		
		while ((line = b.readLine()) != null) {
			 String[] w = line.split(" ");
			 for (int i = 0; i<w.length; i++) {
				 if (w[i].equalsIgnoreCase(word)) {
					 System.out.println(line + "\n"); 
				 }	 
			 }
	    }
	}	
}
