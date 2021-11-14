package com.discord.bots.commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import com.discord.bots.Main;

public class Ping implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent message) {
        if(message.getMessageContent().equalsIgnoreCase(Main.Prefix + "Ping")){
            message.getChannel().sendMessage("React to this Pong!");
        }
    }
}
