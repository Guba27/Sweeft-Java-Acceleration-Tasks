import java.util.HashMap;
import java.util.Map;

public class FirstAssigment {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);

        if (result == -1) {
            System.out.println("Error: No number is repeated");
        } else if (result == -2) {
            System.out.println("Error: All numbers are repeated");
        } else {
            System.out.println("The number that does not repeat is: " + result);
        }
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();

        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        int result = -1;
        boolean foundUnique = false;

        for (int num : nums) {
            if (numCount.get(num) == 1) {
                result = num;
                foundUnique = true;
                break;
            }
        }

        boolean allRepeated = true;
        for (int count : numCount.values()) {
            if (count > 1) {
                allRepeated = false;
                break;
            }
        }

        if (allRepeated || !foundUnique) {
            return -1;
        }

        return result;
    }
}
