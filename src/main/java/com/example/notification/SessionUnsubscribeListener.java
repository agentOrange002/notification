/*
 * package com.example.notification;
 * 
 * import org.springframework.context.ApplicationListener; import
 * org.springframework.messaging.support.GenericMessage; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.socket.messaging.SessionUnsubscribeEvent;
 * 
 * @Controller public class SessionUnsubscribeListener implements
 * ApplicationListener<SessionUnsubscribeEvent> {
 * 
 * @Override public void onApplicationEvent(SessionUnsubscribeEvent event) {
 * GenericMessage message = (GenericMessage) event.getMessage();
 * 
 * String simpDestination = (String)
 * message.getHeaders().get("simpDestination");
 * 
 * if ("/topic/service".equals(simpDestination)) { // do stuff } } }
 */