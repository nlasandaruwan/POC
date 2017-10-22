package coreservlets;

public class BookUtils {
  /** Converts a double to a String that shows dollars. This could also
   *  be done in the JSF facelets pages with the f:convertNumber tag,
   *  but the approach here makes for simpler code. But, in a localized app
   *  where the currency symbols might change, the approach with
   *  f:convertNumber would be preferable. Similarly, if the page author
   *  would ever want to control the number of decimal places shown, the
   *  f:convertNumber approach would be better. But, neither case applies here,
   *  and simpler facelets code is preferable.
   */
  public static String toDollars(double amount) {
    return(String.format("$%,.2f", amount));
  }
  
  /** Returns the first special of the day. Values are hard coded here,
   *  but in a real app they would come from database or other data source.
   */
  public static DailyBookSpecial special1() {
    return(new DailyBookSpecial("Core JavaServer Faces", 199.95));
  }
  
  /** Returns the second special of the day. Again, values are hard coded here,
   *  but in a real app they would come from database or other data source.
   */
  public static DailyBookSpecial special2() {
    return(new DailyBookSpecial("Core COBOL", 0.05));
  }
  
  private BookUtils() {} // Uninstantiatable class; static methods only.
}
