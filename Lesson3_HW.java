/** 
 * Java. Level 1. Lesson 3. HomeWork.
 * @author Yuriy Fedak.
 * @version 20.08.2018.
 */
 import java.util.Scanner;
 import java.util.Random;
 
 class Lesson3_HW {
	// method for task 1;
	public static void createGame1(){
		Random random = new Random();
		Scanner scanner = new Scanner (System.in);
		int userChoise;
		int userTry;
		int compValue;
		do {
			compValue = random.nextInt(10);
			System.out.println("Input your value, pls.");
			for (int i=1; i<=3; i++) {
				userTry = scanner.nextInt();
				if (userTry == compValue) {
				System.out.println("You win!!!");
				break;
				}
				else if (userTry < compValue) System.out.println("Your value less then my. Try again.");
				else System.out.println("Your value bigger then my. Try one's more.");
				if (i==3) System.out.println("You loose!");
			}
			do {
				System.out.println("Want to play one more time? 1- Yes / 0 - No ");
				userChoise = scanner.nextInt();
				if ((userChoise != 1) && (userChoise != 0)) System.out.println("Your choise is not clear for me. Try again. 1 - Yes / 0 - No. ");
			}
			while (!((userChoise == 1)||(userChoise == 0)));
		}
		while (userChoise == 1);
	}	
	// method for task 2;
	public static  void createGame2(){
		String[] mass = {"banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", 
		"mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
		int equalCounter = 0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String compWorld = mass[random.nextInt(25)];
		System.out.println("Try to guess my world (name of fruit or vegitable).");
		do{
			String mask = "###############";
			char[] maskArray = mask.toCharArray();
			String userWorld = scanner.next();
			if (userWorld.equals("exit")) break;
			for (int i = 0, k = 0; (i <= (compWorld.length()-1)) && (k <= (userWorld.length()-1)); i++, k++) {
				if (compWorld.charAt(i) == userWorld.charAt(i)){
					equalCounter += 1;
					maskArray[i] = userWorld.charAt(i);
				}
			}
			if (equalCounter == userWorld.length()){
				System.out.println("You win!!!");
				break;
			}
			else {
				mask = new String(maskArray);
				System.out.println("No, your variant is not equal to my. " + mask + " Try again one's more. exit for finish. ");
				equalCounter = 0;
			}
		}
		while (true);
	}		
    public static void main (String args[]) {
		createGame1();	
		createGame2();	
	}
 }