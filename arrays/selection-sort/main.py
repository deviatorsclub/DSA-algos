def selection_sort(arr):
    n = len(arr)
    for i in range(n):

        # find the minimum element in the remaining unsorted array
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        
        # swap the minimum element with the first element
        arr[i], arr[min_index] = arr[min_index], arr[i]

# driver code
if __name__ == '__main__':
    arr = [1, 2, -1, -34, 0, 0, 23423423, 45, 2, 1, 5, 1, 5]
    selection_sort(arr)
    print(arr)