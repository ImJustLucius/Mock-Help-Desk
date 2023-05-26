// Feel free to add here any import statements that you need
import java.util.Date;


/**
   This class models information we keep about a help desk ticket.
**/
public class HelpDeskTicketWithPriority extends HelpDeskTicket {
   
   private int priority;


   /*      
      The priority passed as parameter should be in the range
      [1:9] inclusive. If the value is outside this range,
      it is considered a 1 (the lowest priority).
   */
   public HelpDeskTicketWithPriority(String requestedBy, String description, int priority){
      super(requestedBy,description);
      this.priority = (priority>=1 && priority<=9) ? priority : 1;
   }// end constructor


   /*
      This 1-arg constructor chains with the 3-args one.
      It passes the requestedBy name that is provided as parameter,
      "No ticket description, call user directly" as the description,
       and 9 as the priority. 
   */
   public HelpDeskTicketWithPriority(String requestedBy){
      this(requestedBy, "No ticket description, call user directly", 9);
   }// end constructor
   
   
   
   
   /*
      This 0-arg constructor chains with the 3-args constructor.
      It passes "Justin Testicket" as the name of the requester,
      "Testing ticket, please ignore." as the description,
      and 1 as the priority.
   */
   public HelpDeskTicketWithPriority(){
      this("Justin Testicket", "Testing ticket, please ignore.", 1);
   }// end constructor




   public int getPriority(){
      return this.priority;
   }
   
   
   /*
      The code for the following method returns a String
      representing the information stored in the attributes.
      It adds a line specifying the priority of this
      ticket at the end of the usual description, and uses
      the same overall format.
      
      Example: ticket that has not yet been assigned nor closed. 
            Description:   OMG! Help! I cannot find this exam on schlegg.com!
            Requested by:  lifetime learner
            Date opened:   Fri Oct 28 08:03:09 EDT 2022  
            Priority:      1
   */
   public String toString(){
      String result = super.toString();
      result += "\tPriority:\t" + priority +"\n";      
      return result;
   }// end toString method

}// end class
