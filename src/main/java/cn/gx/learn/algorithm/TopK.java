package cn.gx.learn.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by guanxine on 17-9-19.
 */
public class TopK {

    public static void main(String[] args) throws IOException {


        String file = "/home/guanxine/work/git/learn-algorithm/src/main/resources/topk.txt";
        int size = 2;
        Map<String, Integer> resultMap = readFile(file); // o(n)
        Comparator comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue(); // asc
            }
        };
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue(size, comparator);//

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()){
            if (minHeap.size() < size) {
                minHeap.add(entry);
            }
            else {
                if (minHeap.peek().getValue() - entry.getValue() < 0) {
                    minHeap.poll();
                    minHeap.add(entry);
                }
            }
        }
        List<Map.Entry<String, Integer>> result = new ArrayList<>();
        while (!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }

        for (int i = result.size() -1; i >= 0 ; i--) {
            Map.Entry<String, Integer> word = result.get(i);
            System.out.println(word.getKey() + "==" + word.getValue());
        }

    }

    private static Map<String, Integer> readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line =  null;
        Map<String, Integer> map = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(" ");
            for (String word : split) {
                Integer count = map.get(word);
                if (count == null) {
                    map.put(word, 1);
                }
                else {
                    map.put(word, count + 1);
                }
            }
        }

        return map;
    }
}
