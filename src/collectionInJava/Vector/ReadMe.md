# Vector Class
1. Introduced In Java Version 1.0 
2. **Vector** implements a dynamic array which means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index.
3. It is similar to **ArrayList**. 
4. Vector is **synchronized** and has some legacy methods that the collection framework does not contain. 
5. It also maintains an insertion order like an ArrayList. Still, it is rarely used in a non-thread environment as it is synchronized, and due to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
6. The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
7. It extends AbstractList and implements List interfaces.
8. It implements Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess interfaces.
9. The directly known subclass is Stack.

### Important points regarding the Increment of vector capacity are as follows:
1. If the increment is specified, Vector will expand according to it in each allocation cycle. Still, if the increment is not specified, then the vector’s capacity gets doubled in each allocation cycle. Vector defines three protected data members:
- int capacityIncreament: Contains the increment value.
- int elementCount: Number of elements currently in vector stored in it.
- Object elementData[]: Array that holds the vector is stored in it.

