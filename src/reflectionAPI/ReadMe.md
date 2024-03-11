# Java Reflection API 
Java Reflection provides ability to inspect and modify the runtime behavior of application. Reflection in Java is one of the advance topic of core java. Using java reflection we can inspect a class, interface, enum, get their structure, methods and fields information at runtime even though class is not accessible at compile time. We can also use reflection to instantiate an object, invoke it’s methods, change field values.
Reflection in Java is a very powerful concept and it’s of little use in normal programming but it’s the backbone for most of the Java, J2EE frameworks. Some of the frameworks that use java reflection are:

- JUnit - uses reflection to parse @Test annotation to get the test methods and then invoke it.
- Spring - dependency injection, read more at Spring Dependency Injection
- Tomcat web container to forward the request to correct module by parsing their web.xml files and request URI.
- Eclipse auto-completion of method names
- Struts
- Hibernate

## Get Class Object

We can get Class of an object using three methods - through static variable class, using getClass() method of object and java.lang.Class.forName(String fullyClassifiedClassName). For primitive types and arrays, we can use static variable class. Wrapper classes provide another static variable TYPE to get the class.

### 1. getCanonicalName()
**getCanonicalName()** returns the canonical name of the underlying class. Notice that java.lang.Class uses Generics, it helps frameworks in making sure that the Class retrieved is subclass of framework Base Class.

### 2. getSuperClass()
**getSuperClass()** method on a Class object returns the super class of the class. If this Class represents either the Object class, an interface, a primitive type, or void, then null is returned. If this object represents an array class then the Class object representing the Object class is returned.

### 3. Get Public Members Classes  
**getClasses()** method of a Class representation of object returns an array containing Class objects representing all the public classes, interfaces and enums that are members of the class represented by this Class object. This includes public class and interface members inherited from superclasses and public class and interface members declared by the class. This method returns an array of length 0 if this Class object has no public member classes or interfaces or if this Class object represents a primitive type, an array class, or void.


### 4. Get Declared Classes
**getDeclaredClasses()** method returns an array of Class objects reflecting all the classes and interfaces declared as members of the class represented by this Class object. The returned array doesn’t include classes declared in inherited classes and interfaces.

