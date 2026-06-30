package com.se1.messenger.services.message;

import com.se1.messenger.domain.Message;
import com.se1.messenger.patterns.Observer;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
    }

    public void detach(Observer observer) {
    }

    public void notifyObservers(String messageId) {
    }

    public void sendEncryptedMessage(Message message) {
    }
}
