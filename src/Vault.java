public class Vault {
	
	private int secretCode;

	public boolean tryCode(int number) {

		if (number == secretCode) {
			return true;

		} else {
			return false;
		}
	}

	public Vault(int secretCode) {

		this.secretCode = secretCode;

	}

	public static void main(String[] args) {
		int secretCode = 5;
		Vault vault = new Vault(secretCode);
		if (vault.tryCode(3)) {
			System.out.println("Error");
			
		}
	}

}

//1. We need a Vault object that contains a secret code.It also contains a tryCode() method that takes a number as a parameter and returns
// true if that number opens the vault, false otherwise.
//
//2. Test the vault object using a main method.
//
//3. Make a James Bond class that has a method findCode() that takes a Vault as a parameter.
//The codes are between 0 and 1 million. This method tries all the codes, and returns the first code that opens the vault, or -1 if no
// code opened the vault.
//
//4. Test your code by instantiating the JamesBond and Vault classes.
//
//5. Add a constructor for Vault so that you can easily set the secret code.