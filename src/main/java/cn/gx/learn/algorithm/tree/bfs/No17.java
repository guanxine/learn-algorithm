package cn.gx.learn.algorithm.tree.bfs;

import java.util.*;

//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
//
//给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
public class No17 {

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0 || digits == null) {
            return Collections.emptyList();
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result = new ArrayList<>();
        helper(map, digits, new StringBuilder(),  result);
        return result;
    }

    private void helper(Map<Character, String> map, String digits, StringBuilder comb,  List<String> result) {
        if (digits.length() == 0) {
            result.add(comb.toString());
        }
        else {
            char num = digits.charAt(0);
            String num2Char = map.get(num);
            for (int i = 0; i < num2Char.length(); i++) {
                comb.append(num2Char.charAt(i));
                helper(map, digits.substring(1), comb,  result);
                comb.deleteCharAt(comb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {

    }
}
