class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> r = new HashMap<>();
        Map<Integer, Set<Character>> c = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.')
                    continue;
                String squaresKey = i / 3 + "," + j / 3;
                if (r.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]) ||
                    c.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) || 
                    squares.computeIfAbsent(squaresKey, k -> new HashSet<>()).contains(board[i][j])) {
                    return false;
                }
                r.get(i).add(board[i][j]);
                c.get(j).add(board[i][j]);
                squares.get(squaresKey).add(board[i][j]);
            }
        }
        return true;
    }
}
