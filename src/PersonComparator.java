import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.List;
import java.lang.Double;
import java.time.LocalDate;

public class PersonComparator implements Comparator<Person> {
  private final String sortField;
  private final Boolean ascending;
  
  public PersonComparator(final String sortField, final Boolean ascending) {
    this.sortField = sortField;
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
      default:
        return 0;
    }
  }

  /**
   * Compares its two string arugments for order.
   */
  private int compare(final String firstString, final String secondString) {
    return compareWithOrder(firstString, secondString, PersonComparator::compareStrings);
  }

  /**
   * Compare its two date arguments for order.
   */
  public int compare(final Date firstDate, final Date secondDate) {
    return compareWithOrder(firstDate, secondDate, PersonComparator::compareDates);
  }

  /**
   * Compare its two double arguments for order.
   */
  private int compare(final Double firstDouble, final Double secondDouble) {
    return compareWithOrder(firstDouble, secondDouble, PersonComparator::compareDoubles);
  }

  /**
   * Compares its two arguments with either ascending or descending order.
   */
  private <T> int compareWithOrder(final T firstValue, final T secondValue, final Comparator<T> comparator) {
    return ascending ? comparator.compare(firstValue, secondValue) : comparator.compare(secondValue, firstValue);
  }

  /**
   * Compare two strings.
   */
  private static int compareStrings(final String firstString, final String secondString) {
    return firstString.compareTo(secondString);
  }

  /**
   * Compare two dates.
   */
  private static int compareDates(final Date firstDate, final Date secondDate) {
    final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd");
    final String firstDateString = dateFormatter.format(firstDate);
    final String secondDateString = dateFormatter.format(secondDate);
    return compareStrings(firstDateString, secondDateString);
  }

  /**
   * Compare two doubles.
   */
  private static int compareDoubles(final Double firstDouble, final Double secondDouble) {
    return Double.compare(firstDouble, secondDouble);
  }
}