package org.example.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.LinkedList;
import java.util.List;

public class ReplyKeyBoardQuran {


    public static KeyboardButton button(String text) {
        KeyboardButton button = new KeyboardButton();
        button.setText(text);
        return button;
    }

    public static ReplyKeyboardMarkup menuKeyboardQuran() {
        KeyboardButton mainButton= button("Main Menu");
        KeyboardButton chapter1 = button("1-10 suralar ");
        KeyboardButton chapter2 = button("11-20 suralar ");
        KeyboardButton chapter3 = button("21-30 suralar ");
        KeyboardButton chapter4 = button("31-40 suralar ");
        KeyboardButton chapter5 = button("41-50 suralar ");
        KeyboardButton chapter6 = button("51-60 suralar ");
        KeyboardButton chapter7 = button("61-70 suralar ");
        KeyboardButton chapter8 = button("71-80 suralar ");
        KeyboardButton chapter9 = button("81-90 suralar ");
        KeyboardButton chapter10 = button("91-100 suralar ");
        KeyboardButton chapter11 = button("101-114 suralar ");


        KeyboardRow row = new KeyboardRow();
        row.add(mainButton);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(chapter1);
        row1.add(chapter2);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(chapter3);
        row2.add(chapter4);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(chapter5);
        row3.add(chapter6);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(chapter7);
        row4.add(chapter8);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(chapter9);
        row5.add(chapter10);

        KeyboardRow row6 = new KeyboardRow();
        row6.add(chapter11);

        List<KeyboardRow> rowList = new LinkedList<>();
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(rowList);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        return replyKeyboardMarkup;

    }
}
