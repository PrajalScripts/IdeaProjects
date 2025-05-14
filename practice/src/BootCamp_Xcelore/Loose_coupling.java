package BootCamp_Xcelore;

import java.sql.SQLOutput;

class EmailService implements MessageService{
     
    @Override
    public void sendMessage(String s) {
        System.out.println("Sending email :"+s);
        
    }
}
class SmsService implements MessageService{
    @Override
    public void sendMessage(String s){
        System.out.println("Sending Sms :"+s);
    }
}



public class Loose_coupling {
    public static void main(String[] args) {
      EmailService emailService=new EmailService();          // these are b and c provided when needed by container 
      SmsService smsService = new SmsService();             //already stored in memory 
      
      MessageProcessor m1= new MessageProcessor(emailService);         //loose coupling
      MessageProcessor m2= new MessageProcessor(smsService);               //loose coupling 
        
        m1.processMessage("message from Prajal ");
        m2.processMessage("Hello Msg from gfg");
        
    }
}
