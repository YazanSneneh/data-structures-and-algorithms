# Selection sort
- an algorithim applied on an unsorted array and sort it.
- search for the minimum number.
- then swap it with the first element in the range of unsorted items.
- what i mean by previous step is when i have 5 items in list and first round i find the smallest element it will be swapped with index 0 and the **range will become 1 to the end of the list.** and so on, to the end of the list.

### Explination 
1. find smallest element in range an d select it.
2. add it to the first index position.
3. increase counter.
4. this  [animation](https://www.youtube.com/watch?v=xWBP4lzkoyM) show implementation details i won't dive into in my article.

### Pseudocode
```java
SelectionSort(int[] arr)
    DECLARE n <-- arr.Length;
    FOR i = 0; i to n - 1  
        DECLARE min <-- i;  // current i is the new range
        FOR j = i + 1 to n
            if (arr[j] < arr[min])
                min <-- j;

        DECLARE temp <-- arr[min];
        arr[min] <-- arr[i];
        arr[i] <-- temp;
```
### Implementation
- the range is going to be the whole array so i can find the minimum number
- Numbers **before** selection sort : `[8,4,23,42,16,15]`

###### **Loop 1**
- after the first execution the counter will be increased by one, which means the range will become i+1
- the smallest number is **4** and swapped with **8**
**- [4,8,23,42,16,15].**

###### **Loop 2**
- The smallest number in the range is **8** and  it kept it's place.
**- [4,8,23,42,16,15].**

###### **Loop 3**
- The smallest number in the range now is **15** and swapped with **23** which is the first position in the new range.
**- [4,8,15,42,16,23].**

###### **Loop 4**
- The smallest number in the range is **16** and swapped with **42** which is the first position in the new range.
**- [4,8,15,16,42,23].**

###### **Loop 5**
- The smallest number in the range now is **23** and swapped with **42** which is the first position in the new range.
**- [4,8,15,16,23,42].**.


### Efficency
- the time complexity for this algorithim is **O(n^2) **because the algorithim will keep comparing n1 and n2.


### Test Our Solution using Junit

I am going to test happy path and edge case

1. edge case  array is empty
   ```java
   assertEquals("the result should be empty", "",insertionSort(numbers));

   result test pass
   Expected : 
   Actual   :
   ```

2. happy path success result

```java
assertEquals( "the result should be", "8 4 15 16 23 42 ", insertionSort(numbers));

  result test pass
   Expected : "4 8 15 16 23 42 "
   Actual   : "4 8 15 16 23 42 "
```

![ test cases](selection%20sort.png)