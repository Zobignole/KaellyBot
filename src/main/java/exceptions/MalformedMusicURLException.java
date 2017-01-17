package exceptions;

import commands.Command;
import discord.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sx.blah.discord.handle.obj.IMessage;

/**
 * Created by steve on 14/11/2016.
 */
public class MalformedMusicURLException implements Exception {

    private final static Logger LOG = LoggerFactory.getLogger(MalformedMusicURLException.class);

    @Override
    public void throwException(IMessage message, Command command) {
        Message.send(message.getChannel(), "L'URL de la musique est malformé.");
    }
}