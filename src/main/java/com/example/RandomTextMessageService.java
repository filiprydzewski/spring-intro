package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService {


   public String[] messageArray = new String[]{ "Hi!", "Czesc!", "Bonjour!", "Ahoj!", "Hallo!", "Hola!", "Moi!", "Siema!", "Yo!", "Szia!" };



    @Override
    public String getMessage() {
        Random rand = new Random();
        int upperBound = 10;

        return messageArray[rand.nextInt(upperBound)];

    }
}
