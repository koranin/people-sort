import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleSortUtil {
  /**
   * Returns sorted List<Person> from Iterable<Person>.
   */
  public static List<Person> sort(final Iterable<Person> people, final String sortField,
      final String ascending) {
    final List<Person> personList = buildPersonList(people);
    final PersonComparator personComparator =
      new PersonComparator(sortField, Boolean.parseBoolean(ascending));
    Collections.sort(personList, personComparator);
    return personList;
  }

  /**
   * Returns a new List<Person> from a given Iterable<Person>.
   */
  private static List<Person> buildPersonList(final Iterable<Person> personIterable) {
    final List<Person> personList = new ArrayList<>();
    personIterable.forEach(personList::add);
    return personList;
  }
}
