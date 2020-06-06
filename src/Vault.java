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


