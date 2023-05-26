// Feel free to add here any import statements that you need
import java.util.Date;

/** 
   This class models information we keep about a help desk ticket.
**/

public class HelpDeskTicket {
   
   private String requestedBy; 
   private String assignedTo; 
   private String description; 
   private String response; 
   private int satisfaction;
   private Date dateOpened; 
   private Date dateClosed;

   public HelpDeskTicket(String requestedBy, String description){
      this.dateOpened = new Date(); 
      this.satisfaction = -1;
      
      this.requestedBy = requestedBy;
      this.description = description;
      
      this.dateClosed = null;
      this.assignedTo = null;
      this.response = null;
   }
   
   public HelpDeskTicket(String requestedBy){
      this(requestedBy, "No ticket description, call user directly.");
   }
   
   public HelpDeskTicket(){
      this("Justin Testicket", "Testing ticket, please ignore.");
   }
   
   public void assignTo(String assignee){
      this.assignedTo = assignee;
   }
   
   public void resolve(String response){
      if(!this.isAssigned()) return; 
      this.dateClosed = new Date(); 
      if(response == null)
         this.response = "No response provided.";
      else
         this.response = response; 
   }
   
   public void resolve(){
      this.resolve(null);
   }
   
   public void provideFeedback(int satisfaction){
      if(!this.isAssigned()) return; 
      if(!this.isClosed()) return; 
      if(satisfaction >=0 && satisfaction <= 5)
         this.satisfaction = satisfaction;
   }

   public boolean isAssigned(){
      return assignedTo != null;
   }
   
   public boolean isClosed(){
      return dateClosed != null;
   }

   public boolean hasResponse(){
      return response != null;
   }
   
   public String toString(){
      String result = "";
      result += this.description + "\n"; 
      result += "\t" + "Requested by:\t" + this.requestedBy + "\n";
      result += "\t" + "Date Opened:\t" + this.dateOpened + "\n";
      if(this.assignedTo != null)
         result += "\t" + "Assigned to:\t" + this.assignedTo + "\n";
      if(this.response != null){
         result += "\t" + "Response is:\t" + this.response + "\n";
         result += "\t" + "Date Closed:\t" + this.dateClosed + "\n";
      }
      if(this.satisfaction != -1)
         result += "\t" + "Satisfaction:\t" + this.satisfaction + "\n";      
      return result;
   }
}// end class
