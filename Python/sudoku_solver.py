class Solution:
    def solveSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: void Do not return anything, modify board in-place instead.
        """
        rowTable = [[False for colum in range(9)] for row in range(9)]
        columTable = [[False for colum in range(9)] for row in range(9)]
        subBoxTable = [[False for colum in range(9)] for row in range(9)]
        
        self.initSudokuTable(board, rowTable, columTable, subBoxTable)
        self.solveSudokuTable(board, rowTable, columTable, subBoxTable)        

    def initSudokuTable(self, board, row, colum, subBox):
        for i in range(9):
            for j in range(9):
                k = 3 * (i // 3) + j // 3
                if board[i][j] is not ".":
                    index = int(board[i][j]) - 1
                    row[i][index] = colum[j][index] = subBox[k][index] = True
    
    def solveSudokuTable(self, board, row, colum, subBox):
        for i in range(9):
            for j in range(9):
                if board[i][j] is ".":
                    k = 3 * (i // 3) + j // 3
                    for index in range(9):
                        if (not row[i][index] and not colum[j][index] and not subBox[k][index]):
                            board[i][j] = str(index + 1)
                            row[i][index] = colum[j][index] = subBox[k][index] = True
                            if self.solveSudokuTable(board, row, colum, subBox): return True
                            row[i][index] = colum[j][index] = subBox[k][index] = False
                            board[i][j] = "."
                    return False
        return True