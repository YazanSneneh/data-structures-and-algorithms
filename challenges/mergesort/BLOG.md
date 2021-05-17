## Merge Sort
- merge sort is sorting algorithim uses divide and conquer
- merge sort iterate on array recursively.

#### mechanism
1. it split array into half each time method is called until i get single nodes.
2. merge items again recursively until i get the array strtuctured again as one block.
3. while merging nodesm it merge them in sorted order.

###### Data
[8,4,23,42,16,15]

#### Algorithim
```java
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```
##### implementation
![merge sort](merge-sort.jpeg)

- test:
  ![merge tests](test_merge_sort.png)
##### Analysis
Time Complexity **Big O(n)**