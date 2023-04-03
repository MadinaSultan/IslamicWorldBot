package org.example.util;

import java.util.HashMap;
import java.util.Map;

public class LangUtil {
    public static Map<String, String> langMap = new HashMap<>();

    public static Map<String, String[]> bookMap = new HashMap<>();
    public static final String WELCOME = "WELCOME";

    static {
        langMap.put("WELCOME.uz", " Assalomu aleykum va Rahmatulloh!\n" +
                "\n" +
                "Bu bot siz qidirayotgan kitoblaringizni topishga xizmat qiladi.\n" +
                "\n" +
                "Qidiruv rejimi: kitobning to'liq nomini yoki muallifning to'liq ismini yozishingiz shart emas. Shunchaki muallif yoki kitob nomidan so'z kiriting!\n" +
                "\n" +
                "Masalan: \"Islom va iymon kitobi\" kitobini qidirmoqchi bo'lsangiz:\n" +
                "\n" +
                "Islom ✅\n" +
                "Iymon ✅\n" +
                "Islom va iymon ✅\n" +
                "\n" +
                "Xuddi shu narsa etarli, siz uning to'liq ismini yozishingiz shart emas.\n" +
                "Kitobni topish uchun \"Kitob qidirish\" tugmasini bosing\n" +
                "\n" +
                "Yordam: / help\n" +
                "Boshlash: /start");

        langMap.put("WELCOME.en", "Assalomu aleykum va Rahmatullah!\n" +
                "\n" +
                "This bot serves you to find the books you are looking for.\n" +
                "\n" +
                "Search mode: you do not need to write the full title or full author's name of the book. Simply enter a word from the name of author or book!\n" +
                "\n" +
                "For example: if you want to search for a book \"Islom va iymon kitobi\":\n" +
                "\n" +
                "Islom ✅\n" +
                "Iymon ✅\n" +
                "Islom va iymon ✅\n" +
                "\n" +
                "The same is enough, you do not need to write his full name.\n" +
                "Click on \"Book Search\" button to find book\n" +
                "\n" +
                "Help: /help\n" +
                "Start: /start ");

        langMap.put("WELCOME.ru", "Ассалому алейкум ва Рахматуллах!\n" +
                "\n" +
                "Этот бот поможет вам найти книги, которые вы ищете.\n" +
                "\n" +
                "Режим поиска: не нужно писать полное название или полное имя автора книги. Просто введите слово из имени автора или книги!\n" +
                "\n" +
                "Например: если вы хотите найти книгу «Ислом ва иймон китоби»:\n" +
                "\n" +
                "Ислам ✅\n" +
                "Иймон ✅\n" +
                "Ислам ва иймон ✅\n" +
                "\n" +
                "Достаточно того же, полное имя писать не нужно.\n" +
                "Нажмите кнопку «Поиск книги», чтобы найти книгу.\n" +
                "\n" +
                "Помогите: /помогите\n" +
                "Начало: /старт ");

        langMap.put("WELCOME.arab", "السلام عليكم ورحمة الله!\n" +
                "\n" +
                "يساعدك هذا الروبوت في العثور على الكتب التي تبحث عنها.\n" +
                "\n" +
                "وضع البحث: لا تحتاج إلى كتابة العنوان الكامل أو اسم المؤلف الكامل للكتاب. ما عليك سوى إدخال كلمة من اسم المؤلف أو الكتاب!\n" +
                "\n" +
                "على سبيل المثال: إذا كنت تريد البحث عن كتاب \"Islom va iymon kitobi\":\n" +
                "\n" +
                "اسلام ✅\n" +
                "ايمون ✅\n" +
                "Islom va iymon ✅\n" +
                "\n" +
                "نفس الشيء يكفي ، لا داعي لكتابة اسمه كاملاً.\n" +
                "انقر على زر \"بحث عن الكتب\" للعثور على كتاب\n" +
                "help \n" +
                "يساعد: / start\n"
        );

        //....
        String[] bookUzb = {"bookUzb"};
        String[] bookEng = {"bookEng"};
        String[] bookRus = {"bookRus"};
        String[] bookArab ={"bookArab"};
        bookMap.put("uz", bookUzb);
        bookMap.put("eng", bookEng);
        bookMap.put("ru", bookRus);
        bookMap.put("ar", bookRus);
    }

    public static String getMessage(String key, String lang) {

        if (langMap.containsKey(key + "." + lang)) {
            return langMap.get(key + "." + lang);
        }
        return "NotFound";
    }


}
