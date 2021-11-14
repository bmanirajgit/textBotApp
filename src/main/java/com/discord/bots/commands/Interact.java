package com.discord.bots.commands;

import com.discord.bots.Main;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Interact implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {

        if(event.getMessageContent().equalsIgnoreCase(Main.Prefix + "hey")){
            event.getChannel().sendMessage("yo!");
        }
    }
}
