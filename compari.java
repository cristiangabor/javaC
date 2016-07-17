class compari {

	public static void main(String[] args) {

		int value1=1;
		int value2=2;
		int value3=3;
	
		if (value1 == value2)
			System.out.println("value1 == value2");

		if (value1 != value2)
			System.out.println("value1 != value2");
		if (value1 > value2)
			System.out.println("value1 > value2");
		if (value1 < value2)
			System.out.println("value1 < value2");
		if (value1 <= value2) 
			System.out.println("value1 <= value2");

		if ((value1 < value2) && (value1 < value3))	
			System.out.println("value1 < value2 && value3");
		if ((value1 > value3) || (value3 > value1))
			System.out.println("value3 > value1");
	}
}
