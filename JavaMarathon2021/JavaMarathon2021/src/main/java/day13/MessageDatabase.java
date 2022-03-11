package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender.getUsername(), receiver.getUsername(), text));
        //System.out.println(message);
    }

    public static void getMessages(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender() == u1.getUsername() && message.getReceiver() == u2.getUsername()
                    || message.getSender() == u2.getUsername() && message.getReceiver() == u1.getUsername()) {
                System.out.println(message.getSender() + " : " + message.getText());
            }
        }


    }
//public static void getAllMessages(){
//    for (Message message: messages ) {
//        System.out.println(messages);
//    }
//}
}
