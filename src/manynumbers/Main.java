package manynumbers;

import java.util.Random; 

public class Main {
public static void main(String[] args) {
	
	int min = 1000;
	int max = 9999; 
//	double a = Math.random()*(max-min+1) + min; 
//	System.out.println(a);

	int b = (int)(Math.random()*(max-min+1)+min);
	System.out.println(b);
	
	Random x = new Random(); 
	int z = x.nextInt(1000);
	System.out.println(z);
	

//	System.out.println(Math.random());
}
}
