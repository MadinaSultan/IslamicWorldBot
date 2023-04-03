package org.example.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InlineKeyBoardUtil {
    public static InlineKeyboardButton button(String text, String callBack) {
        InlineKeyboardButton button = new InlineKeyboardButton(text);
        button.setCallbackData(callBack);
        return button;
    }

    public static InlineKeyboardMarkup getLangButtons() {

        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(button("Uzbek\uD83C\uDDFA\uD83C\uDDFF", "lang/uz"));
        row.add(button("English\uD83C\uDDFA\uD83C\uDDF8", "lang/en"));
        row.add(button("Russian\uD83C\uDDF7\uD83C\uDDFA", "lang/ru"));
        row.add(button("Arabic\uD83C\uDDF5\uD83C\uDDF8", "lang/arab"));


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(Arrays.asList(row));
        return inlineKeyboardMarkup;
    }


}
