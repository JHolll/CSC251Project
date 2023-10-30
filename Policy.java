

public class Policy
{
      
      private double price;
      
   /**
   No-arg constructor that explicitly initializes all fields
   */
      public Policy()
   {
      
      price = -1;
   }
   
   /**
   Calculates the Policy's price
   @return The price of the Policy
   */
   public double GetPrice()
   {
      price = 600;
      if (age > 50)
      {
         price = price + 75;
      }
      if (smoking.equals("smoker"))
      {
         price = price + 100;
      }
      if (bMI > 35)
      {
         price = price + (bMI-35) * 20;
      }
      return price;
   }
   
   //Creates and returns a string description
   public String toString()
   {
      String str = "\nPolicy Price: " + price;
      
      return pStr;
   }
   
}
      