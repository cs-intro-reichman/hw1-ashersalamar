// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// futureValue = currentValue*(1 + rate)^(n)
		int currentValue = Math.abs(Integer.parseInt(args[0]));
		double rate = Double.parseDouble(args[1]);
		rate = rate / 100;
		int n = Math.abs(Integer.parseInt(args[2]));
		int futureValue = (int)(currentValue * Math.pow((1 + rate), n));
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate*100 + "% will yield $" + futureValue);
	}
}