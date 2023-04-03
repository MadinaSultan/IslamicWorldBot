package example.controller;

import org.example.MyTelegramBot;
import org.example.util.MessageUtil;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.io.File;
import java.util.HashMap;

import static org.example.TokenService.*;


public class NamazControllerMen {

    private static MyTelegramBot myTelegramBot;
    private FileLogController controller;


    public static HashMap<String, Object> keyMapNamaz = new HashMap<>();

    {
        keyMapNamaz.put("Main Menu", new Object());
        keyMapNamaz.put("Taxorat", new Object());         //done
        keyMapNamaz.put("1-rakat.Niyat", new Object());   //done
        keyMapNamaz.put("Takbir", new Object());         //done
        keyMapNamaz.put("Qiyom", new Object());         //done
        keyMapNamaz.put("Ruku", new Object());         //done
        keyMapNamaz.put("Rukudan turish", new Object()); //done
        keyMapNamaz.put("1-Sajda", new Object());
        keyMapNamaz.put("Jalsa - Sajdadan turish", new Object());
        keyMapNamaz.put("2-Sajda", new Object());
        keyMapNamaz.put("2-rakat.Niyat", new Object());
        keyMapNamaz.put("Qadda", new Object());
        keyMapNamaz.put("Salom", new Object());
    }

    public NamazControllerMen(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
        controller = new FileLogController(myTelegramBot);
    }

    public void handleNamaz(String text, Message message) {

        if (text.equals("Main Menu")) {
            goMain(message);
        } else if (text.equals("Taxorat")) {
            taxorat(message);
        } else if (text.equals("1-rakat.Niyat")) {
            niyat(message);
        } else if (text.equals("Takbir")) {
            takbir(message);
        } else if (text.equals("Qiyom")) {
            qiyom(message);
        } else if (text.equals("Ruku")) {
            ruku(message);
        } else if (text.equals("Rukudan turish")) {
            rukudanTurish(message);
        } else if (text.equals("Sajda")) {
            sajda_1(message);
        } else if (text.equals("Jalsa - Sajdadan turish")) {
            jalsa(message);
        } else if (text.equals("2-Sajda")) {
            sajda_2(message);
        } else if (text.equals("2-rakat.Niyat")) {
            niyat_2(message);
        } else if (text.equals("Qadda")) {
            qadda(message);
        } else if (text.equals("Salom")) {
            salom(message);
        } else {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId());
            myTelegramBot.sendMsg(MessageUtil.notFound(message.getChatId()));
        }
    }

    public void sajda_2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgIAAxkBAAIMOWO6_yFswf9PeWFiReCH62aDssywAALPBwACUFoJSYXjJLIJcyBrLQQ"));
        sendMessage.setText("Sajda\n" +
                "\n" +
                "Keyin takbir aytamiz va ikkinchi sajdaga boramiz va kamida uch marta “Subhaana robbiyal ala” deymiz.");
        myTelegramBot.sendMsg(sendMessage);

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIMOmO6_yFTmYcv2DMo7WDs3Nd1wO0GAAI6BgAC5vMhSRZ_YipaVJESLQQ"));
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("Subhaana robbial ala.\n" +
                "\n" +
                "Ma'nosi:\n" +
                "\n" +
                "Oliy Rabbiy nuqsonlardan pokdir.");
        myTelegramBot.sendMsg(sendMessage);

        sendMessage.setChatId(message.getChatId());
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgIAAxkBAAIMO2O6_yFLnOAMtMOLWvtG97wceCfgAALUBwACUFoJSTC72CptYGklLQQ"));
        sendMessage.setText("Qiyom\n" +
                "\n" +
                "Takbir ayting va keyingi rakatga turing. Sajdadan turganda avval boshni, keyin qo'llarni, keyin tizzalarni ko'taramiz.");
        myTelegramBot.sendMsg(sendMessage);
    }

    public void jalsa(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgIAAxkBAAIMHGO6_ewx-FPwoU_NjGPkIlYFZCXpAALMBwACUFoJSXL29pjI6Zx7LQQ"));
        sendMessage.setText("Jalsa - sajdadan tik turish\n" +
                "\n" +
                "So‘ng “Ollohu akbar” deb sajdadan boshimizni ko‘tarib, o‘ng oyoq barmoqlarini qiblaga qaratib, tinchgina chap oyoqqa o‘tiramiz. Ikkala qo'limiz ikkala tizzada.");
        myTelegramBot.sendMsg(sendMessage);
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIMHWO6_exZAxIL5GZlM6QXJiP4ODx8AAI7BgAC5vMhSUHHaH8-YYruLQQ"));
    }

    public void goMain(Message message) {

    }




    public void salom(Message message) {

    }
    public void qadda(Message message) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(message.getChatId());
        sendPhoto.setPhoto(new InputFile(new File("qadda.jpg")));
        SendMessage sendMessage = new SendMessage();

        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("Qadda\n"+
                "\n"+
                "Ikkinchi rak'atning ikkinchi sajdasini o'qib, chap oyoqqa o'tiramiz, o'ng oyoq barmoqlari qiblaga qaragan. O'ng qo'lni o'ng tizzaga, chap qo'lni chap tizzaga qo'ying, barmoqlar yoyilgan. Keyin tashahhudni o‘qiydi.");
        myTelegramBot.sendMsg(sendPhoto);
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(),""));

        sendMessage.setChatId(message.getChatId());

        sendMessage.setText("");
    }
    public void sajda_1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgIAAxkBAAIMDmO6-4l6HBKBv1Eddhjyzj9Xh9bTAAJ5BwACUFoBSf0Lvg7XhdiLLQQ"));
        sendMessage.setText("Sajda\n" +
                "Oyog‘imizni rostlab, tursak, “Allohu akbar” deb sajdaga boramiz. Sajdaga ketayotganda avval tizzalarimizni, keyin qo‘limizni, keyin boshimizni qo‘llar orasiga qo‘yamiz. Sajdada turganda barmoqlar qiblaga qaragan bo'lishi kerak. Peshona va burnimizni erga qo'yamiz, qo'ltig'imiz ochiq, ko'kragimiz orqaga tegmaydi. Katta barmoqlar ham qiblaga qaraydi. Biz kamida uch marta “Subhaana robbial ala” deymiz.");
        myTelegramBot.sendMsg(sendMessage);
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIMD2O6-4nLSbu5XaqSJsMPN7fmKNHMAAI8BgAC5vMhSRq-TDj_CaUbLQQ"));

        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("Subhaana robbial ala.\n" +
                "\n" +
                "Ma'nosi:\n" +
                "\n" +
                "Oliy Rabbiy nuqsonlardan pokdir.");
        myTelegramBot.sendMsg(sendMessage);
    }

    public void niyat_2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgIAAxkBAAIMZ2O7AVfKJlftw9_l3D2gl4XFElSuAALaBwACUFoJSV3Pyc9PYcCqLQQ"));
        sendMessage.setText("Ikkinchi rakat\n" +
                "\n" +
                "Ikkinchi rak'at ham birinchi rak'at kabi o'qiladi. Faqat boshida takbir aytilmaydi, aytilmaydi va \"og'iz\" qilinmaydi. “Fotihon”ni o‘qib, so‘ng “Zam” surasini o‘qib, takbir aytib, ruku qilishga. Keyin turamiz, takbir aytamiz va ikki marta sajda qilamiz.");
        myTelegramBot.sendMsg(sendMessage);
    }

    public void rukudanTurish(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgIAAxkBAAIL9GO6-cE-zz9pKYkJCSXdv66e1JPoAAJwBwACUFoBSfzBgELiUdQELQQ"));
        sendMessage.setText("Rukudan turish\n" +
                "\n" +
                "Namozni yolgiz oqishyotgan bo'lsak, \"Sami'allohu liman hamidah\" \u200B\u200Bdeb, kaddimizni tiklaymiz va \"Robbanaa lakal hamd\" deymiz. Jamoat namozida esa imom \"Sami'allohu liman hamida\" desa, iqtido baholar ichida \"Robbanaa, lakal hamd\" dedi.\n" +
                "\n" +
                "Qaddimizni to'liq tiklab, tik turib olgach, takbir aytib, sajdaga ketamiz.");
        myTelegramBot.sendMsg(sendMessage);
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIL9mO6-ckl2QVhYk707fqGTAR7D1sNAAJABgAC5vMhSY1XBJCudI5qLQQ"));
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("Samialalohu limon hamidah\n" +
                "\n" +
                "Ma'nosi:\n" +
                "\n" +
                "Kim hamd Alloh uni eshitadi.");
        myTelegramBot.sendMsg(sendMessage);
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIL92O6-cnZzVzobfQ4Y2vBPqEVeXbeAAI9BgAC5vMhSRe2bW5N9UTELQQ"));
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("Robbanaa, lakal hamd\n" +
                "\n" +
                "Ma'nosi:\n" +
                "\n" +
                "Robimiz, Senga hamd bo'lsin.");
        myTelegramBot.sendMsg(sendMessage);
    }

    public void ruku(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgIAAxkBAAILk2O62Zfg8_ToAAE1emsJB5FgzBJXrAAC8gYAAlBaAUnLEO0-TTzcOC0E"));
        sendMessage.setText("Fotiha yoki zam so'radan keyin takror aytamiz, ruku'ga egilamiz. Ruku'da bo'ldirlar tik turadi, ikki qo'llab tizalarni cho'slab turamiz, sizzani bumamiz, boshni egmaymiz. Orqamiz ham tekis turishi kerak. Shu holda kamida uch marta \"Subhaana Robbiyal azim\" deymiz.\n");
        myTelegramBot.sendMsg(sendMessage);
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAILlWO62aZzXYbOq17-dm2HQG-NJEPnAAJBBgAC5vMhST5u6jG-4F6WLQQ"));
        sendMessage.setText("Subhaana Robbiyal aziym.\n" +
                "\n" +
                "Ma'nosi:\n" +
                "\n" +
                "Ulug Robbim nuqsonlardan pokdir.");
        myTelegramBot.sendMsg(sendMessage);
    }

    public void qiyom(Message message) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(message.getChatId());
        sendPhoto.setPhoto(new InputFile(new File("qyom.jpg")));
        sendPhoto.setCaption("Qiyom");
        myTelegramBot.sendMsg(sendPhoto);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("Agar imomga iqtido boshlangan bo'lsa, \"sano\"dan boshqa narsani aytmaymiz.\n" +
                "\n" +
                "So'ngra ichimizda \"A'zu billahi minash shaytonir rojiym. Bismillahir yo'lmanir yo'lim\"ni aytamiz.\n" +
                "\n" +
                "bir o'zimiz o'qigan bo'lsak, Fotiha surasini o'qiymiz. Keyin ichimizda \"Omiy\" deymiz.\n" +
                "\n" +
                "Sunnat, nafl, vojib namozlarning har rak'atida, farz namozlarining esa, birinchi va ikki rak'atlarida Fotiha surasidan keyin zam surasi, ya'ni biror sura yoki uzunroq oyat yoki kamida uchta qisqa oyat o'qidi.\n" +
                "\n" +
                "Farz namozlarining uchunchi va to'rt rak'atlarida Fotiha surasidan zaminch o'qishdan takbir aytib ruk'aga boriladi.");
        myTelegramBot.sendMsg(sendMessage);

    }


    public void takbir(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgIAAxkBAAILaWO60RhthQkferEUcOJrhOpjU0BYAALwBgACUFoBSciBWd1s-12pLQQ"));
        sendMessage.setText("Allohu akbar");
        myTelegramBot.sendMsg(sendMessage);
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAILamO60RhV-NzCuo-esi-y0gmUscVmAAJNBgAC5vMhSTcYz7mhlKSxLQQ"));
    }

    public void niyat(Message message) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(message.getChatId());
        sendPhoto.setPhoto(new InputFile(new File("qiyom.jpg")));
        sendPhoto.setCaption("qiyom");
        myTelegramBot.sendMsg(sendPhoto);
        SendMessage sendMessage = new SendMessage();

        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("Namoz vaqt kirgach, ta'minot va pok kiyim bilan pok joyda turib, qiblaga yuzlanamizva niyat qilamiz.\n" +
                "\n" +
                "Masalan: \"Xolis Alloh bomdod namozining ikki rak'at farzini o'qishga niyat qildim\"\n" +
                "\n" +
                "degan mazmunda niyat qilamiz. Imomga iqtido qilgan kishi:\n" +
                "\n" +
                "\"shu imomga iqtido qara\"\n" +
                "\n" +
                "jumlasini qo'shish niyatida. Niyatni pichirlab, tilda ham aytish mumkin, ichda aytish ham mumkin.");
        myTelegramBot.sendMsg(sendMessage);
    }

    public void taxorat(Message message) {
        SendMessage sendMessage = new SendMessage();
        myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "CgACAgQAAxkBAAILMmO6yPogfZYCjQKafrBey3zpwWxnAALqAgAC4f0UU6iQVIHwTq50LQQ"));
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("[ablution procedure ](https://telegra.ph/tahorat-11-11)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);

    }


}