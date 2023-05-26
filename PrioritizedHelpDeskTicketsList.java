// Feel free to add here any import statements that you need
import java.util.ArrayList;

/** 
   This class models information about a list of prioritized helpdesk tickets
   and provides a few useful methods to manage them.
**/
public class PrioritizedHelpDeskTicketsList 
   extends HelpDeskTicketsList{   
   
   
   /*
      This method returns the percentage of completed tickets:
      = 100.0 * (sum of closed tickets' priorities / sum of all tickets' priorities)
      The priority for a HelpDeskTicket is assumed to be 1 since these
      do not have a priority attribute.
      The value returned has, at maximum, two decimal digits of precision.
      E.g., if it is computed that the result 
      is 76.92307692307692 it will return 76.92.
   */
   public double computeCompletionRate(){
      int pTotal = 0;
      int pComplete = 0;
      for (HelpDeskTicket t : list) {
         if(t instanceof HelpDeskTicketWithPriority){   
            HelpDeskTicketWithPriority p = (HelpDeskTicketWithPriority) t;
            if(p.isClosed()) pComplete += p.getPriority();
            pTotal += p.getPriority();      
         }
         else{
            if(t.isClosed()) pComplete += 1;
            pTotal += 1;
         }
      }
      return 100.0 * (pComplete/pTotal);
   }
}// end class