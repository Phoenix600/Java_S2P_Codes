# Set Interface 
* A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.
* The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.
* Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation types differ. Two Set instances are equal if they contain the same elements.
* The Java platform contains three general-purpose Set implementations: **HashSet**, **TreeSet**, and **LinkedHashSet**.
* **HashSet**, which stores its elements in a hash table, is the best-performing implementation; however it makes no guarantees concerning the order of iteration. 
*  **TreeSet**, which stores its elements in a **red-black tree**, orders its elements based on their values; it is substantially slower than HashSet.
*  **LinkedHashSet**, which is implemented as a hash table with a linked list running through it, orders its elements based on the order in which they were inserted into the set (insertion-order).
