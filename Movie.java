public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private int _priceCode;

   public double getCharge(int daysRented){
       double thisAmount = 0;
       switch (this.getPriceCode()) {
          case Movie.REGULAR:
             thisAmount += 2;
             if (daysRented > 2)
                thisAmount += (daysRented - 2) * 1.5;
             break;
          case Movie.NEW_RELEASE:
             thisAmount += daysRented * 3;
             break;
          case Movie.CHILDRENS:
             thisAmount += 1.5;
             if (daysRented > 3)
                thisAmount += (daysRented - 3) * 1.5;
              break;
       }
       return thisAmount;
   }

   public int getFrequentRenterPoints(int daysRented){
       if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented <= 1)
          return 1;
       // add bonus for a two day new release rental
       else
          return 2;
   }

  public Movie(String title, int priceCode) {
      _title = title;
      _priceCode = priceCode;
  }

  public int getPriceCode() {
      return _priceCode;
  }

  public void setPriceCode(int arg) {
      _priceCode = arg;
  }

  public String getTitle (){
      return _title;
  }
}
