def linear_search(arr, target):
    n = len(arr)
    for i in range(n):
        if arr[i] == target:
            return i
    return -1       # return -1 if target not present

# driver code
if __name__ == '__main__':
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    target = 5
    index = linear_search(arr, target)
    print(index)
