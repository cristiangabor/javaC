class BreakDemo {
	
	public static void main(String[] args) {

		int[] arrayofInts = {32,87,3,589,12,1076,3395,532,2144,12};

		int searchfor = 12;
		
		boolean foundit = false;

		int i;

		for (i=0; i < arrayofInts.length; i++) {
			if (arrayofInts[i] == searchfor) {
				foundit = true;
				break;

			}
		}

		if (foundit) {
			System.out.println("Found " + searchfor + " at index " + i);
		} else {
			System.out.println(searchfor + " not in the array " ); 
		}
	}
}
