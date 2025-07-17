class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
            int tempW = 0;
            int tempH = 0;

            if (w > h) {
                tempW = w;
                tempH = h;
            } else {
                tempW = h;
                tempH = w;
            }

            maxW = Math.max(maxW, tempW);
            maxH = Math.max(maxH, tempH);

        }
        
        return maxW * maxH;
    }
}