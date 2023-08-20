// This programe use Hashmap data structure instead of Hashset data structure 

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(um, 0) + 1);
        }
    }
  
}
