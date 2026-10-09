class Solution {
    //int[][] visited;
    boolean[][] safe;
    public void solve(char[][] board) {
        //visited = new int[board.length][board[0].length];
        safe = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            //System.out.println(Arrays.toString(board[i]));
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == 0 || j == 0 || i == board.length - 1 || j == board[i].length - 1) {
                    markSafe(board, i, j);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 'X' && !safe[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
        //System.out.println();
        for (int i = 0; i < board.length; i++) {
            //System.out.println(Arrays.toString(board[i]));
        }
    }

    // public boolean visitArea(char[][]board, int i, int j) {
    //     if (i < 0 || j < 0 || i > board.length - 1 || j > board[i].length - 1 || visited[i][j] ==
    //     -1) {
    //         return false;
    //     }
    //     if (board[i][j] == 'X' || visited[i][j] == 1) {
    //         return true;
    //     }
    //     visited[i][j] = 1;
    //     if (visitArea(board, i + 1, j) && visitArea(board, i - 1, j) && visitArea(board, i, j +
    //     1) && visitArea(board, i, j - 1)) {
    //         board[i][j] = 'X';
    //         return true;
    //     }
    //     visited[i][j] = -1;
    //     return false;
    // }

    public void markSafe(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[i].length - 1 || board[i][j] == 'X'
            || safe[i][j]) {
            return;
        }
        safe[i][j] = true;
        markSafe(board, i + 1, j);
        markSafe(board, i - 1, j);
        markSafe(board, i, j + 1);
        markSafe(board, i, j - 1);
    }
}
