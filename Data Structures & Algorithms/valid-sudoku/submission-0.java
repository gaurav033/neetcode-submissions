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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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

        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
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

        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
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

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
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
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
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
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
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

        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
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
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
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
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
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
        return true;
    }
}
