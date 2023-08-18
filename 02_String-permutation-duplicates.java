class Solution {
  public static void dfs(String str, String perm, List<String> list) {
    if (str.length() == 0) {
      list.add(perm);
    }
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if ()
    }
  }
  public List<String> find_permutation(String S) {
    char[] arr = S.toCharArray();
    Arrays.sort(arr);
    String str = new String(arr);

    List<String> list = new ArrayList<>();
    dfs(str, "", list);
    return list;
  }
}
