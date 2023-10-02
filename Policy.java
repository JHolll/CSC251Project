

public class Policy
{
            
      private int pNumber;
      private String provider;
      private String firstName;
      private String lastName;
      private int age;
      private String smoking;
      private double height;
      private double weight;
      
      private double bMI;
      
      private double price;
      
      public Policy()
   {
      pNumber = -1;
      provider = "NoName";
      firstName = "NoName";
      lastName = "NoName";
      age = -1;
      smoking = "Unknown";
      height = -1;
      weight = -1;
      bMI = -1;
      price = -1;
   }
   /**
      @param pnumber policy number
      @param provider provider name
      @param firstName user's first name
      @param lastName user's last name
      @param age user's age
      @param smoking if the user smokes
      @param height user's height
      @param weight user's weight
   */
      public Policy(int policyNum, String providerName, String pHFirstName, String pHLastName, int pHAge, String pHSmoking, double pHHeight, double pHWeight)
   {
      pNumber = policyNum;
      provider = providerName;
      firstName = pHFirstName;
      lastName = pHLastName;
      age = pHAge;
      smoking = pHSmoking;
      height = pHHeight;
      weight = pHWeight;
   }
   
   /**
      @return policy number
   */
   public int setPolicyNumber()
   {
      return pNumber;
   }
   
   /**
      @return provider name
   */
   public String setProviderName()
   {
      return provider;
   }
   
   /**
      @return the user's first name
   */
   public String setPHFirstName()
   {
      return firstName;
   }
   
   /**
      @return the user's last name
   */
   public String setPHLastName()
   {
      return lastName;
   }
   
   /**
      @return the user's age
   */
   public int setPHAge()
   {
      return age;
   }
   
   /**
      @return whether the user smokes
   */
   public String setPHSmoking()
   {
      return smoking;
   }
   
   /**
      @return the user's height
   */
   public double setPHHeight()
   {
      return height;
   }
   
   /**
      @return the user's weight
   */
   public double setPHWeight()
   {
      return weight;
   }
   
   /**
      @param bMI users BMI
      @return the user's BMI
   */
   public double GetBMI()
   {
      bMI = (weight * 703) / (height * height);
      return bMI;
   }
   /**
   
   @param price 
   @return the price of the policy
   */
   public double GetPrice()
   {
      price = 600;
      if (age > 50)
      {
         price = price + 75;
      }
      if (smoking == "smoker")
      {
         price = price + 100;
      }
      if (bMI > 35)
      {
         price = price + (bMI-35) * 20;
      }
      return price;
   }
   
}
      