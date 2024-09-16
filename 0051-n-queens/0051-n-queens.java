class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Call the helper method to find all solutions
        nQueens(board, 0, result);
        return result;
    }
    
    //Function to check if it's safe to place a queen at board[row][col]
    public boolean isSafe(char[][] board, int row, int col) {
        // Check the column (vertical up)
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        // Check the left diagonal (diagonal left up)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        // Check the right diagonal (diagonal right up)
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;
    }
    
    //Function to recursively solve the N-Queens problem
    public void nQueens(char[][] board, int row, List<List<String>> result) {
        // Base case: If we've placed queens in all rows, add the solution to the result
        if (row == board.length) {
            result.add(construct(board));
            return;
        }
        
        // Try placing a queen in each column of the current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                // Place the queen
                board[row][col] = 'Q';
                
                // Move on to the next row
                nQueens(board, row + 1, result);
                
                // Backtrack and remove the queen
                board[row][col] = '.';
            }
        }
    }
    
    // Function to convert the board to a list of strings
    public List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }
}