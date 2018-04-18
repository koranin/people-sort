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
    switch (sortField) {
      case "ssn": 
        return compare(firstPerson.ssn, secondPerson.ssn);
      case "dateOfBirth":
        return compare(firstPerson.dateOfBirth, secondPerson.dateOfBirth);
      case "firstName":
        return compare(firstPerson.firstName, secondPerson.firstName);
      case "lastName":
        return compare(firstPerson.lastName, secondPerson.lastName);
      case "heightIn":
        return compare(firstPerson.heightIn, secondPerson.heightIn);
      case "weightLb":
        return compare(firstPerson.weightLb, secondPerson.weightLb);
    }
  }

  /**
   * Compares its two string arugments for order.
   */
  private int compare(final String firstvalue, final String secondValue) {
    return ascending ? compare(firstvalue, secondValue) : compare(secondValue, firstValue)
  }

  /**
   * Compare two strings.
   */
  private static int compare(final String firstValue, final String secondValue) {
    // TODO: implement here
    return 0;
  }

  /**
   * Compare its two date arguments for order.
   */
  public static int compare(final Date firstDate, final Date secondDate) {
    return ascending ? compare(firstDate, secondDate) : compare(secondDate, firstDate);
  }

  /**
   * Compare two dates.
   */
  private static int compare(final Date a, final Date b) {
    // TODO: implement here
    return 0;
  }

  /**
   * Compare its two double arguments for order.
   */
  private static int compare(final Double firstDouble, final Double secondDouble) {
    return isAscending ? compare(a, b) : compare(b, a);
  }

  /**
   * Compare two doubles.
   */
  private static int compare(final Double a, final Double b) {
    // TODO: implement here
    return 0;
  }
}