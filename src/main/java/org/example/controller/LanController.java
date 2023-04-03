package org.example.controller;

import org.example.component.ComponentContainer;
import org.example.dto.Profile;
import org.example.util.LangUtil;
import org.example.util.ReplyKeyBoardUtil;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class LanController {

    public SendMessage handle(String text, Message message) {
        // lang/uz -> [lang,uz]
        String[] arr = text.split("/");
        Profile profile = ComponentContainer.getProfile(message.getChatId());

        switch (arr[1]) {
            case "uz" -> {
                profile.setLang("uz");
            }
            case "en" -> {
                profile.setLang("en");
            }
            case "ru" -> {
                profile.setLang("ru");
            }
            case "arab"->{
                profile.setLang("arab");
            }
            default -> profile.setLang("uz");
        }


        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(LangUtil.getMessage(LangUtil.WELCOME, profile.getLang()));
        sendMessage.setReplyMarkup(ReplyKeyBoardUtil.menuKeyboard());
        return sendMessage;
    }
}
