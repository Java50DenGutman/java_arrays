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
	int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] != number) {
            count++;
        }
    }

    int[] res = new int[count];
    int j = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] != number) {
            res[j] = array[i];
            j++;
        }
    }

	return res;
}
public static int[] insertNumberSorted(int [] arraySorted, int number) {
	int index = Arrays.binarySearch(arraySorted, number);
    if (index < 0) {
        index = -(index + 1);
    }
    int[] res = new int[arraySorted.length + 1];
    System.arraycopy(arraySorted, 0, res, 0, index);
    res[index] = number;
    System.arraycopy(arraySorted, index, res, index + 1, arraySorted.length - index);
    return res;
}
}
