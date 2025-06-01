package PracticePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            int num = entry.getKey();
            buckets[freq].add(num);
        }

        int[] result = new int[k];
        int count = 0;

        for (int freq = buckets.length - 1; freq >= 0 && count < k; freq--) {
            for (int num : buckets[freq]) {
                result[count++] = num;
                if (count == k) {
                    break;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        new TopKFrequentElements().topKFrequent(nums,2);
    }
}
