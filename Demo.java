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
      String pHSmoking = "d";
      double pHHeight = 0;
      double pHWeight = 0;
      
      int run = 0;
      
      
      while(run != 6) 
      {
      
      //System.out.println("Please enter the Policy Number: ");
      policyNum = scnr.nextInt();
      scnr.nextLine();
      //System.out.println("Please enter the Provider Name: ");
      providerName = scnr.nextLine();
      //System.out.println("Please enter the Policyholder's First Name: ");
      pHFirstName = scnr.nextLine();
      //System.out.println("Please enter the Policyholder's Last Name: ");
      pHLastName = scnr.nextLine();
      //System.out.println("Please enter the Policyholder's Age: ");
      pHAge = scnr.nextInt();
      scnr.nextLine();
      //System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      pHSmoking = scnr.nextLine();      
      //System.out.println("Please enter the Policyholder's Height (in inches): ");
      pHHeight = scnr.nextDouble();
      //System.out.println("Please enter the Policyholder's Weight (in pounds): ");
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
      
      
            
    } 
       
}