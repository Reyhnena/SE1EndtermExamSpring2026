package com.se1.messenger.patterns;

public class EncryptedMessageDecorator implements MessageComponent {
    private MessageComponent message;
[6/30/2026 10:38 AM] Gift: public EncryptedMessageDecorator(MessageComponent message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return null;
    }

    public String encrypt() {
        return null;
    }
}
