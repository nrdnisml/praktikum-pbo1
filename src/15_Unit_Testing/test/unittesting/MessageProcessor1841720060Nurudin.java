package unittesting;

import org.junit.Assert;
import org.junit.Test;

public class MessageProcessor1841720060Nurudin {

    unittest.MessageProcessor1841720060Nurudin mProcessor;

    public MessageProcessor1841720060Nurudin() {
        mProcessor = new unittest.MessageProcessor1841720060Nurudin();
        mProcessor.setSenderNurudin("Ronaldo");
        mProcessor.setRecipientNurudin("Rafael");
        mProcessor.setMessageNurudin("Whats up bro?");
    }

    @Test
    public void testShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo. \nThe message as follows : "
                + "Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatNurudin());
    }

}
