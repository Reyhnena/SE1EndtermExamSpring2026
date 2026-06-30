package com.se1.messenger.patterns;

public class EncryptedMessageDecorator implements MessageComponent {
    private MessageComponent message;

    public EncryptedMessageDecorator(MessageComponent message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return encrypt();
    }

    public String encrypt() {
        return "ENCRYPTED(" + message.getContent() + ")";
    }
}
