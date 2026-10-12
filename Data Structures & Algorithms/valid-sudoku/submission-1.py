class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(len(board)):
            seen = set()
            for j in range(len(board[i])):
                if board[i][j] in seen:
                    return False
                elif board[i][j].isdigit():
                    seen.add(board[i][j])

        for j in range(len(board)):
            seen = set()
            for i in range(len(board[j])):
                if board[i][j] in seen:
                    return False
                elif board[i][j].isdigit():
                    seen.add(board[i][j])
        
        for box_row in range(0, 9, 3):
            for box_col in range(0, 9, 3):
                seen = set()
                for i in range(3):
                    for j in range(3):
                        if board[box_row + i][box_col + j] in seen:
                            return False
                        elif board[box_row + i][box_col + j].isdigit():
                            seen.add(board[box_row + i][box_col + j])
        return True
