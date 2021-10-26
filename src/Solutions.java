import java.util.*;

public class Solutions {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();    // Make a empty map

        for (int i = 0; i < nums.length; i++){          // loop though array
            if(map.containsKey(target-nums[i])){        // checks to see if key exist
                return new int[] {i,map.get(target - nums[i])};     // if key exist, returns i and value from map
            }
            map.put(nums[i], i);        // if key doesn't exist it puts it in the map.
        }
        return new int[0];      // returns 0
    }
}
