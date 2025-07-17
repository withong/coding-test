class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
        }

        int count = 0;
        for (int num : arr) {
            if (num != min) {
                count++;
            }
        }
        
        int[] answer = new int[count];

        int index = 0;
        for (int num : arr) {
            if (num != min) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}