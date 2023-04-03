package example.controller;

import org.example.MyTelegramBot;
import org.example.TokenService;
import org.example.util.MessageUtil;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.HashMap;

import static org.example.TokenService.createSendAudio;


public class QuranController {

    private static MyTelegramBot myTelegramBot;
    private  FileLogController controller;
    private TokenService tokenService;
    public static HashMap<String, Object> keyMap = new HashMap<>();

    {
        keyMap.put("1-10 suralar", new Object());
        keyMap.put("21-30 suralar", new Object());
        keyMap.put("31-40 suralar", new Object());
        keyMap.put("41-50 suralar", new Object());
        keyMap.put("51-60 suralar", new Object());
        keyMap.put("61-70 suralar", new Object());
        keyMap.put("71-80 suralar", new Object());
        keyMap.put("81-90 suralar", new Object());
        keyMap.put("100-114 suralar", new Object());
    }

    public QuranController(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
        controller = new FileLogController(myTelegramBot);
    }


    public void handleQuranMp3(String text, Message message) {

        if (text.equals("1-10 suralar")) {
            surah_1(message);
        } else if (text.equals("11-20 suralar")) {
            surah_2(message);
        } else if (text.equals("21-30 suralar")) {
            surah_3(message);
        } else if (text.equals("31-40 suralar")) {
            surah_4(message);
        } else if (text.equals("41-50 suralar")) {
            surah_5(message);
        } else if (text.equals("51-60 suralar ")) {
            surah_6(message);
        } else if (text.equals("61-70 suralar")) {
            surah_7(message);
        } else if (text.equals("71-80 suralar")) {
            surah_8(message);
        } else if (text.equals("81-90 suralar")) {
            surah_9(message);
        } else if (text.equals("91-100 suralar")) {
            surah_10(message);
        } else if (text.equals("101-114 suralar")) {
            surah_11(message);
        } else {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId());
            myTelegramBot.sendMsg(MessageUtil.notFound(message.getChatId()));
        }
    }

    public void surah_11(Message message) {

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG1mO3uNmQ5b0H2ZrHE4MbPQf_W2QyAAIVFAACqpIYSTqI1z74AtVmLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG12O3uNnKpEpqQFOrXNIQXyi1uhdbAAIWFAACqpIYSUcXb4ZGj219LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG2GO3uNnjyxDp1T7ufmXUBi2dGjnzAAIXFAACqpIYSeOObInoiBNKLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG2WO3uNnLLivlZlieoHE1PE6h7aVsAAIYFAACqpIYSVNqjpgmHDZ4LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG2mO3uNlCLfyKyQ3BkjKk4eDMp-mwAAIZFAACqpIYSU4vbCPVI8orLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG22O3uNmbX_77mzlFQN2_9zpJXpS6AAIaFAACqpIYSakcXuPCmieoLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG3GO3uNnMGsJ867NwlBxm4T8mLbHZAAIbFAACqpIYSdw_e02FCwABvS0E"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG3WO3uNkluPNdsAOtYXru5PTTjvfHAAIcFAACqpIYSfHonYFYeuuOLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG3mO3uNk5I3Shcum0UspWfJUVR2X8AAIdFAACqpIYSSIZ7llzx-juLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG32O3uNkjNS-Ra4n64-p2O85Ul5ugAAIeFAACqpIYSbu8OQ8k05ynLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG4GO3uNnJ1bqRrJ55YWQ96rVwct39AAIfFAACqpIYSR2Cig6F5xGhLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG4WO3uNm1iEpj5f7AJU2kMNMjf4PLAAILFwAC8GIYSaGaygcpoBtaLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG4mO3uNnFAkMbYETIRcw53a0qLYlAAAIgFAACqpIYSWSBlMzBQVbGLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIG4mO3uNnFAkMbYETIRcw53a0qLYlAAAIgFAACqpIYSWSBlMzBQVbGLQQ"));
    }

    public void surah_10(Message message) {
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGh2O3OeWdfpMMBeivnXD9LkDOZy1cAAILFAACqpIYSbtZ3n5EnejJLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGiGO3OeWOnahzoVDU_6QFahc_WNn6AAIMFAACqpIYSXc3BcMrktInLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGiWO3OeUhauGDY3X0GZkP9iJxwGVvAAINFAACqpIYSbO-o2HyQitJLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGimO3OeWeQqQUbe506BehjW2nlydUAAIOFAACqpIYST2cV9kCons3LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGi2O3OeVa5zlYF-KfWXMEeQ0uIc2qAAIPFAACqpIYSb9w5vK6EZLHLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGjGO3OeXwXz8fw9WYWJMj6tlab8tpAAIQFAACqpIYSb75Wm1KWVWpLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGjWO3OeW2fnAz3WQWvWcvHfsukeVNAAIRFAACqpIYSUCc9zRAGxMdLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGjmO3OeW-AQy1IXdzAAHMui9qulAueQACEhQAAqqSGEnQCnpfFvUtaC0E"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGj2O3OeVWycVyYCU3yrsjJst0l8vJAAITFAACqpIYSWETI9osbftTLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGkGO3OeX-AwYflzi6iyOjECLz863qAAIUFAACqpIYSS3I__MYVobrLQQ"));
    }

    public void surah_9(Message message) {
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGXWO3OAn0w2vl9NnGOmJIdE7jKJRQAAMUAAKqkhhJ1FNI22HvDbEtBA"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGXmO3OAnH3iTINLDttkYJByac_F3YAAIBFAACqpIYSRUY9MwAAbeJwy0E"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGX2O3OAmAyHXwcLuJs_jnAAGPKQMbcgACAhQAAqqSGElW_SzUysAVmC0E"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGYGO3OAlnuS2gwzUqA53Brbfol4T9AAIDFAACqpIYSfdBX1gjtF2GLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGYWO3OAlvO6fYXbKJac_LokwBnv3EAAIEFAACqpIYSY5T_21NwXj6LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGcmO3OJ3F6eHGucBo5bxMsURhXlIAAwUUAAKqkhhJbKiLLmo1TAUtBA"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGc2O3OJ0RD_m_PqjYSMvvzuoD9ecCAAIGFAACqpIYSWfYHoZtaRPALQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGdGO3OJ0GUghgu9OG-gkJGjcAARh8uQACCBQAAqqSGEkwcC2DZKHaTC0E"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGdWO3OJ07YgN56tknW54CnSfuPWyRAAIJFAACqpIYSR3UJUUkCdqxLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGdmO3OJ1P_fj18yZCxTP9GTKywTDQAAIKFAACqpIYSb-lTRcIGhOwLQQ"));
    }

    public void surah_8(Message message) {
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGLmO3Nagg2qPc_7p98js1HCp98TQeAAL2EwACqpIYSZIU8uYivCQPLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGL2O3NagUE2n2EcOwXAe944a4Lyh-AAL3EwACqpIYScy7xoDSlaPhLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGMGO3NaipPNgpW2W14wGxmes0D6XFAAL4EwACqpIYSVorBqTE5kpHLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGMWO3NajqHoKRT9Az7cOCCph0v_LnAAL5EwACqpIYSYo5xMjYY5deLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGMmO3NahBoeK4sVAcQ5ce4n-UlNVhAAL6EwACqpIYSYNP1kmswe6hLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGQ2O3N7QuZUKiSXF-DLQuz2dYtRHOAAL7EwACqpIYSVL8bNBa-KEPLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGRGO3N7RSz-rcxwOLRspSpgpVwMEoAAL8EwACqpIYSZxM6o2ZdgydLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGRWO3N7QfGlmcq7QTVqHFTIDz351aAAL9EwACqpIYSROx8UI1sLh9LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGRmO3N7QiJcutHELKmqqhzosQzAWmAAL-EwACqpIYSenZLy6DtTl6LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGR2O3N7QSEZLsrY1Ght_Ak5vzRqSdAAL_EwACqpIYSbNUImUddwFkLQQ"));
    }

    public void surah_7(Message message) {
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIF_WO3NJm5iMFtq-dspT5OZY4WnZl_AAIEFwACqpIQST8rKRNDk6i3LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIF_mO3NJk1Th45SmPGFtpyRp2sydZ4AAIFFwACqpIQSRVVfZJithskLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIF_2O3NJnE4dVW8-knR85YSAl3sbkMAALuEwACqpIYSV8p553TusywLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGAAFjtzSZhHdDj-X5wMm7JvmJbAnd8AAC7xMAAqqSGElEooTyNNtSIy0E"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGAWO3NJmUxc7ghJdJIuKjOy4xqTGLAALwEwACqpIYSd8UwLOz12viLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGFGO3NNhO-2N-1S8WyjiTZqdLrfUYAALxEwACqpIYSdNq__tb800GLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGFWO3NNhi0fhIscbPZiyQI0W1MM6kAALyEwACqpIYSYTel_fkEjzJLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGFmO3NNjPqJQkG47jrArlY4E9TtvIAALzEwACqpIYSSC9QMTlbcvKLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGF2O3NNgcMZSLw8o1_YDNllAEn4-VAAL0EwACqpIYSXaRcnnh_7ExLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIGGGO3NNinn6kDhYqLhrh4PcjmjVpqAAL1EwACqpIYSbbaElmKMqoCLQQ"));
    }

    public void surah_6(Message message) {
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFOmO3LSaNu2yX9pNCsBrxhKdzxepFAALlFgACqpIQSSjanh-b2paVLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFO2O3LSZ8vNQ323hQAbGDGCyh2q4NAALrFgACqpIQSR8mtA0rgy1nLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFPGO3LSYEuJcMIR6eIg5e0UL9EmRqAALuFgACqpIQSVhtS03rkecXLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFPWO3LSadj_AdZcweqE2XoGw6o0TpAALxFgACqpIQSXw4WdCnfbsrLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFPmO3LSaYuFOUXveoVts6nocOx2wyAAL3FgACqpIQSSDy-qYAATHKny0E"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFTmO3LXhD9E1wU9SLyUwiXbA_KMqlAAL7FgACqpIQSSv__gXFoeBFLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFT2O3LXhbRfYkJsqMB18gm6YU6rUDAAL-FgACqpIQSV8TibQPKsA-LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFUGO3LXhtj7Z5Bwzf8L4ssMKMgLCZAAL_FgACqpIQSRSLtYhf_cG2LQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFUWO3LXgDom8ZvfNIZkHeOFy9RQLXAAIBFwACqpIQSdFwWxo_GxpQLQQ"));
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIFUmO3LXhqycwBpN1MBl0rBJqqrcNDAAIDFwACqpIQSb3ywCPOf1nFLQQ"));
    }

    public void surah_5(Message message) {


        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEnmO3GUMPUR6EOpfrywJ8Di0xNWKMAAJABAAC7ifZSX7vLF7OoNFeLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEn2O3GUPa7pAynqoi2EN3ZfdzuSVeAAJVAwAC9DHwSZaqmy-xWB9KLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEoGO3GUOR3EJh_8g98RlNzd_3fOZ2AAJVAwAC7ifpSfpQcDoeBKjpLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEoWO3GUOemdMmRRwhzNU0GhpNb493AALOFgACqpIQSUEN7Ooh17lWLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEomO3GUP2BDcTFa4IPSNX0HZS-MQxAALUFgACqpIQSeGiNDrFvYhMLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEo2O3GUP876BodYG7WjajBJOIxFkVAALhAgACMUoBSuAOJZZERiIvLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEpGO3GUNPQ9TvmWrIZK5Iho6VDxgcAALYFgACqpIQScwKVaWY-6ysLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEpWO3GUOWFsct9m6ZNHblJX2E6c1oAALdFgACqpIQSZK9nMZl1O7fLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEpmO3GUPZTgVdQEer7wb8KDEHgGwiAALfFgACqpIQSQiUrwVRkln7LQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEp2O3GUOXQwxlcmYR5PnzINBUU1u0AALiFgACqpIQSRfh-WHpRyd_LQQ"));
    }

    public void surah_4(Message message) {


        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEbmO3F-jE-DPhTJR94zH1CcGr6j9cAAKAAgACWghhSSIDJT_XEbQjLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEb2O3F-h6wpQTr_kB1FYd8SFTFMnAAAJdAwAC4wJoSUxyz0ywfXAuLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEcGO3F-iUM4E76Y8WPe4FnQybuSzsAALLFgACqpIQScTYFNEN7YRZLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEcWO3F-il8mTKQhyIxAb1fFhmcnRwAAKDAgACwFSRSbQHnbsqp9QMLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEcmO3F-ieQFai3-yKmFt02_LgNllAAALVAwAC94ahSd_am4Do3AuWLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEc2O3F-gR8vLDqTWxbX4ydUzrLOPuAAIEBAAC94apSf9gP4-__IeeLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEhmO3GM65bm5rf3hLI-MdVRwg2XYHAAJ_BQACpviwSW-xddC3uaHzLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEh2O3GM7Lc6f0ok7l1Mcw4lNgj8f-AAJ4AgAC6ZK4SYyy1uQOkod5LQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEiGO3GM6_6Tj-LoaDf6hmmP_LgANlAALiAgAC0NjASbLg1me6ibwuLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEiWO3GM67GgUZBJwp-GbhYEg8-ZLMAAKgAwACIcLQSXIdES_LTL-gLQQ"));
    }

    public void surah_3(Message message) {


        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIECmO2s6zCxl_GZ1aTLj6RHN5Iwt8DAAJhFQACqpIQSfBNDz4eX_q6LQQ"));


        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEC2O2s6yO17vnNGO_4Er65TrEeakmAAKJFQACqpIQSWHxsj5qLSTaLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEDGO2s6wwHPpZS97YWbzky6XccifNAAJ1AwACdZ_wS-eMyP--hqjgLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEDWO2s6wPqTvYf8yNO59--LPvjBHYAALvAgACyiEAAUgXO0FPDfTeLC0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEDmO2s6wlqYGso6yQ7ldEMt9pcaXdAAL0AgACyiEAAUhlPFGjnM7pGC0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEJmO2tE1z-WKj2xVfuX67hirLlPa5AAKKFQACqpIQSarzIUFWdR-2LQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEJ2O2tE3pLiBQbErd7X8R0_4b0zsDAAKLFQACqpIQSZinyFaSuxOpLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEKGO2tE2lnVeBLFMq2x5H976Z5kbhAAKNFQACqpIQSWl9ug42TtUlLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEKWO2tE0PLVhRrWQQAAGh1ynxVabpGAACdgMAAqeyUUg-ep63OVFzNC0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEKmO2tE0vcwVZum5KNRuda5md8yMIAAKRFQACqpIQSW8qa-RoWgmGLQQ"));


    }

    public void surah_2(Message message) {


        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIECmO2s6zCxl_GZ1aTLj6RHN5Iwt8DAAJhFQACqpIQSfBNDz4eX_q6LQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEC2O2s6yO17vnNGO_4Er65TrEeakmAAKJFQACqpIQSWHxsj5qLSTaLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEDGO2s6wwHPpZS97YWbzky6XccifNAAJ1AwACdZ_wS-eMyP--hqjgLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEDWO2s6wPqTvYf8yNO59--LPvjBHYAALvAgACyiEAAUgXO0FPDfTeLC0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEDmO2s6wlqYGso6yQ7ldEMt9pcaXdAAL0AgACyiEAAUhlPFGjnM7pGC0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEJmO2tE1z-WKj2xVfuX67hirLlPa5AAKKFQACqpIQSarzIUFWdR-2LQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEJ2O2tE3pLiBQbErd7X8R0_4b0zsDAAKLFQACqpIQSZinyFaSuxOpLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEKGO2tE2lnVeBLFMq2x5H976Z5kbhAAKNFQACqpIQSWl9ug42TtUlLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEKWO2tE0PLVhRrWQQAAGh1ynxVabpGAACdgMAAqeyUUg-ep63OVFzNC0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIEKmO2tE0vcwVZum5KNRuda5md8yMIAAKRFQACqpIQSW8qa-RoWgmGLQQ"));


    }

    public void surah_1(Message message) {
        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDemO2rjp6ymGg-f3iuHrpjb8NTrX8AAJFEwACcFgAAUmoayX8bqS14S0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDe2O2rjqhGUwDJXTtrPborbWH6azwAAJOEwACcFgAAUn4piqW_Gzv8i0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDfGO2rjraengvi4vm9ScxI9fqMa5dAAKJEwACcFgAAUlHP2GTIZewQi0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDfWO2rjqKLsELgZ2MWc7ZD_vzs4NnAAKlEwACcFgAAUkjNtrW5tnHeS0E"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDfmO2rjry99WxQ8eGKne7k66v3PjpAALbFAACcFgISdhJHnjYs0VGLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDf2O2rjpvd0wQtFxS3m60GLQFasccAALgFAACcFgISUiq6jtW1DAtLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDgGO2rjpeIllfaqYul1-x_ZXOqSYgAALjFAACcFgISf7wYBwz9Ra7LQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDgWO2rjrp3CrTuyKczC5a6EXtukasAAJeFQACqpIQSXn_ET78pK8tLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDgmO2rjq-Zwk79oEF5s4O7fCNYIEDAAJfFQACqpIQSSlWGdZiI0dqLQQ"));

        myTelegramBot.sendMsg(createSendAudio(message.getChatId(), "CQACAgIAAxkBAAIDg2O2rjp-S5sxRdoCQn7yLpX1wfsTAAJgFQACqpIQSfoG3zT5-xgxLQQ"));
    }




}
