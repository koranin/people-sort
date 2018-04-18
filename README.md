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


## Trade-offs