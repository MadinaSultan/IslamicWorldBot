package example.util;

import org.example.MyTelegramBot;
import org.example.controller.FileLogController;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.LinkedList;
import java.util.List;

import static org.example.TokenService.createSendDocument;


public class ReplyKeyBoardNamaz {
    private static MyTelegramBot myTelegramBot;
    private  FileLogController controller;
    public ReplyKeyBoardNamaz(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
        controller = new FileLogController(myTelegramBot);
    }
    public static KeyboardButton button(String text) {
        KeyboardButton button = new KeyboardButton();
        button.setText(text);
        return button;
    }

    public void gifForNamaz(Message message) {
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(),"CgACAgQAAxkBAAIKqmO6tPhnTi2Q0P599-bFbrJNY_6OAAL8AgACZGEUU-l-umUvc-HpLQQ"));
    }

    public static ReplyKeyboard menuNamazForMan() {

        KeyboardButton mainButton = button("Main Menu");
        KeyboardButton chapter1 = button("Taxorat");
        KeyboardButton chapter2 = button("1-rakat.Niyat");
        KeyboardButton chapter3 = button("Takbir");
        KeyboardButton chapter4 = button("Qiyom");
        KeyboardButton chapter5 = button("Ruku");
        KeyboardButton chapter6 = button("Rukudan turish");
        KeyboardButton chapter7 = button("Sajda");
        KeyboardButton chapter8 = button("Jalsa - Sajdadan turish");
        KeyboardButton chapter9 = button("2-Sajda");
        KeyboardButton chapter10 = button("2-rakat.Niyat");
        KeyboardButton chapter11 = button("Qadda");
        KeyboardButton chapter12 = button("Salom");

        KeyboardRow row = new KeyboardRow();
        row.add(mainButton);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(chapter1);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(chapter2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(chapter3);
        row3.add(chapter4);
        row3.add(chapter5);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(chapter6);
        row4.add(chapter7);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(chapter8);

        KeyboardRow row6 = new KeyboardRow();
        row6.add(chapter9);
        row6.add(chapter10);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(chapter11);
        row7.add(chapter12);


        List<KeyboardRow> rowList = new LinkedList<>();
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(rowList);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        return replyKeyboardMarkup;
    }
}
