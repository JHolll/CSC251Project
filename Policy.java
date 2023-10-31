

public class Policy
{

   static int numPolicy;
      
      private int pNumber;
      private String provider;
      private PolicyHolder policyHolder;
      
   /**
   No-arg constructor that explicitly initializes all fields
   */
   public Policy()
   {
      pNumber = -1;
      provider = "NoName"; 
   }
   
   /**
   constructor that increments the numPolicy count
   */
   public int numPolicy()
   {
      numPolicy++;
      return numPolicy;
   }
   
   /**
      Constructor that accepts arguments for each field
      @param pnumber The Policy number
      @param provider The Policy Provider's Name
   */
   public Policy(PolicyHolder holder, int policyNum, String providerName)
   {
      policyHolder = new PolicyHolder(holder);
      pNumber = policyNum;
      provider = providerName;
   }
   
   public int getNumPolicy()
   {
      return numPolicy;
   }
   
   //getters//
   /**
   @return The Policy Number
   */
   public int getPolicyNumber()
   {
      return pNumber;
   }
   
   /**
   @return The Provider Name
   */
   public String getProviderName()
   {
      return provider;
   }
   
   /**
   @return _
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
   
   
   //setters//
   /**
   @param pNumber The Policy Number
   */
   public void setPolicyNumber(int pNumber)
   {
      numPolicy = pNumber;
   }
   
   /**
   @param provider The Policy Provider's Name
   */
   public void setProviderName(String providerName)
   {
      provider = providerName;
   }
   
   /**
   @param holder A PolicyHolder Object
   */
   public void setPolicyHolder(PolicyHolder holder)
   {
      holder = new PolicyHolder(holder);
   }
   
   //Creates and returns a string description
   public String toString()
   {
      return String.format("Policy Number: " + pNumber + "\nProvider name: " + provider + policyHolder.toString()); 
   }
   
}
      