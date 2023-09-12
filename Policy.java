

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
   
      
   public int setPolicyNumber()
   {
      return pNumber;
   }
   
   public String setProviderName()
   {
      return provider;
   }
   
   public String setPHFirstName()
   {
      return firstName;
   }
   
   public String setPHLastName()
   {
      return lastName;
   }

   public int setPHAge()
   {
      return age;
   }

   public String setPHSmoking()
   {
      return smoking;
   }
   
   public double setPHHeight()
   {
      return height;
   }
   
   public double setPHWeight()
   {
      return weight;
   }
   
   public double GetBMI()
   {
      bMI = (weight * 703) / (height * height);
      return bMI;
   }
   
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
      