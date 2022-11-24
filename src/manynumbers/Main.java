package manynumbers;

//import java.util.Random; 
import java.util.concurrent.ThreadLocalRandom; 
import java.util.Scanner; 

public class Main {
public static void main(String[] args) {
	
//	int min = 99;
//	int max = 9999; 
//	double a = Math.random()*(max-min+1) + min; 
//	System.out.println(a);
//
//	int b = (int)(Math.random()*(max-min+1)+min);
//	System.out.println(b);
//	
//	Random x = new Random(); 
//	int z = x.nextInt(1000);
//	System.out.println(z);
	

//	int localRandom2 = ThreadLocalRandom.current().nextInt();
	
	int score = 0; 
	int tot = 0;
	Scanner scanner = new Scanner(System.in);

	String command; 
	
	while(true) {

	System.out.println("Press play");
	command = scanner.nextLine(); 
	
	if(command.equals("play")) {
		for(tot = 0; tot < 2; tot++) {	
			int localRandom1 = ThreadLocalRandom.current().nextInt(999,10000);
			System.out.println(localRandom1);
			int userInt = scanner.nextInt();
			if(userInt == localRandom1) {
				score++; 
			} 
		}
		
		System.out.println("You're score is: " + score); 
		scanner.nextLine();
	} 
	
	
//	System.out.println(Math.random());
	}
}
}
