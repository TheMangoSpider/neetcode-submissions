class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Integer[]> q = new ArrayDeque<>();
        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Integer[] {i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;

        int mins = 0;
        Integer[] pos;
        while (q.size() > 0 && fresh > 0) {
            boolean changed = false;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                if (fresh == 0) {
                    break;
                }
                pos = q.poll();
                System.out.println(Arrays.toString(pos));
                System.out.println(i);
                if (pos[0] > 0 && grid[pos[0] - 1][pos[1]] == 1) {
                    System.out.println("left");
                    grid[pos[0] - 1][pos[1]] = 2;
                    q.add(new Integer[] {pos[0] - 1, pos[1]});
                    fresh--;
                    changed = true;
                }
                if (pos[1] > 0 && grid[pos[0]][pos[1] - 1] == 1) {
                    System.out.println("above");
                    grid[pos[0]][pos[1] - 1] = 2;
                    q.add(new Integer[] {pos[0], pos[1] - 1});
                    fresh--;
                    changed = true;
                }
                if (pos[0] < grid.length - 1 && grid[pos[0] + 1][pos[1]] == 1) {
                    System.out.println("right");
                    grid[pos[0] + 1][pos[1]] = 2;
                    q.add(new Integer[] {pos[0] + 1, pos[1]});
                    fresh--;
                    changed = true;
                }
                if (pos[1] < grid[pos[0]].length - 1 && grid[pos[0]][pos[1] + 1] == 1) {
                    System.out.println("below");
                    grid[pos[0]][pos[1] + 1] = 2;
                    q.add(new Integer[] {pos[0], pos[1] + 1});
                    fresh--;
                    changed = true;
                }
            }
            if (changed) {
                mins++;
            }
        }

        if (mins == 0 || fresh > 0) {
            mins = -1;
        }
        return mins;
    }
}
