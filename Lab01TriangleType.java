package lab01;

/**
 * In this program, you will be writing a method called triangleType to determine the type of
 * triangle you might be able to form given 3 side-lengths. The main program that I have provided
 * will test your method with a variety of cases. Your goal is to make all of the test cases work.
 */

public class Lab01TriangleType {

	/**
	 * Method name: triangleType
	 * @param a - a double value indicating the length of one side of a triangle
	 * @param b - a double value indicating the length of a second side of a triangle
	 * @param c - a double value indicating the length of the third side of a triangle
	 * @return - an int value that will be returned using the following logic:
	 * 
	 * 
	 * 
	 * 		-1 if the values a, b, and c cannot form a triangle
	 *		1 if the values a, b, and c form an acute triangle 
	 *		2 if the values a, b, and c form a right triangle 
	 *		3 if the values a, b, and c form an obtuse triangle
	 * Note:
	 * 	#1: Three lengths can form a triangle if the sum of the two smaller lengths
	 * 		is greater than the biggest length
	 *  #2:	If the square of the biggest length is
	 *  	o less than the sum of the squares of the other two lengths ==> acute triangle
	 *  	o equal to the sum of the squares of the other two lengths ==> right triangle
	 *  	o greater than the sum of the squares of the other two lengths ==> obtuse triangle
	 */
	public static int triangleType (double a, double b, double c) {

		double short1;
		double short2;
		double long1;
		
		double lonsq = Math.pow(long1,2);
		double s1sq = Math.pow(short1, 2);
		double s2sq = Math.pow(short2, 2);
		//setting variables
		if (a<b) {
			
			if (b>c) short2 = c;
			else short2 = b;
		} short1 = a;
		
		else {
			if (a>c) short2 = c;
			else short2 = a;
		}short1 = b;
		
		
		//return int
		if ((short1 + short2) <= long1) return -1;
		else if (longsq <(s1sq+ s2sq) ) return 1;
		else if (longsq == (s1sq + s2sq)) return 2;
		else return 3;
		
	
		
	}

	
	/*********************************************************/
	/**** MAIN PROGRAM for Sangam's Automated Testing */
	/*********************************************************/
	
	// DO NOT CHANGE THIS MAIN METHOD
	//
	public static void main(String[] args) {
		double[][] triSidesArray =
				new double[][] {
						{0,0,0}, {0,1,1}, {1,0,1}, {1,1,0}, // not a triangle
						{3,4,4}, {4,3,4}, {4,4,3}, // acute isosceles
						{0.00003, 0.00004, 0.00004}, // acute isosceles // <-- added
						{3,3,5}, {3,5,3}, {5,3,3}, // obtuse isosceles
						{0.00003, 0.00003, 0.00005}, // obtuse isosceles // <-- added
						{0.00005, 0.00003, 0.00003}, // obtuse isosceles // <-- added
						{0.00005, 0.00012, 0.00013}, // right
						{1,1,1}, // acute equilateral
						{0.00001,0.00001,0.00001}, // acute equilateral // <-- added
						{3,4,9}, {3,9,4}, {4,3,9}, {.4,.9,.3}, {.09,.03,.04}, {.009,.004,.003}, // not a triangle
						{4,5,6}, {4,6,5}, {5,4,6}, {.5,.6,.4}, {.06,.04,.05}, {.006,.005,.004}, // acute
						{3,4,5}, {3,5,4}, {4,3,5}, {.4,.5,.3}, {.05,.03,.04}, {.005,.004,.003}, // right
						{2,4,5}, {2,5,4}, {4,2,5}, {.4,.5,.2}, {.05,.02,.04}, {.005,.004,.002} // obtuse
						};
		int[] expectedTriType =
				new int[] {//  ADDED THESE -->   V           V  V        V
						-1, -1, -1, -1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 2, 1, 1, -1, -1, -1, -1, -1, -1,
						1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3
						};
		String form = "form";
		int passTotal = 0;
		for (int i=0; i<triSidesArray.length; i++) {
			double a = triSidesArray[i][0];
			double b = triSidesArray[i][1];
			double c = triSidesArray[i][2];
			int tType = triangleType(a, b, c);
			if (tType == -1) {
				form = "do not form a triangle";
			} else if (tType == 1) {
				form = "form an acute triangle";
			} else if (tType == 2) {
				form = "form a right triangle";
			} else if (tType == 3) {
				form = "form an obtuse triangle";
			} else {
				form = "form an unknown thingamajig (triangle type is " + tType + ")";
			}
			System.out.print("Side lengths " + a + ", " + b +
					", and " + c + " " + form + ".");
			
			int expTriType = expectedTriType[i];
			if (expTriType == -1) {
				System.out.print(" EXPECTED: NOT A TRIANGLE.");
			} else if (expTriType == 1) {
				System.out.print(" EXPECTED: ACUTE TRIANGLE.");
			} else if (expTriType == 2) {
				System.out.print(" EXPECTED: RIGHT TRIANGLE.");
			} else if (expTriType == 3) {
				System.out.print(" EXPECTED: OBTUSE TRIANGLE.");
			}
			if (tType == expTriType) {
				System.out.println(" PASS! :-)");
				passTotal++;
			}
			else
				System.out.println(" FAIL! :-(");
		}
		System.out.println(passTotal + " out of " + expectedTriType.length + " test cases passed.");
	}

}
