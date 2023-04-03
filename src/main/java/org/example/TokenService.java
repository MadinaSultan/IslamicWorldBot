package org.example;

import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.objects.InputFile;

public class TokenService {
    public static SendAudio createSendAudio(Long chatId, String fileName) {
        SendAudio audio = new SendAudio();
        audio.setChatId(chatId);
        audio.setAudio(new InputFile(fileName));
        return audio;
    }

    public static SendVideo createSendVideo (Long chatId, String fileName){
        SendVideo video = new SendVideo();
        video.setChatId(chatId);
        video.setVideo(new InputFile(fileName));
        return video;
    }
    public static SendPhoto createSendPhoto (Long chatId, String fileName){
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(fileName));
        return photo;
    }

    public static SendAnimation createSendAnimation (Long chatId, String fileName){
        SendAnimation animation = new SendAnimation();
        animation.setChatId(chatId);
        animation.setAnimation(new InputFile(fileName));
        return animation;
    }

    public static SendSticker createSendSticker (Long chatId, String fileName){
        SendSticker sticker = new SendSticker();
        sticker.setChatId(chatId);
        sticker.setSticker(new InputFile(fileName));
        return sticker;
    }

    public static SendDocument createSendDocument (Long chatId, String fileName){
        SendDocument document = new SendDocument();
        document.setChatId(chatId);
        document.setDocument(new InputFile(fileName));
        return document;
    }
}
