<h3>ArrayLists</h3>

Before we explore ArrayLists it could be helpful to talk about Arrays.
Both Arrays and ArrayLists are Classes and are part of the Collections framework in Java and store the same types of objects or data types in a collection.  
The key differences are Arrays are immutable list which supports both primitives and objects which store these in CPU memory.  It points directly to the CPU memory location where the array object is stored. Whereas, ArrayLists are mutable and store objects like arrays.  ArrayLists use references that point to a memory address of the object within RAM. References are used to access and modify the objects within the Arraylist such as adding or removing elements.



ArrayLists are mutable arrays used to store a collection of objects/data types of the same type.  They offer the functionality of adding elements and is best used when the size of the array is unknown.
The size of an ArrayList is not set and can grow and shrink automatically (dynamically) which is useful for when the exact number elements are likely to change. 


Time complexity is the measurement of how much time an algorithm is required to execute.  For example, if in the case of searching for an element at the end of an Arraylist would take much less time complexity than searching for an element in the middle of the list.
In an ArrayList, to search for an element depends on the length of the array.  Therefore, the time complexity of an ArrayList is known as O(n)-with 'n' representing the length of the list and 'O' representing the order of the function.



### Time Complexity of ArrayList Operations

| **Operation**               | **Time Complexity** | **Explanation**                                                                 |
|-----------------------------|---------------------|---------------------------------------------------------------------------------|
| **Add to end**              | O(1) amortized      | Adding to the end is O(1) unless resizing is needed, which is O(n). Resizing is rare, so it's amortized O(1). |
| **Add at beginning**        | O(n)                | All elements must be shifted to the right to make space for the new element.    |
| **Add at any index**        | O(n)                | Elements after the insertion point must be shifted to the right.                |
| **Remove from end**         | O(1)                | No shifting is needed; simply decrement the size.                               |
| **Remove from beginning**   | O(n)                | All elements must be shifted to the left to fill the gap.                       |
| **Remove from any index**   | O(n)                | Elements after the removal point must be shifted to the left.                   |
| **Search by value**         | O(n)                | In the worst case, the element might be at the end or not present at all.       |
| **Search by index (get)**   | O(1)                | Direct access to the element using the index.                                   |
| **Update by index (set)**   | O(1)                | Direct access to the element using the index.                                   |
| **Contains (check if exists)** | O(n)             | Requires iterating through the list to find the element.                        |
| **Clear**                   | O(n)                | All elements are set to `null`, and the size is reset to 0.                     |
| **Iterator operations**     | O(1) per operation  | `next()` and `hasNext()` are O(1) for each element.                             |

### Notes:

1. **Amortized O(1) for Add to End**:
    - Most of the time, adding to the end is O(1).
    - When the array is full, resizing takes O(n), but this happens infrequently, so the **amortized cost** is O(1).

2. **O(n) for Add/Remove at Beginning or Middle**:
    - These operations require shifting elements, which takes O(n) time in the worst case.

3. **O(1) for Access by Index**:
    - `ArrayList` is backed by an array, so accessing elements by index is a constant-time operation.

4. **O(n) for Search by Value**:
    - Searching for an element by value requires iterating through the list, which takes O(n) in the worst case.

---

### Example Use Cases:

- **Frequent Access by Index**: Use `ArrayList` for O(1) access.
- **Frequent Add/Remove at End**: Use `ArrayList` for amortized O(1) performance.
- **Frequent Add/Remove at Beginning or Middle**: Consider using a `LinkedList` for O(1) add/remove at the beginning and O(n) for the middle.

Code examples:


**Creation of an ArrayList.** 



```java  
    // The creation of an ArrayList with elements added using the 'add' method.
    // Print the list.
    

    public static void main(String[] args) {
        ArrayList<String> friendsArrayList = new ArrayList<>();
        friendsArrayList.add("John");
        friendsArrayList.add("Yanny");
        friendsArrayList.add("Michael");
        friendsArrayList.add("Chenelle");
        System.out.println(friendsArrayList);
    };
```
**To determine the size of an ArrayList**
```java
    // Uses the 'size' method to output the number of elements in the ArrayList

        System.out.println(friendsArrayList.size()); 
```   
**To remove an element from an ArrayList**
```java
    // Uses the 'remove' method to remove an element from the ArrayList
        friendsArrayList.remove("Michael");
        System.out.println(friendsArrayList);
 ```       
**To find the first element of an ArrayList**
``` java
    // Uses the 'get' method to retrive the first element in the ArrayList

        System.out.println(friendArrayList.get(0));  
```
**Looping over each element in an ArrayList**
```java
    // For every element in the ArrayList, print the element
    // The 'name' variable represents a local variable that can used to represent the element of the array

    for (String name : friendsArrayList) {
            System.out.println(name);
        };
```    
**Sort the ArrayList alphabetically**
```java
    
    Collections.sort(friendsArrayList);
```


**Output**:

**Create and print the elements of the ArrayList**.
```java
   
    [John, Yanny, Michael, Chenelle]

```
**Determine the size of the ArrayList.**
```java
    4
```
**Remove an element from the ArrayList and print the list.**
```java
    [John, Yanny, Chenelle]
```
**Loop over each element of the list and print it.**
```java
    John
    Yanny
    Chenelle
```
**Sort the elements in the ArrayList**
```java
    [Chenelle, John, Yanny]

```    
