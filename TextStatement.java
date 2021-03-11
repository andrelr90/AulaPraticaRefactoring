import java.util.Enumeration;

public class TextStatement extends Statement {
    public String getCustomerName(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String getMovie(Rental each){
        return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    public String getCharge(Customer aCustomer){
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String getTotalFrequentRenterPoints(Customer aCustomer){
        return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}
