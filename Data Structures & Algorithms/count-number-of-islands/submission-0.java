class Solution {
    public int numIslands(char[][] grid) {
        int output = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    output++;
                    dfs(grid, new int[]{i,j});
                }
            }
        }
        return output;
    }
    public void dfs(char[][] grid, int[] pos) {
        if (pos[0] < 0 || pos[0] > grid.length - 1 || pos[1] < 0 || pos[1] > grid[pos[0]].length - 1 || grid[pos[0]][pos[1]] == '0') {
            return;
        }
        grid[pos[0]][pos[1]] = '0';
        dfs(grid, new int[]{pos[0] + 1, pos[1]});
        dfs(grid, new int[]{pos[0] - 1, pos[1]});
        dfs(grid, new int[]{pos[0], pos[1] + 1});
        dfs(grid, new int[]{pos[0], pos[1] - 1});
    }
}
