import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.lang.Double;
import java.time.LocalDate;

public class Main {
  public static void main(String... args) throws ParseException {
    System.out.println("Start tests.");
    testSortSsnAscending();
    testSortSsnDescending();
    testSortDateOfBirthAscending();
    testSortDateOfBirthDescending();
    testSortFirstNameAscending();
    testSortFirstNameDescending();
    testSortLastNameAscending();
    testSortLastNameDescending();
    testSortHeightInAscending();
    testSortHeightInDescending();
    testSortWeightLbAscending();
    testSortWeightLbDescending();
    System.out.println("End tests.");
  }

  static void testSortSsnAscending() {
    final Person person1 = new Person();
    person1.ssn = "123";

    final Person person2 = new Person();
    person2.ssn = "234";

    final Person person3 = new Person();
    person3.ssn = "345";

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "ssn", "true");
    assert sortedPeople.get(0).equals(person1);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person3);
  }

  static void testSortSsnDescending() {
    final Person person1 = new Person();
    person1.ssn = "123";

    final Person person2 = new Person();
    person2.ssn = "234";

    final Person person3 = new Person();
    person3.ssn = "345";

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "ssn", "false");
    assert sortedPeople.get(0).equals(person3);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person1);
  }

  static void testSortDateOfBirthAscending() throws ParseException {
    final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
    final Person person1 = new Person();
    person1.dateOfBirth = dateFormatter.parse("2018-01-01");

    final Person person2 = new Person();
    person2.dateOfBirth = dateFormatter.parse("2018-01-02");

    final Person person3 = new Person();
    person3.dateOfBirth = dateFormatter.parse("2019-01-01");

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "dateOfBirth", "true");
    assert sortedPeople.get(0).equals(person1);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person3);
  }

  static void testSortDateOfBirthDescending() throws ParseException {
    final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
    final Person person1 = new Person();
    person1.dateOfBirth = dateFormatter.parse("2018-01-01");

    final Person person2 = new Person();
    person2.dateOfBirth = dateFormatter.parse("2018-01-02");

    final Person person3 = new Person();
    person3.dateOfBirth = dateFormatter.parse("2019-01-01");

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "dateOfBirth", "false");
    assert sortedPeople.get(0).equals(person3);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person1);
  }

  static void testSortFirstNameAscending() {
    final Person person1 = new Person();
    person1.firstName = "abc";

    final Person person2 = new Person();
    person2.firstName = "bcd";

    final Person person3 = new Person();
    person3.firstName = "cde";

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "firstName", "true");
    assert sortedPeople.get(0).equals(person1);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person3);
  }

  static void testSortFirstNameDescending() {
    final Person person1 = new Person();
    person1.firstName = "abc";

    final Person person2 = new Person();
    person2.firstName = "bcd";

    final Person person3 = new Person();
    person3.firstName = "cde";

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "firstName", "false");
    assert sortedPeople.get(0).equals(person3);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person1);
  }

  static void testSortLastNameAscending() {
    final Person person1 = new Person();
    person1.lastName = "abc";

    final Person person2 = new Person();
    person2.lastName = "bcd";

    final Person person3 = new Person();
    person3.lastName = "cde";

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "lastName", "true");
    assert sortedPeople.get(0).equals(person1);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person3);
  }

  static void testSortLastNameDescending() {
    final Person person1 = new Person();
    person1.lastName = "abc";

    final Person person2 = new Person();
    person2.lastName = "bcd";

    final Person person3 = new Person();
    person3.lastName = "cde";

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "lastName", "false");
    assert sortedPeople.get(0).equals(person3);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person1);
  }

  static void testSortHeightInAscending() {
    final Person person1 = new Person();
    person1.heightIn = 3.1;

    final Person person2 = new Person();
    person2.heightIn = 3.2;

    final Person person3 = new Person();
    person3.heightIn = 4.0;
    
    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "heightIn", "true");
    assert sortedPeople.get(0).equals(person1);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person3);
  }

  static void testSortHeightInDescending() {
    final Person person1 = new Person();
    person1.heightIn = 3.1;

    final Person person2 = new Person();
    person2.heightIn = 3.2;

    final Person person3 = new Person();
    person3.heightIn = 4.0;
    
    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "heightIn", "false");
    assert sortedPeople.get(0).equals(person3);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person1);
  }

  static void testSortWeightLbAscending() {
    final Person person1 = new Person();
    person1.weightLb = 3.1;
    
    final Person person2 = new Person();
    person2.weightLb = 3.2;
    
    final Person person3 = new Person();
    person3.weightLb = 4.0;

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "weightLb", "true");
    assert sortedPeople.get(0).equals(person1);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person3);
  }

  static void testSortWeightLbDescending() {
    final Person person1 = new Person();
    person1.weightLb = 3.1;
    
    final Person person2 = new Person();
    person2.weightLb = 3.2;
    
    final Person person3 = new Person();
    person3.weightLb = 4.0;

    final Iterable<Person> people = Arrays.asList(person3, person1, person2);
    final List<Person> sortedPeople = PeopleSortUtil.sort(people, "weightLb", "false");
    assert sortedPeople.get(0).equals(person3);
    assert sortedPeople.get(1).equals(person2);
    assert sortedPeople.get(2).equals(person1);
  }
}