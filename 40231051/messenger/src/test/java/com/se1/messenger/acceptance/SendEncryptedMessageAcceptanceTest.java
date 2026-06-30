package com.se1.messenger.acceptance;

import com.se1.messenger.patterns.EncryptedMessageDecorator;
import com.se1.messenger.patterns.MessageComponent;
import com.se1.messenger.patterns.MessageFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SendEncryptedMessageAcceptanceTest {

    @Test
    public void userCanCreateAndEncryptTextMessage() {
        MessageFactory factory = new MessageFactory();

        MessageComponent plainMessage = factory.createMessage("text", "Salam");
        MessageComponent encryptedMessage = new EncryptedMessageDecorator(plainMessage);

        assertEquals("ENCRYPTED(Salam)", encryptedMessage.getContent());
        assertNotEquals("Salam", encryptedMessage.getContent());
    }
}
