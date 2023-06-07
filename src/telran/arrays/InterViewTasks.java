package telran.arrays;

public class InterViewTasks {
static public boolean isSumTwo(short [] array, short sum) {
	//array of positive numbers or 0
	//{1, 2, 30, 2, 2}. sum = 4
	//helper = {false, true, true, false, false}
	boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE + 1];
	boolean res = false;
	int index = 0;
	while(index < array.length && !res) {
		short num = (short) (sum - array[index]);
		if (num >= 0) {
			if(helper[num]) {
				res = true;
			} else {
				helper[array[index]] = true;
			}
		}
		index++;
		
	}
	return res;
	
}
public static void sort(short[] array) {
    int[] count = new int[Short.MAX_VALUE + 1];
    for (short num : array) {
        count[num]++;
    }
    int index = 0;
    for (int i = 0; i < count.length; i++) {
        while (count[i] > 0) {
            array[index++] = (short) i;
            count[i]--;
        }
    }
}

public static short getMaxWithNegativePresentation(short[] array) {
	short maxWithNegative = -1;
    for (short num : array) {
        if (num > 0 && arrayContainsNegative(array, (short) -num)) {
            maxWithNegative = (num > maxWithNegative) ? num : maxWithNegative;
        }
    }
    return maxWithNegative;
}

static boolean arrayContainsNegative(short[] array, short num) {
    for (short n : array) {
        if (n == num) {
            return true;
        }
    }
    return false;
}

}