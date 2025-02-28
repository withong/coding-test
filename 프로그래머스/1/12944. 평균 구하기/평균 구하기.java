class Solution {

    public double solution(int[] arr) {
        int arrSum = 0;
        
        for (int value : arr) {
            arrSum += value;
        }
        
        return (double) arrSum / arr.length;
    }
}