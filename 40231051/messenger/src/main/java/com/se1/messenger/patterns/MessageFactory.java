package com.se1.messenger.patterns;

public class MessageFactory {
    public MessageComponent createMessage(String type, String content) {
        if ("text".equalsIgnoreCase(type)) {
            return new TextMessage(content);
        }

        if ("media".equalsIgnoreCase(type)) {
            return new MediaMessage(content);
        }

        throw new IllegalArgumentException("Unsupported message type");
    }

    public MessageComponent createMessage(String type) {
        return createMessage(type, "");
    }
}
