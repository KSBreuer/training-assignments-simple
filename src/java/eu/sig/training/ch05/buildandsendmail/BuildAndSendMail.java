package eu.sig.training.ch05.buildandsendmail;

class Recipient {
    String firstName;
    String lastName;
    String division;

    public String getEmailAddress() {
        return firstName.charAt(0) + "." + lastName.substring(0, 7) + "@" + division.substring(0, 5) + ".compa.ny";
    }
}

class Message {
    String subject;
    MailFont font;
    String message;

    public MailMessage formatMessage() {
        return null;
    }
}

class MailFont {

}

class MailMan {

    @SuppressWarnings("unused")
    public void send(String mId, String subject, MailMessage mMessage) {
    }

}

@SuppressWarnings("unused")
class MailMessage {

}

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, Recipient recipient, Message message) {
        // Format the email address
        String mId = recipient.getEmailAddress();
        // Format the message given the content type and raw message
        MailMessage mMessage = message.formatMessage();
        // Send message
        m.send(mId, message.subject, mMessage);
    }
    // end::buildAndSendMail[]

}