ArrayLists

Before we explore ArrayLists it could be helpful to talk about Arrays.
Both Arrays and ArrayLists are part of the Collections framework in Java and store the same types of objects or data types in a collection.  
The key differences with Arrays is that it an immutable list, and it supports both primitives and objects.


An ArrayList is a Class used to store collections of objects only but can support primitives by using wrapper types e.g. int[] --primitive is not supported. 
However, Integer[] is supported (note the difference being that the name of the primitive is capitalised and uses the full name 'Integer').
They are mutable arrays used to store a collection of objects/data types of the same type.  They offer the functionality of adding elements and is best used when the size of the array is unknown.
The size of an ArrayList is not set and can grow and shrink automatically (dynamically) which is useful for when the exact number elements are likely to change. 


Time complexity is the measurement of how much time an algorithm is required to execute.  For example, if in the case of searching for an element at the end of an Arraylist would take much less time complexity than searching for an element in the middle of the list.
In an ArrayList, to search for an element depends on the length of the array.  Therefore, the time complexity of an ArrayList is known as O(n)-with 'n' representing the length of the list and 'O' representing the order of the function.

Code examples:


Creation of an ArrayList.  
    
    // The creation of an ArrayList with elements added using the 'add' method.
    // Print the list.
    
    public static void main(String[] args) {
        ArrayList<String> friendsArrayList = new ArrayList<>();
            friendsArrayList.add("John");
            friendsArrayList.add("Yanny");
            friendsArrayList.add("Michael");
            friendsArrayList.add("Chenelle");
            System.out.println(friendsArrayList);

    // To determine the size of an ArrayList
    // Uses the 'size' method to output the number of elements in the ArrayList

        System.out.println(friendsArrayList.size()); 
    
    // To remove an element from an ArrayList
    // Uses the 'remove' method to remove an element from the ArrayList
        friendsArrayList.remove("Michael");
        System.out.println(friendsArrayList)

    // To find the first element of an ArrayList
    // Uses the 'get' method to retrive the first element in the ArrayList

        System.out.println(friendArrayList.get(0);  

    // Looping over each element in an ArrayList
    // For every element in the ArrayList, print the element
    // The 'name' variable represents a local variable that can used to represent the element of the array

    for (String name : friendsArrayList) {
            System.out.println(name);
        }
    
    // Sort the ArrayList aplhabetically
    
    Collections.sort(friendsArrayList);



Output:

    // Create and print the elements of the ArrayList
    [John, Yanny, Michael, Chenelle]


    // Determine the size of the ArrayList.
    4

    // Remove an element from the ArrayList and print the list.
    [John, Yanny, Chenelle]

    // Loop over each element of the list and print it.
    John
    Yanny
    Chenelle

    // Sort the elements in the ArrayList
    [Chenelle, John, Yanny]

    
