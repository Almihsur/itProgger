package day13;
import java.util.Date;

public class Message {
    private String sender, receiver, text;
    private Date date;

    public Message(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM: " + sender + '\'' +
                ", TO: " + receiver + '\'' +
                ", ON: " + date + '\'' +
                ", Текст сообщения: " + text + '\'' +
                "}\n";
    }
}
