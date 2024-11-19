class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        for (int[] size : sizes) {
            int a = size[0];
            int b = size[1];
            int w = a>b ? a : b;
            int h = a>b ? b : a;
            wMax = Math.max(wMax, w);
            hMax = Math.max(hMax, h);
        }
        return wMax*hMax;
    }
}