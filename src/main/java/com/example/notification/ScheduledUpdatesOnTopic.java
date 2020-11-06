package com.example.notification;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledUpdatesOnTopic{

    @Autowired
    private SimpMessagingTemplate template;        

    @Scheduled(fixedDelay=3000)
    public void publishUpdates(){
    	HelloMessage msg = new HelloMessage();
    	msg.setName("new message "+ new Date().toString());
        template.convertAndSend("/topic/greetings", msg);
    }
}