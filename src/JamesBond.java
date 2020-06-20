
public class JamesBond {

	public static void main(String[] args) {
		int number = 2;

		Vault v = new Vault(number);
		
		
		System.out.println( "Secret code " + v.secretCode);
	
		for (int i = 1_000_000; i >= 0; i--) {

			if (v.tryCode(i)) {
				System.out.println("The code that opens the vault is " + i);
			}

		}

	}

}
