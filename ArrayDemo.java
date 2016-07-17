class ArrayDemo {
	
	public static void main( String[] args) {

		// declares an array of integers

		int[] anArray;

		// alocates memory for 10 integers

		anArray = new int[10];

		// initialize first element
		anArray[0] = 100;

		// initilize second element

		anArray[1]=200;

		//and so forth;

		anArray[2]=300;
		anArray[3]=400;
		anArray[4]=500;
		anArray[5]=600;
		anArray[6]=700;
		anArray[7]=800;
		anArray[8]=900;
		anArray[9]=1000;
		// Second array

		int[] cristi;

		cristi = new int[7];

		cristi[0]=7;
		cristi[1]=14;
		cristi[2]=21;
		cristi[3]=28;
		cristi[4]=35;
		cristi[5]=42;
		cristi[6]=49;
	
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 4: " + anArray[4]);
		System.out.println("Element at index 5: " + anArray[5]);
		System.out.println("Element at index 6: " + anArray[6]);
		System.out.println("Element at index 7: " + anArray[7]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);


		System.out.println("Element at cristi index 0: " + cristi[0]);
		System.out.println("Element at cristi index 1: " + cristi[1]);
		System.out.println("Element at cristi index 2: " + cristi[2]);
		System.out.println("Element at cristi index 3: " + cristi[3]);
		System.out.println("Element at cristi index 4: " + cristi[4]);
		System.out.println("Element at cristi index 5: " + cristi[5]);
		System.out.println("Element at cristi index 6: " + cristi[6]);
		
		// Alternatively you can use the shortcut syntax to creat and initialize an array

		int[] oarie = { 100, 200, 300, 400, 500, 600, 700, 800,900, 1000};

		System.out.println(oarie[1]);
	}



}





class MultiDimArrayDemo {

	public static void main(String[] args) {
		String[][] names = { { "Mr.","Mrs.","Ms."}, {"Smith","Jones"}};
		
		// Mr. Smith

		System.out.println(names[0][0] + names[1][0]);

		// Ms. Jones

		System.out.println(names[0][2] + names[1][1]);

	}

}





