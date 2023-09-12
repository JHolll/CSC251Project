import java.util.Scanner;

public class Project_jack_holliday 
{
       public static void main(String[] args)
    {
      Scanner scnr = new Scanner(System.in);
      
      Policy policy;

      int policyNum;
      String providerName;
      String pHFirstName;
      String pHLastName;
      int pHAge;
      String pHSmoking;
      double pHHeight;
      double pHWeight;
      
      System.out.println("Please enter the Policy Number: ");
      policyNum = scnr.nextInt();
      scnr.nextLine();
      System.out.println("Please enter the Provider Name: ");
      providerName = scnr.nextLine();
      System.out.println("Please enter the Policyholder's First Name: ");
      pHFirstName = scnr.nextLine();
      System.out.println("Please enter the Policyholder's Last Name: ");
      pHLastName = scnr.nextLine();
      System.out.println("Please enter the Policyholder's Age: ");
      pHAge = scnr.nextInt();
      scnr.nextLine();
      System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      pHSmoking = scnr.nextLine();
      System.out.println("Please enter the Policyholder's Height (in inches): ");
      pHHeight = scnr.nextDouble();
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      pHWeight = scnr.nextDouble();
      
      policy = new Policy(policyNum, providerName, pHFirstName, pHLastName, pHAge, pHSmoking, pHHeight, pHWeight);
      //policy.GetBMI();
      //policy.GetPrice();
      
      System.out.println("Policy Number: " + policyNum + "\nProvider name: " + providerName + "\nPolicyholder's First Name: " + pHFirstName
      + "\nPolicyholde'’s Last Name: " + pHLastName + "\nPolicyholder's Age: " + pHAge + "\nPolicyholder's Smoking Status: " + pHSmoking
      + "\nPolicyholder's Height: " + pHHeight);
      System.out.println("Policyholder's Weight: " + String.format("%.2f", policy.GetBMI()) + "\nPolicy Price: " + String.format("%.2f", policy.GetPrice()));
      
    }
       
}