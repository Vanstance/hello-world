package ArrayString;

import java.util.HashMap;
import java.util.Map;

class TwoSum{
    public static int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
}


    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int target = 4;
        System.out.println(twoSum(nums,target));
    }

}


