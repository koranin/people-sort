import java.util.ArrayList;
import java.util.List;

public class PeopleSortUtil {
  public static List<Person> sort(final Iterable<Person> people, final String sortField,
      final String ascending) {
    return buildPersonList(people);
  }

  private static List<Person> buildPersonList(final Iterable<Person> personIterable) {
    final List<Person> personList = new ArrayList<>();
    personIterable.forEach(personList::add);
    return personList;
  }
}
