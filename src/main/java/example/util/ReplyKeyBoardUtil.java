package example.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.LinkedList;
import java.util.List;

public class ReplyKeyBoardUtil {
    public static KeyboardButton button(String text) {
        KeyboardButton button = new KeyboardButton();
        button.setText(text);
        return button;
    }

    public static ReplyKeyboardMarkup menuKeyboard() {


        KeyboardButton quran = button("Qur'ān\uD83C\uDFA7");//

        KeyboardButton recitation = button("Qur'an recitation (educational style)");//Todo

        KeyboardButton ramadan = button("Ramadan -1443");//
        KeyboardButton taraweeh = button("Taraweeh Namaz 1443");//

        KeyboardButton rulesOfQuran = button("Rules of Qur'an");
        KeyboardButton evolutionQuran = button("Evolution of the Early Qur'ān");  //

        KeyboardButton salahMale = button("Namaaz \uD83D\uDC73\uD83C\uDFFB\u200D♂️");
        KeyboardButton salahFemale = button("Namaaz \uD83E\uDDD5\uD83C\uDFFB");

        KeyboardButton mushaf = button(" Musʼhaf ");//Todo
        KeyboardButton salahTime = button("Salah Time⏳"); //

        KeyboardButton nights = button("And By the Ten Nights"); //
        KeyboardButton iqro = button("Iqro");//

        KeyboardButton haj = button("Hajj");//Todo
        KeyboardButton dhikr = button("morning and evening dhikr");//Todo



        KeyboardRow row1 = new KeyboardRow();
        row1.add(quran);
        row1.add(recitation);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(ramadan);
        row2.add(taraweeh);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(rulesOfQuran);
        row3.add(evolutionQuran);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(salahMale);
        row4.add(salahFemale);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(mushaf);
        row5.add(salahTime);

        KeyboardRow row6 = new KeyboardRow();
        row6.add(nights);
        row6.add(iqro);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(haj);
        row7.add(dhikr);

        List<KeyboardRow> rowList = new LinkedList<>();

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
