def isValidSudoku(board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """    
        size = len(board)
        rowSet = [set() for x in range(size)]
        columSet = [set() for x in range(size)]
        subBoxSet = [set() for x in range(size)]
        for row in range(size):
            for index in range(size):
                number = board[row][index]
                if set_invalid(rowSet[row], number) or set_invalid(columSet[index], number) or set_invalid(subBoxSet[3 * (row // 3) + index // 3], number): return False
        return True
    
def set_invalid(numberSet, number):
    """
    :type numberSet: Set{Str}
    :rtype: boolean
    """
    if number is not "." and number in numberSet:return True
    numberSet.add(number)
    return False

def is_unit_valid(unit):
    """
    :type unit: List[Str]
    :rtype : boolean
    :this method is a way to check if the list contains duplicate items. -> check set.length and original list length.
    """
    unit = [i for i in unit if i != '.']
    return len(set(unit)) == len(unit)

def main():
    input = [[".","8","7","6","5","4","3","2","1"],["2",".",".",".",".",".",".",".","."],["3",".",".",".",".",".",".",".","."],["4",".",".",".",".",".",".",".","."],["5",".",".",".",".",".",".",".","."],["6",".",".",".",".",".",".",".","."],["7",".",".",".",".",".",".",".","."],["8",".",".",".",".",".",".",".","."],["9",".",".",".",".",".",".",".","."]]
    print isValidSudoku(input)

if __name__ == '__main__':
    main()