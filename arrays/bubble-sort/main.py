def bubble_sort(arr):
    n = len(arr)

    for i in range(n - 1):
        # swapped variable to check if there was any swapping
        # for optimization
        swapped = False
        for j in range(n - i - 1):
            # if next element smaller than the current element then swap
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        
        # if no swap then the array is already sorted
        if not swapped:
            break

# driver code
if __name__ == "__main__":
    arr = [1, 2, 3, 5, 1, 0, 0, 2343, -23, -2, 2]
    bubble_sort(arr)
    print(arr)
