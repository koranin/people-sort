import java.util.Date;
import java.util.Comparator;
import java.util.List;

public class PersonComparator implements Comparator<Person> {
  private final String compareField;
  private final Boolean ascending;
  
  public PersonComparator(final String compareField, final Boolean ascending) {
    this.compareField = compareField;
    this.ascending = ascending;
  }
  
  @Override
  public int compare(final Person firstPerson, final Person secondPerson) {
    return 0;
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