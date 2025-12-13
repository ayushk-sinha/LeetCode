class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l = 0;
        int r = 0;
        Arrays.sort(g);
        int m = g.length;
        Arrays.sort(s);
        int n = s.length;
        while(r < m && l < n){
            if(g[r]<=s[l]){
                r = r+1;
            }
            l = l+1;
        }
        return r;
    }
}