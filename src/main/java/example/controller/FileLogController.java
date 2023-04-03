package example.controller;

import org.example.MyTelegramBot;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.games.Animation;
import org.telegram.telegrambots.meta.api.objects.stickers.Sticker;

public class FileLogController {
    private static MyTelegramBot myTelegramBot;

    public FileLogController(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
    }
    // Take token for sending files for telegram bot
    public void handler (Message message){

        if (message.hasAudio()) {
            Audio audio = message.getAudio();
            System.out.println(audio.getFileId());

            SendMessage sendMessage = new SendMessage();
            sendMessage.setText("New Audio Id:\n" + audio.getFileId());
            sendMessage.setChatId(message.getChatId());
            myTelegramBot.sendMsg(sendMessage);
        }


    }
    public void handlerVideo (Message message) {

        if (message.hasVideo()) {
            Video video = message.getVideo();
            System.out.println(video.getFileId());

            SendMessage sendMessage = new SendMessage();
            sendMessage.setText("New Video Id:\n" + video.getFileId());
            sendMessage.setChatId(message.getChatId());
            myTelegramBot.sendMsg(sendMessage);
        }
    }

    public void handlerSticker (Message message) {

        if (message.hasSticker()) {
            Sticker sticker = message.getSticker();
            System.out.println(sticker.getFileId());

            SendMessage sendMessage = new SendMessage();
            sendMessage.setText("New sticker Id:\n" + sticker.getFileId());
            sendMessage.setChatId(message.getChatId());
            myTelegramBot.sendMsg(sendMessage);
        }
    }
    public void handlerDocument (Message message) {
        if (message.hasDocument()) {
            Document document = message.getDocument();
            System.out.println(document.getFileId());

            SendMessage sendMessage = new SendMessage();
            sendMessage.setText("New document Id:\n" + document.getFileId());
            sendMessage.setChatId(message.getChatId());
            myTelegramBot.sendMsg(sendMessage);
        }
    }

    public void handlerAnimation(Message message) {

        if (message.hasAnimation()) {
            Animation animation = message.getAnimation();
            System.out.println(animation.getFileId());

            SendMessage sendMessage = new SendMessage();
            sendMessage.setText("New animation Id:\n" + animation.getFileId());
            sendMessage.setChatId(message.getChatId());
            myTelegramBot.sendMsg(sendMessage);
        }
    }




// Save token for sending files for telegram bot

    }

