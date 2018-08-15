/**
 * Java. Level 1. Lesson 2. HomeWork.
 * @author Yuriy Fedak.
 * @version 16.08.2018.
 */
import java.util.Arrays;

class Lesson2_HW {
	// methods for task 1;
	public static int[] createMass1 () {
		int [] nums = {1,1,0,0,1,0,1,1,0,0};
		return nums;
	}
	public static int[] zero_to_ones (int[] x) {
		for (int i=0; i<x.length; i++) {
			if (x[i]==0) x[i]=1;
		}
		return x;
	}
	public static int[] ones_to_zero (int[] x) {
		for (int i=0; i<x.length; i++) {
			if (x[i]==1) x[i]=0;
		}
		return x;
	}
	// method for task 2;
	public static int[] createMass2() {
		int[] mass2 = new int[8];
		for (int i=0, k=0; i<8; i++, k+=3) {
			mass2[i]=k;
		}
		return mass2;
	}
	// methods for task 3;
	public static int[] createMass3 () {
		int [] nums = {1,5,3,2,11,4,5,2,4,8,9,1};
		return nums;
	}
	public static int[] transformMass (int[] x) {
		for (int i=0; i<x.length; i++) {
			if (x[i]<6) x[i]=x[i]*2;
		}
		return x;
	}
	//method for task 4;
	public static int[][] createMass4 () {
		int[][] x = new int[5][5];
		for (int i=0, k=(x[0].length-1); i<x[0].length; i++, k--) {
		x[i][i]=1;
		x[k][i]=1;
		}
		return x;
	}
	//methods for task 5;
	public static int getMinValue (int[] x){
		int minVal=x[0];
		for (int i=1; i<x.length; i++)
			if (x[i]<minVal) minVal=x[i];
		return minVal;
	}	
	public static int getMaxValue (int[] x){
		int maxVal=x[0];
		for (int i=1; i<x.length; i++)
			if (x[i]>maxVal) maxVal=x[i];
		return maxVal;
	}	
	//methods for task 6;
	public static int[] createMass6_1 () {
		int [] nums = {10,20,0,0,10,20,0,0,0,0};
		return nums;
	}
	public static int[] createMass6_2 () {
		int [] nums = {10,20,0,0,1,20,0,0,0,6};
		return nums;
	}
	public static boolean findEquals (int[] x) {
		int counter = 1;
		int leftSum = 0;
		int rightSum = 0;
		boolean equalCheck=false;
		do {
			for (int i = 0; i <= (counter-1); i++) leftSum = (leftSum + x[i]);
			for (int i = counter; i < (x.length-1); i++) rightSum = (rightSum + x[i]);
			if (leftSum == rightSum) { 
				equalCheck = true;
				break;
			}
			else equalCheck = false;
			counter++;
			leftSum = 0;
			rightSum = 0;
		}
		while (counter<x.length);
		return equalCheck;
	}
	//methods for task 7;
	public static int[] createMass7 () {
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		return nums;
	}
	public static int[] moveArrayItem (int[] x, int n) {
		int realn = n % x.length; // finding real shift n if n>x.length;
		int buffer = 0;
		if (realn>0) {
			for (int i = 1; i <= realn; i++) {
				buffer = x[(x.length-1)];
				for (int k = x.length-1; k >= 1; k--){
					x[k] = x[k-1];
				}
				x[0]=buffer;
			}		
		}
		else if (realn<0) {
			for (int i = 1; i <= Math.abs(realn); i++) {
				buffer = x[0];
				for (int k = 0; k <= x.length-2; k++){
					x[k] = x[k+1];
				}
				x[x.length-1] = buffer;
			}
		}
		return x;
	}
	public static void main (String[] args) {
		int[] x = createMass1();
		int[] y = createMass2();
		int[] z = createMass3();
		int[][] w = createMass4();
		// call for task No1
		System.out.println(Arrays.toString(x));
		zero_to_ones(x);
		System.out.println(Arrays.toString(x));
		ones_to_zero(x);
		System.out.println(Arrays.toString(x));
		// call for task No2
		System.out.println(Arrays.toString(y));
		// call for task No3
		System.out.println(Arrays.toString(z));
		transformMass(z);
		System.out.println(Arrays.toString(z));
		// call for task No4
		System.out.println(Arrays.toString(w[0]));
		System.out.println(Arrays.toString(w[1]));
		System.out.println(Arrays.toString(w[2]));
		System.out.println(Arrays.toString(w[3]));
		System.out.println(Arrays.toString(w[4]));
		// call for task No5
		x=createMass3(); // Creating array one more time. Using method from task 3.
		System.out.println(Arrays.toString(x));
		System.out.println("Min array value = " + getMinValue(x));
		System.out.println("Max array value = " + getMaxValue(x));
		// call for task No6
		System.out.println(Arrays.toString(createMass6_1()));
		System.out.println(Arrays.toString(createMass6_2()));
		System.out.println ("First array check res = " + findEquals(createMass6_1()));
		System.out.println ("Second array check res = " + findEquals(createMass6_2()));
		// call for task No7
		System.out.println(Arrays.toString(createMass7()));
		System.out.println(Arrays.toString(moveArrayItem(createMass7(), 3)));
		System.out.println(Arrays.toString(moveArrayItem(createMass7(), -3)));
	}
}