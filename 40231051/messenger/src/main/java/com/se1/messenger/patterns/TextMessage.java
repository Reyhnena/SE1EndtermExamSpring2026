package com.se1.messenger.patterns;

public class TextMessage implements MessageComponent {
    private String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
