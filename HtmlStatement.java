import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String getCustomerName(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    public String getMovie(Rental each){
        return each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public String getCharge(Customer aCustomer){
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    public String getTotalFrequentRenterPoints(Customer aCustomer){
        return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
    }

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
