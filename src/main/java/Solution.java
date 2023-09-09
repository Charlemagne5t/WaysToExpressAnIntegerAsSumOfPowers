public class Solution {
    public int numberOfWays(int n, int x) {
        int modulo = 1_000_000_007;
        Integer[][] memo = new Integer[n + 1][n + 1];
        return dfs(n, x, 1, memo);
    }
    private int dfs(int n, int x, int i, Integer[][] memo){
        int modulo = 1_000_000_007;
        if(n < (int)Math.pow(i, x)){
            return 0;
        }
        if(n < 0){
            return 0;
        }
        if(n == (int) Math.pow(i, x)){
            return 1;
        }
        if(memo[n][i] != null){
            return memo[n][i];
        }
        int result = 0;
        int take = 0;
        int skip = 0;
        take = dfs((int) (n - Math.pow(i, x)), x, i + 1, memo) % modulo;
        skip = dfs(n, x, i + 1, memo) % modulo;
        result = (take + skip) % modulo;
        memo[n][i] = result;
        return result;
    }
}
