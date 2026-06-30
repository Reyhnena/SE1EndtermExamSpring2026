package com.se1.messenger.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MessageFactoryTest {

    @Test
    public void shouldCreateTextMessage() {
        MessageFactory factory = new MessageFactory();

        MessageComponent message = factory.createMessage("text", "hello");

        assertNotNull(message);
        assertTrue(message instanceof TextMessage);
        assertEquals("hello", message.getContent());
    }

    @Test
    public void shouldCreateMediaMessage() {
        MessageFactory factory = new MessageFactory();

        MessageComponent message = factory.createMessage("media", "photo.jpg");

        assertNotNull(message);
        assertTrue(message instanceof MediaMessage);
        assertEquals("photo.jpg", message.getContent());
    }

    @Test
    public void shouldRejectUnknownMessageType() {
        MessageFactory factory = new MessageFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.createMessage("voice", "voice.mp3");
        });
    }
}
