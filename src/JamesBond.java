
public class JamesBond {

	public static void main(String[] args) {
		int secretcode = 2;

		Vault v = new Vault(0);
		for (int i = 100_000_000; i > 0; i--) {

			if (v.tryCode(i)) {
				System.out.println("The code that opens the vault is " + i);
			} else {
				System.out.println("If no code opened the vault, try" + -1);

			}

		}

	}

}

//3. Make a James Bond class that has a method findCode() that takes a Vault as a parameter.
//The codes are between 0 and 1 million. This method tries all the codes, and returns the first
//code that opens the vault, or -1 if no code opened the vault.