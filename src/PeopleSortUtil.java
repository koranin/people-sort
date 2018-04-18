import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;
import java.util.List;

public class PeopleSortUtil {
  /**
   * Returns sorted List<Person> from Iterable<Person>.
   */
  public static List<Person> sort(final Iterable<Person> people, final String sortField,
      final String ascending) {
    return buildPersonList(people);
  }

  /**
   * Returns a new List<Person> from a given Iterable<Person>.
   */
  private static List<Person> buildPersonList(final Iterable<Person> personIterable) {
    final List<Person> personList = new ArrayList<>();
    personIterable.forEach(personList::add);
    return personList;
  }

  private static Boolean isAscending(final String ascending) {
    return Boolean.parseBoolean(ascending);
  }

  private static Comparator<String> getStringComparator(final Boolean isAscending) {
    return (a, b) -> isAscending ? compareString(a, b) : compareString(b, a);
  }

  private static int compareString(final String a, final String b) {
    // TODO: implement here
    return 0;
  }
 
  public static Comparator<Date> getDateComparator(final Boolean isAscending) {
    return (a, b) -> isAscending ? compareDate(a, b) : compareDate(b, a);
  }
  
  private static int compareDate(final Date a, final Date b) {
    // TODO: implement here
    return 0;
  }
 
  private static Comparator<Double> getDoubleComparator(final Boolean isAscending) {
    return (a, b) -> isAscending ? compareDouble(a, b) : compareDouble(b, a);
  }

  private static int compareDouble(final Double a, final Double b) {
    // TODO: implement here
    return 0;
  }
}

