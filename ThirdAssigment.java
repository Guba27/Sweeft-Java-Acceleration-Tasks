import java.util.HashSet;
import java.util.Set;

public class ThirdAssigment {
    public static void main(String[] args) {
        Integer[] array = {5, 7, 3, 8};
        int result = notContains(array);
        System.out.println("The minimum integer not in the array is: " + result);
    }

    public static int notContains(Integer[] array) {
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : array) {
            numSet.add(num);
        }

        int minMissing = 1;
        while (numSet.contains(minMissing)) {
            minMissing++;
        }

        return minMissing;
    }
}
