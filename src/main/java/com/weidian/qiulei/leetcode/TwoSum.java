package com.weidian.qiulei.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiulei on 17/1/12.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                answer[0] = map.get(target - nums[i]);
                answer[1] = i;
                return answer;
            }
            map.put(nums[i], i);
        }
        return answer;
    }
}
