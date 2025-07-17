package codekata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeKata49 {

    public static void main(String[] args) {
        int[] result = solution(new int[]{2, 1, 3, 4, 1});
    }

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }

        Collections.sort(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
