class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet> rows = new HashMap<>();
        HashMap<Integer, HashSet> cols = new HashMap<>();
        HashMap<Integer, HashSet> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            squares.put(i, new HashSet<>());
        }
            
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && rows.get(i).contains(board[i][j])) {
                    return false;
                } else {
                    rows.get(i).add(board[i][j]);
                }

                if (board[i][j] != '.' && cols.get(j).contains(board[i][j])) {
                    return false;
                } else {
                    cols.get(j).add(board[i][j]);
                }

                if (board[i][j] != '.' && squares.get((i  / 3) * 3 + (j / 3)).contains((board[i][j]))) {
                    return false;
                } else {
                    squares.get((i / 3) * 3 + (j / 3)).add(board[i][j]);
                }
            }
        }
        
        return true;
    }
}
