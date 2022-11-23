package manynumbers;

import java.util.Random; 
import java.util.concurrent.ThreadLocalRandom; 

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
	
	int localRandom1 = ThreadLocalRandom.current().nextInt(99,10000);
	int localRandom2 = ThreadLocalRandom.current().nextInt();
	
	System.out.println(localRandom1);
	

//	System.out.println(Math.random());
}
}
