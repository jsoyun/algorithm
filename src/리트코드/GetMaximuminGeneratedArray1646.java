package 리트코드;

import java.util.Arrays;

public class GetMaximuminGeneratedArray1646 {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        int[] nums = new int[n + 1]; //7개 길이
        nums[0] = 0;
        nums[1] = 1;

        for (int index = 2; index < n + 1; index++) {
            //num[index] 값이 짝수냐

            //아 이미 기록이 되는구나
            if (index % 2 == 0) {
                nums[index] = nums[index / 2]; //몫 1  num2 =1 num4 =1 num6 =2

            } else if (index % 2 == 1) { //num 홀수냐
                nums[index] = nums[index / 2] + nums[index / 2 + 1]; //num3 = 2 num5 = 3 num7 = 3

            }


        }


        return Arrays.stream(nums).max().getAsInt();
    }

    public static void main(String[] args) {
        GetMaximuminGeneratedArray1646 getMaximuminGeneratedArray1646 = new GetMaximuminGeneratedArray1646();
        int n = 0;
        int maximumGenerated = getMaximuminGeneratedArray1646.getMaximumGenerated(n);
        System.out.println("maximumGenerated = " + maximumGenerated);
    }
}



