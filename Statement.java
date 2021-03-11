import java.util.Enumeration;
public abstract class Statement {
    public abstract String getCustomerName(Customer aCustomer);
    public abstract String getMovie(Rental each);
    public abstract String getCharge(Customer aCustomer);
    public abstract String getTotalFrequentRenterPoints(Customer aCustomer);

    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = this.getCustomerName(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += this.getMovie(each);
      }
      //add footer lines
      result += this.getCharge(aCustomer);
      result += this.getTotalFrequentRenterPoints(aCustomer);
      return result;
   }
}
