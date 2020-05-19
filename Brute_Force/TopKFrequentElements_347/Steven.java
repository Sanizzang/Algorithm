import java.util.*;
import java.io.*;


class Steven{

	public static int[] topKFrequent(int[] nums, int k){
		Map<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<>();

		for(int i = 0 ; i < nums.length ; i++){
			if(map.containsKey(nums[i])) map.replace(nums[i], map.get(nums[i]) + 1);
			else map.put(nums[i], 1);
		}

		for(int key : map.keySet()){
			if(map.get(key) >= k)
				res.add(key);
		}
	
		int[] ans = new int[res.size()];
		for(int i = 0 ; i < res.size() ; i++){
			ans[i] = res.get(i);
		}

		return ans;

	}
	public static void main(String[] args) throws Exception{

		int[] res = topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

		for(int num : res){
			System.out.print(num + " ");
		}

	}
}
