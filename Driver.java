/**
   The purpose of this class is run the whole project,
   making use of all the other classes.
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
