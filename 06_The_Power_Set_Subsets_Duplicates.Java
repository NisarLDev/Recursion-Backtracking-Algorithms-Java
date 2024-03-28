class Solution{
  public static void dfs(int[] nums, List<List<Integer>> list, List<Integer> sub, int start) {
    list.add(new ArrayList<>(sub));
    for (int i = start; i < nums.length; i++){
      if (i > start && nums[i] == nums[i - 1]) continue;
      sub.add(nums[i]);
      dfs(nums, list, sub, i + 1);
      sub.remove(sub.size() - 1);
    }
  }
  public List<List<Integer>> subsets(int[] nums) {
    Array.sort(nums);
    List<List<Integer>> list = new ArrayList<>();
    dfs(nums, list, new ArrayList<>(), 0);
    return list;
  }
} // TC: O(n * 2^n), SC: O(n)
//  This challenge is available at Leetcode. Number 90. Subsets II.