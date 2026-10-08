class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<Integer[]> q = new ArrayDeque<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    q.add(new Integer[] {i, j});
                }
            }
        }

        int[][] dirs = { { -1, 0 }, { 0, -1 },
                         { 1, 0 }, { 0, 1 } };
        while (!q.isEmpty()) {
            Integer[] pos = q.poll();
            for (int[] dir : dirs) {
                int i = pos[0] + dir[0];
                int j = pos[1] + dir[1];
                if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] != Integer.MAX_VALUE) {
                    continue;
                }
                q.add(new Integer[] {i, j});
                grid[i][j] = grid[pos[0]][pos[1]] + 1;
            }
        }
    }
}
