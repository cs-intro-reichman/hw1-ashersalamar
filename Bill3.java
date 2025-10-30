// Splits a restaurant bill evenly among three diners.

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double billAmount = Double.parseDouble(args[3])/3;
		
		double splitAmount = (Math.ceil(billAmount ));
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + splitAmount + " Shekels each." );
	}
}
