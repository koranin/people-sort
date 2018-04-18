# Sort People List 

Using standard java libraries to implement `sort` method.

```java
static List<Person> sort(Iterable<Person> people, String sortField, String ascending) {
    //TODO: implement sort 
}

class Person{
  String ssn;
  Date dateOfBirth;
  String firstName;
  String lastName;
  Double heightIn;
  Double weightLb;
}
```

## Build

```
javac -d out src/*.java
```

## Run Tests

```
java -ea -cp ./out Main
```

## Design Considurations

I've decide to use `java.util.Collections.sort()` to handle Person list sorting for maintainability.  By decoupling sorting algorithm from the collection object, we can change collection object without changing sorting algorithm, and vise versa.

## Trade-offs

See these links.

https://stackoverflow.com/questions/25492648/what-is-the-time-complexity-of-collectionssort-method-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa

https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort%28java.util.List,%20java.util.Comparator%29 