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
      
      PolicyHolder policyHolder = new PolicyHolder(pHFirstName, pHLastName, pHAge, pHSmoking, pHHeight, pHWeight);
      
      Policy policy = new Policy(policyHolder, policyNum, providerName);
      
      policyList.add(policy);
      
      }
      
      for(int i=0; i < policyList.size(); i++)
      {
         System.out.println(policyList.get(i));
         System.out.println();
      }
      
      //System.out.println("There were " + numPolicy + "Policy objects created" + "The number of policies with a smoker is: " + numSmokers + "\nThe number of policies with a non-smoker is: " + numNonSmokers);
            
    } 
       
}