public class IntrotoJUnitTets {

	public static void main(String[] args) {
		Object expected = null;
		Object actual = null;
		assertEquals(expected, actual);

	}

	private static void assertEquals(Object expected, Object actual) {

		assertEquals(4, add(2, 2));
		//Object brains = null;
//		assertEquals(brains, getZombieFood());
//		assertEquals(2, getLargest(3, 2));
//		

	}

//	private static Object getLargest(int i, int j) {
//		if(i>j) {
//			return i;
//		}
//		return j;
//		
//		
//	}
//	
//	private static Object getZombieFood() {
//
//		return null;
//		
//
//	}

	private static Object add(int i, int j) {

		return Math.addExact(i, j);
		
	}
}
