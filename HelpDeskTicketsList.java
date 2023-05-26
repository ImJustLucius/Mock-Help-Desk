// Feel free to add here any import statements that you need
import java.util.ArrayList;

/** 
   This class models information about a list of helpdesk tickets
   and provides a few useful methods to manage them.
**/
public class HelpDeskTicketsList {


   /**
      This entire class extends the appropriate ArrayList
      class instead of using it by composition.
   **/
   protected ArrayList<HelpDeskTicket> list;
   
   
   public HelpDeskTicketsList(){
     list = new ArrayList<HelpDeskTicket>();
   }
   
   
   public void add(HelpDeskTicket t){
      if(t != null) list.add(t);
   }
   
     
   public double computeCompletionRate(){
      int numberClosedTickets = 0; 
      for(HelpDeskTicket t: list)
         if(t.isClosed()) numberClosedTickets++;
      return (100.0 * numberClosedTickets) / list.size();
   }


   public String toString(){
      String result = "HELP DESK TICKETS LIST (" + computeCompletionRate() + "% complete):\n";
      int counter = 1; 
      for(HelpDeskTicket t: list)
         result += "---------- Ticket #" + counter++ + "\n" + t.toString() + "\n";
      return result;
   }  
}// end class