import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<Integer>());
            }
            ArrayList<Integer> lista = map.get(nums[i]);
            lista.add(i);
            map.put(nums[i], lista);
        }

        for (int j = 0; j < nums.length; j++) {
            int numero = target - nums[j];
            if (map.containsKey(numero)) {
                if (numero == nums[j]) {
                    if (map.get(numero).size() > 1) {
                        int[] result = { map.get(numero).get(0), map.get(numero).get(1) };
                        return result;
                        // ppp
                    }
                } else {
                    int[] result = { j, map.get(numero).get(0) };
                    return result;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] nums = { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 };
        int target = 11;
        int[] result = t.twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
