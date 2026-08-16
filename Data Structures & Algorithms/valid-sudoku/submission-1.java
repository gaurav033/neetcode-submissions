class Solution {
    private boolean isValidSudoku(char[][] board) {
        HashSet<Character> occurrence = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    if (!occurrence.add(board[i][j])) {
                        return false;
                    }
                }
            }
            occurrence.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                } else {
                    if (!occurrence.add(board[j][i])) {
                        return false;
                    }
                }
            }
            occurrence.clear();
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {

                int startRow = boxRow * 3;
                int startCol = boxCol * 3;

                int endRow = startRow + 3;
                int endCol = startCol + 3;

                for(int i=startRow;i<endRow;i++){
                    for (int j = startCol; j < endCol; j++) {
                        if (board[i][j] == '.') {
                            continue;
                        } else {
                            if (!occurrence.add(board[i][j])) {
                                return false;
                            }
                        }
                    }
                }
                occurrence.clear();

            }
        }

        return true;
    }
}
