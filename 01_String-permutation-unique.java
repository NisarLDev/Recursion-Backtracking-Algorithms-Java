import java.util.*;

public class Main {
    public static void dfs(String str, String perm, List<String> list) {
        if (str.length() == 0) {
            list.add(perm);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // current character
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        List<String> lst = new ArrayList<>();
        dfs(str, "", list);
        for (String s :list) {
            System.out.println(s);
        }
    }
}
