
public class PolicyHolder
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
    
    /**
   No-arg constructor that explicitly initializes all fields
   */
      public PolicyHolder()
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
      public PolicyHolder(int policyNum, String providerName, String pHFirstName, String pHLastName, int pHAge, String pHSmoking, double pHHeight, double pHWeight)
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
   
   //getters//
   /**
   @return The Policy Number
   */
   public int setPolicyNumber()
   {
      return pNumber;
   }
   
   /**
   @return The Policy Provider's Name
   */
   public String setProviderName()
   {
      return provider;
   }
   
   /**
   @return The Policyholder's first name
   */
   public String setPHFirstName()
   {
      return firstName;
   }
   
   /**
   @return The Policyholder's last name
   */
   public String setPHLastName()
   {
      return lastName;
   }
   
   /**
   @return The Policyholder's age
   */
   public int setPHAge()
   {
      return age;
   }
   
   /**
   @return The Policyholder's smoking status
   */
   public String setPHSmoking()
   {
      return smoking;
   }
   
   /**
   @return The Policyholder's height
   */
   public double setPHHeight()
   {
      return height;
   }
   
   /**
   @return The Policyholder's weight
   */
   public double setPHWeight()
   {
      return weight;
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

   //Creates and returns a string description
   public String toString()
   {
      String hStr = "Policy Number: " + pNumber + "\nProvider name: " + provider + "\nPolicyholder's First Name: " + firstName
      + "\nPolicyholde'�s Last Name: " + lastName + "\nPolicyholder's Age: " + age + "\nPolicyholder's Smoking Status: " + smoking
      + "\nPolicyholder's Height: " + height + "Policyholder's Weight: " + bMI);
      
      return str;
   }
}