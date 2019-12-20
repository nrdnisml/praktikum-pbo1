package unittest;

public class MessageProcessor1841720060Nurudin {

    private String mSender, mRecipient, mMessage;

    public String getMessageNurudin() {
        return mMessage;
    }

    public String getRecipientNurudin() {
        return mRecipient;
    }

    public String getSenderNurudin() {
        return mSender;
    }

    public void setMessageNurudin(String message) {
        this.mMessage = message;
    }

    public void setRecipientNurudin(String recipient) {
        this.mRecipient = recipient;
    }

    public void setSenderNurudin(String sender) {
        this.mSender = sender;
    }

    public String messageFormatNurudin() {
        String message = String.format("Hai %s, you have message from %s. "
                + "\nThe message as follows : %s", this.mRecipient, this.mSender, this.mMessage);
        return message;
    }

    public void showMessageNurudin() {
        System.out.println(messageFormatNurudin());
    }
}
