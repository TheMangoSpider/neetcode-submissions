class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int returnVal = islandCounter(new int[]{i,j}, grid);
                    if (returnVal > max) {
                        max = returnVal;
                    }
                }
            }
        }
        return max;
    }

    public int islandCounter(int[] pos, int[][] grid) {
        if (pos[0] < 0 || pos[1] < 0 || pos[0] > grid.length - 1 || pos[1] > grid[pos[0]].length - 1 || grid[pos[0]][pos[1]] == 0 ) {
            return 0;
        }
        grid[pos[0]][pos[1]] = 0;
        return 1 + islandCounter(new int[]{pos[0] - 1, pos[1]}, grid)
            + islandCounter(new int[]{pos[0]  + 1, pos[1]}, grid)
            + islandCounter(new int[]{pos[0], pos[1] - 1}, grid)
            + islandCounter(new int[]{pos[0], pos[1] + 1}, grid);
    }
}
