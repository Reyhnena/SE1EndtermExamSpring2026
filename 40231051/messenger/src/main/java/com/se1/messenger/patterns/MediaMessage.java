package com.se1.messenger.patterns;

public class MediaMessage implements MessageComponent {
    private String content;

    public MediaMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
