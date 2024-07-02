def matmul(mat1, mat2):
    m1, n1 = len(mat1), len(mat1[0])
    m2, n2 = len(mat2), len(mat2[0])

    result = [[0 for _ in range(n2)] for _ in range(m1)]
    for i in range(m1):
        for j in range(n2):
            for k in range(n1):
                result[i][j] += mat1[i][k] * mat2[k][j]

    return result


# driver code
if __name__ == "__main__":
    mat1 = [[1, 2, 3, 4],
            [2, 3, 4, 5],
            [3, 4, 5, 6]]
    mat2 = [[1, 2],
            [3, 4],
            [5, 6],
            [7, 8]]

    result = matmul(mat1, mat2)
    for row in result:
        print(row)
