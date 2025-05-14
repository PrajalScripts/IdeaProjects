package BootCamp_Xcelore;

public class MessageProcessor {
    private final MessageService messageService;

    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message){
        this.messageService.sendMessage(message);
    }
}
