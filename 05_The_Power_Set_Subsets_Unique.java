class Solution{
  public static void dfs(int[] nums, List<List<Integer>> list, List<Integer> sub, int start) {
    list.add(new ArrayList<>(sub));
    for (int i = start; i < nums.length; i++){
      sub.add(nums[i]);
      dfs(nums, list, sub, i + 1);
      sub.remove(sub.size() - 1);
    }
  }
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    
  }
} // O(n * 2^n)
//  This challenge is available at Leetcode