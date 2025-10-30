// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random()*(lim+1));
		int num2 = (int)(Math.random()*(lim+1));
		int num3 = (int)(Math.random()*(lim+1));
		int min = Math.min(num1, Math.min(num2, num3));
		int max = Math.max(num1, Math.max(num2, num3));
		int mid = num1 + num2 + num3 - min - max;
		System.out.println(num1 + " " + num2 + " " + num3);
		System.out.println(min + " " + mid + " " + max);
		//Math.random()
		//Math.min(int,int)
		//Math.max(int,int)

	}
}
