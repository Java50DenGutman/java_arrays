package telran.arrays;

import java.util.Arrays;

public class ArraysInt {
public static int[] addNumber(int [] array, int number) {
	int [] res = Arrays.copyOf(array, array.length+1);
	res[array.length] = number;
	return res;
}
public static int[] insertNumber(int[] array, int index, int number) {
	int [] res = new int[array.length+1];
	System.arraycopy(array, 0, res, 0, index);
	res[index] = number;
	System.arraycopy(array, index, res, index+1, array.length - index);
	return res;
}
public static int[] removeNumber(int [] array, int number) {
	//return arr with no number at the given index
	return null;
}
public static int[] insertNumberSorted(int [] arraySorted, int number) {
	//TODO takes sort arr and number to array
	//return sorted arr with the given number at a proper position
	//apply the standard method of class Arrays int binarySearch(int [] arraySorted, int key)
	return null;
}
}
