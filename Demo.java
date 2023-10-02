import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Demo 
{
       public static void main(String[] args) throws IOException
    {
    
      File file = new File("PolicyInformation.txt");
      Scanner scnr = new Scanner(file);
      
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      Policy policy;

      int policyNum = 0;
      String providerName = "a";
      String pHFirstName = "b";
      String pHLastName = "c";
      int pHAge = 0;
      String pHSmoking = "a";
      double pHHeight = 0;
      double pHWeight = 0;
      
      int run = 0;
      
      int numSmokers = 0;
      int numNonSmokers = 0;
      
      while(run != 6) 
      {
      
      policyNum = scnr.nextInt();
      scnr.nextLine();
      providerName = scnr.nextLine();
      pHFirstName = scnr.nextLine();
      pHLastName = scnr.nextLine();
      pHAge = scnr.nextInt();
      scnr.nextLine();
      
      pHSmoking = "a";
      
      pHSmoking = scnr.nextLine();      
      if(pHSmoking.equals("smoker"))
      {
         numSmokers++;
      }
      else if(pHSmoking.equals("non-smoker"))
      {
         numNonSmokers++;
      }
      pHHeight = scnr.nextDouble();
      pHWeight = scnr.nextDouble();
      
      run++;
      
      policyList.add(new Policy(policyNum, providerName, pHFirstName, pHLastName, pHAge, pHSmoking, pHHeight, pHWeight));
      }
      
      for(int i = 0; i < policyList.size(); i++)
      {
      policy = new Policy(policyNum, providerName, pHFirstName, pHLastName, pHAge, pHSmoking, pHHeight, pHWeight);
      
      System.out.println("Policy Number: " + policyNum + "\nProvider name: " + providerName + "\nPolicyholder's First Name: " + pHFirstName
      + "\nPolicyholde'’s Last Name: " + pHLastName + "\nPolicyholder's Age: " + pHAge + "\nPolicyholder's Smoking Status: " + pHSmoking
      + "\nPolicyholder's Height: " + pHHeight);
      System.out.println("Policyholder's Weight: " + String.format("%.2f", policy.GetBMI()) + "\nPolicy Price: " + String.format("%.2f", policy.GetPrice()) + "\n");
      }
      
      System.out.println("The number of policies with a smoker is: " + numSmokers + "\nThe number of policies with a non-smoker is: " + numNonSmokers);
            
    } 
       
}