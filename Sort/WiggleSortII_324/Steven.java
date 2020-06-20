/*
 *	Date: 20. 06. 20
 *	Writer: Steven, Lee
 *
 *	Problem: Wiggle Sort II 342 from Leetcode
 *
 */

import java.util.*;
import java.io.*;

class Steven{

    	public static void wiggleSort(int[] nums) {
       		if(nums.length == 0 || nums.length == 1) return;

                Arrays.sort(nums);

                int[] res = new int[nums.length];

                int idx = 0;
                int left = nums.length % 2 == 0 ? (nums.length / 2 - 1) : nums.length / 2;
                int right = nums.length - 1;

                while(idx < res.length){
                        res[idx++] = nums[left--];
                        if(idx >= res.length) break;
                        res[idx++] = nums[right--];
                }

                for(int i = 0 ; i < nums.length ; i++){
                        nums[i] = res[i];
                }
    	}
	public static void main(String[] args) throws Exception{
		int[] nums = new int[]{1, 5, 1, 1, 6, 4};
		
		wiggleSort(nums);
		for(int num : nums){
			System.out.print(num + " ");
		}
	}
}

/*
 *  Task is reordering it such that nums[0] < nums[1] > nums[2] < nums[3] ...
 * let's call a high number peek. for example nums[1] is a peek.
 * let's call a low number valley. here, nums[0], nums[2] is a valley.
 * problem said "You may assume all input has valid answer".
 * therefore, there are only two possibilities. if length of nums is odd, then, peek = n, valley = n+1
 * if length of nums is even, then, peek = n, valley = n.
 * after sorting, we are able to seprate it as a set of peeks and valleys.
 *
 *  mid of the set is if it is even then, (0...N = valley, N + 1...length = peek) or if it is odd then, (0...N + 1, N + 2...length)
 * it can be solved by getting a num from the valley and the peek alternatively. also, it should get the num from the last of each set.
 * for example, let's say nums {1, 5, 1, 1, 6} after sorting {1, 1, 1, 5, 6}
 * becasue this nums is odd so mid should be 2 {1, 1, 1}, {5, 6}
 * next step is get a num from each sets. 1, 6, 1, 5, 1
 *
 *									by Steven, Lee 20.06.20
 */
