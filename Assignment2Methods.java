//’σκηση 2
//Μετατροπή Αγγλικών λιρών σε ευρώ και καταγραφή μέσων όρων
//Μέθοδοι κύριας κλάσης
//Assignment2Methods.java

import java.util.Scanner;

public class Assignment2Methods{

    Scanner input = new Scanner(System.in);
    
    //Μεταβλητές
    private double euros; //ευρώ
    private double pounds; //αγγλικές λίρες
    private double exchangeRate; //ισοτιμία λίρας σε ευρώ
    private double eurosAverage; //μέσος όρος ευρώ
    private double poundsAverage; //μέσος όρος λιρών
    private double counter; //μέγεθος εισόδων τιμών
    
    //Αρχικοποίηση μεταβλητών
    public Assignment2Methods(){
    
      euros = 0;
      pounds = 0;
      exchangeRate = 1.17853;
      eurosAverage = 0;
      poundsAverage = 0;
      counter = 0;  
    
    }//τέλος constructor
    
    //Μετατροπή Αγγλικών λιρών σε ευρώ
    public void poundConverter(){
    
      while(pounds !=-1){
      
         System.out.print("Please enter a value or -1 to terminate the program: ");
         pounds = input.nextDouble();
         
         if(pounds>0){
                    
            euros = pounds * exchangeRate;
            eurosAverage+= euros;
            poundsAverage+=pounds;
            counter++;
            System.out.println(+pounds+ " pounds is " +euros+ " euros.");
            
         }else if (pounds<0 && pounds !=-1){
         
            System.out.println("You have entered an invalid value. Try again.");
            System.out.println("");
         
         }//τέλος if
                                 
      }//τέλος while
    
   }//τέλος μεθόδου poundConverter
   
   //Υπολογισμός μέσων όρων λιρών και ευρώ
   public void averageCalculator(){
   
      eurosAverage /=counter;
      poundsAverage /=counter;
      System.out.println("");
      System.out.println("Your average in pounds is: " +poundsAverage);
      System.out.println("Your average in euros is: " +eurosAverage);
   
   }//τέλος μεθόδου averageCalculator
       
}//τέλος κλάσης Assignment2Methods