// Feel free to add here any import statements that you need for your tests

/**
   Use the main() method in this class to test your other classes. 
   We provide you with minimalist tests to get you started. 
   Feel free to modify them or add as many as you need.
   This part of your code will not be graded but will help
   you ensure that your other classes fullfill the requirements.
**/
public class Driver{
   public static void main(String[] args){
   
      HelpDeskTicket t1,t2,t3,t4,t5;
      t1 = new HelpDeskTicket(); 
      t2 = new HelpDeskTicketWithPriority("Important User"); 
      t2.assignTo("Dedicated Techsupport"); 
      t3 = new HelpDeskTicketWithPriority("Concerned User", "There is smoke everywhere and the screensaver's flames look pretty real!", 9); 
      t3.assignTo("Maurice Moss");
      t3.resolve("Use made-in-Britain fire extinguisher.");
      t4 = new HelpDeskTicket("lifetime learner", "OMG! Help! I cannot find this exam on schlegg.com!");
      t4.assignTo("Hans Tructor");
      t4.resolve("Use office hours to get help on practice exercises.");
      t4.provideFeedback(0);
      t5 = new HelpDeskTicket(); 
      
      PrioritizedHelpDeskTicketsList tickets = new PrioritizedHelpDeskTicketsList();
      tickets.add(t1);
      tickets.add(t2);
      tickets.add(t3);
      tickets.add(t4);
      tickets.add(t5);
      
      System.out.println(tickets);
   }// end main
}// end class