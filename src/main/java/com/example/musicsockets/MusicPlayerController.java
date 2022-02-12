package com.example.musicsockets;

import com.example.musicsockets.models.PlayMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MusicPlayerController {

    @MessageMapping("/play")
    @SendTo("/instruments/play")
    public PlayMessage playInstrument(PlayMessage playMessage){
        System.out.println("Playing = " + playMessage);
        return playMessage;
    }

}
