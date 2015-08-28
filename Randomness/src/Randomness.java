/*
1. 0-4
2. No. 3-7
3. All the numbers are constant. They are not the same with each other, but the numbers at the same places are the same with themselves all the time.
4. The numbers become a different set.
*/
import java.util.Random;

public class Randomness {
	public static void main (String[] args) {
		Random r = new Random();

		int x = 1 + r.nextInt(10);

		System.out.println("My random number is " + x);

		System.out.println("Here are some numbers from 1 to 5!");
		System.out.print(3 + r.nextInt(5) + " ");
		System.out.print(3 + r.nextInt(5) + " ");
		System.out.print(3 + r.nextInt(5) + " ");
		System.out.print(3 + r.nextInt(5) + " ");
		System.out.print(3 + r.nextInt(5) + " ");
		System.out.print(3 + r.nextInt(5) + " ");
		System.out.println();

		System.out.println("Here are some numbers from 1 to 100!");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if (num1 == num2) {
			System.out.println("The random numbers were the same! Weird.");
		}
		if (num1 != num2) {
			System.out.println("The random numbers were different! Not too surprising, actually.");
		}
	}
}