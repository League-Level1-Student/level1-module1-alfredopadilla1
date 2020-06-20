public class Vault {
	
	public int secretCode;

	public boolean tryCode(int number) {

		if (number == secretCode) {
			return true;

		} else {
			return false;
		}
	}

	public Vault(int number) {

		this.secretCode = number;

	}

}


