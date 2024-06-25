def binary_search(arr, target):
    start, end = 0, len(arr) - 1

    while start <= end:
        mid = start + (end - start) // 2    # Prevent overflow

        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    
    return -1

# driver code
if __name__ == '__main__':
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    target = 5

    index = binary_search(arr, target)
    print(index)