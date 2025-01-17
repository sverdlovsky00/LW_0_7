package proj601;

import java.util.Arrays;

public class proj610 {
    public static int[] check_nums(int... nums) {
        int[] numchecked = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) { min = num; }
            if (num > max) { max = num; }
        }
        numchecked[0] = max;
        numchecked[1] = min;
        return numchecked;
    }
    
    public static void main(String[] args) {
        int[] nums = {7, 34, 0, 7, 92, 5, 8, 12, 56};
        System.out.println("Первоначальный массив чисел: " + Arrays.toString(nums));
        nums = check_nums(nums);
        System.out.println("Максимальное значение в массиве: " + nums[0] + " Минимальное значение в массиве: " + nums[1]);
    }
}