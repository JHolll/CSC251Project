
public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smoking;
   private double height;
   private double weight;
      
   private double bMI;
   private double price;
    
    /**
   No-arg constructor that explicitly initializes all fields
   */
      public PolicyHolder()
   {
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
      Constructor that accepts arguments for each field
      @param pnumber The Policy number
      @param provider The Policy Provider's Name
      @param firstName The Policyhodler's first name
      @param lastName The Policyholder's last name
      @param age The Policyholder's age
      @param smoking The Policyholder's smoking status
      @param height The Policyholder's height
      @param weight The Policytholder's weight
   */
      public PolicyHolder(String pHFirstName, String pHLastName, int pHAge, String pHSmoking, double pHHeight, double pHWeight)
   {
      firstName = pHFirstName;
      lastName = pHLastName;
      age = pHAge;
      smoking = pHSmoking;
      height = pHHeight;
      weight = pHWeight;
      
   } 
   
   public PolicyHolder(PolicyHolder object2)
   {
      firstName = object2.firstName;
      lastName = object2.lastName;
      age = object2.age;
      smoking = object2.smoking;
      height = object2.height;
      weight = object2.weight;
   }
   
   //getters//  
   /**
   @return The Policyholder's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
   @return The Policyholder's last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   @return The Policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   @return The Policyholder's smoking status
   */
   public String getSmoking()
   {
      return smoking;
   }
   
   /**
   @return The Policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   @return The Policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   //setters//
   /**
   @param firstName The Policyholder's first name 
   */
   public void setFirstName(String pHFirstName)
   {
      firstName = pHFirstName;
   }
   
   /**
   @param lastName The Policyholder's last name 
   */
   public void setLastName(String pHLastName)
   {
      lastName = pHLastName;
   }
   
   /**
   @param age The Policyholder's Age 
   */
   public void setAge(int pHAge)
   {
      age = pHAge;
   }
   
   /**
   @param smoking The Policyholder's Smoking Status
   */
   public void setSmoking(String pHSmoking)
   {
      smoking = pHSmoking;
   }
   
   /**
   @param smoking The Policyholder's Height
   */
   public void setHeight(double pHHeight)
   {
      height = pHHeight;
   }
   
   /**
   @param smoking The Policyholder's Weight
   */
   public void setWeight(double pHWeight)
   {
      weight = pHWeight;
   }
   
   /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double GetBMI()
   {
      bMI = (weight * 703) / (height * height);
      return bMI;
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
      return String.format("\nPolicyholder's First Name: " + firstName
      + "\nPolicyholde'’s Last Name: " + lastName + "\nPolicyholder's Age: " + age + "\nPolicyholder's Smoking Status: " + smoking
      + "\nPolicyholder's Height: " + height + "\nPolicyholder's Weight: " + String.format("%.2f",GetBMI()) + "\nPolicy Price: $" + String.format("%.2f",GetPrice()));
   }
}