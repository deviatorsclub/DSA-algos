def row_wise_traversal(matrix):
    m, n = len(matrix), len(matrix[0])

    for i in range(m):
        for j in range(n):
            print(matrix[i][j], end=" ")
        print()

def column_wise_traversal(matrix):
    m, n = len(matrix), len(matrix[0])

    for i in range(n):
        for j in range(m):
            print(matrix[i][j], end=" ")
        print()

# driver code
if __name__ == '__main__':
    matrix = [[1, 2, 3, 4],
              [5, 6, 7, 8],
              [9, 0, 1, 2]]

    row_wise_traversal(matrix)
    column_wise_traversal(matrix)
