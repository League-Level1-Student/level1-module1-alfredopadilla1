
public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted, boolean male) {

		if (isKnighted == true && male == true) {
			return "Hello Sir " + name;
		} 
		if (male == true && isKnighted == false) {
			return "Hello Mr." + name;	
		} 
		if (isKnighted == true && isWoman == true) {
			return "Hello Lady " + name;
	
		}
		if (isWoman == true && isKnighted == false) {
			return "Hello Ms." + name;
		} 
		if ( male == false && isKnighted == false && isWoman == false) {
			return "Hello Mr." + name;	
		}
		
		
		
		return "Jake from State Farm";

	}
}
