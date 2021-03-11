public class Rental {

   private Movie _movie;
   private int _daysRented;

   public int getFrequentRenterPoints() {
       //Adicionar o trecho de código extraído.
       if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() <= 1)
          return 1;
       // add bonus for a two day new release rental
       else
          return 2;
   }

   public double getCharge() {
      double thisAmount = 0;
      switch (this.getMovie().getPriceCode()) {
         case Movie.REGULAR:
            thisAmount += 2;
            if (this.getDaysRented() > 2)
               thisAmount += (this.getDaysRented() - 2) * 1.5;
            break;
         case Movie.NEW_RELEASE:
            thisAmount += this.getDaysRented() * 3;
            break;
         case Movie.CHILDRENS:
            thisAmount += 1.5;
            if (this.getDaysRented() > 3)
               thisAmount += (this.getDaysRented() - 3) * 1.5;
             break;
      }
      return thisAmount;
   }

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
}
