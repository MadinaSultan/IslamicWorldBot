package example.controller;

import org.example.MyTelegramBot;
import org.example.util.InlineKeyBoardUtil;
import org.example.util.MessageUtil;
import org.example.util.ReplyKeyBoardNamaz;
import org.example.util.ReplyKeyBoardQuran;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import static org.example.TokenService.createSendDocument;


public class MainController {

    private static MyTelegramBot myTelegramBot;
    private QuranController quranController;
    private FileLogController controller;
    private RamazanController ramazanController;
    private NamazControllerMen namazControllerMen;
    private TarowehController tarowehController;


    public MainController(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
        quranController = new QuranController(myTelegramBot);
        ramazanController = new RamazanController(myTelegramBot);
        namazControllerMen = new NamazControllerMen(myTelegramBot); // Todo
        tarowehController = new TarowehController(myTelegramBot);
    }

    public void mainHandle(String text, Message message) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());


        if (text.equals("/start")) {
            sendMessage.setText("Choose language\uD83D\uDCF2");
            sendMessage.setReplyMarkup(InlineKeyBoardUtil.getLangButtons());
            myTelegramBot.sendMsg(sendMessage);

        } else if (text.equals("Qur'ān\uD83C\uDFA7")) {
            sendMessage.setText("\uD83D\uDD0A Listen Qur'ān audio");
            sendMessage.setReplyMarkup(ReplyKeyBoardQuran.menuKeyboardQuran());
            myTelegramBot.sendMsg(sendMessage);

        } else if (QuranController.keyMap.containsKey(text)) {
            quranController.handleQuranMp3(text, message);

        } else if (text.equals("Taraweeh Namaz 1443")) {
            tarowehController.handle(message);

        } else if (text.equals("And By the Ten Nights")) {
            sendMessage.setChatId(message.getChatId());
            sendMessage.setText("[\uD83D\uDCF2](https://t.me/joinchat/AAAAAEUkQlyhuHM27IonOg)");
            sendMessage.setParseMode("Markdown");
            myTelegramBot.sendMsg(sendMessage);

        } else if (text.equals("Evolution of the Early Qur'ān")) {
            sendMessage.setChatId(message.getChatId());
            sendMessage.setText("[\uD83D\uDD4C](https://islamonline.net/en/evolution-in-the-light-of-islam/)");
            sendMessage.setParseMode("Markdown");
            myTelegramBot.sendMsg(sendMessage);



        } else if (text.equals("Salah Time⏳")) {
            sendMessage.setChatId(message.getChatId());
            sendMessage.setText("[Naamaz Time](https://www.islamicfinder.org/prayer-times/)");
            sendMessage.setParseMode("Markdown");
            myTelegramBot.sendMsg(sendMessage);

        } else if (text.equals("Namaaz \uD83D\uDC73\uD83C\uDFFB\u200D♂️")) {
            sendMessage.setText("Basic rules of Namaaz ");
            sendMessage.setReplyMarkup(ReplyKeyBoardNamaz.menuNamazForMan());
            myTelegramBot.sendMsg(sendMessage);

        } else if (NamazControllerMen.keyMapNamaz.containsKey(text)) {
            namazControllerMen.handleNamaz(text, message);

        } else if (text.equals("Iqro")) {
            sendMessage.setText("\uD83D\uDCDC ");
            myTelegramBot.sendMsg(sendMessage);
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BAACAgIAAxkBAAINq2O8dOBDqZqGgvbwTI69j-uFDIhTAAKyAgACnNLZSpIY3Sy9KJY-LQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BAACAgIAAxkBAAINrGO8dODByXiyjSVDcFMuxIFw33tpAAI6AwACWaYgS9zxFKTV4CklLQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BQACAgIAAxkBAAINz2O8dyM-nW8KWjHdaWmBym7lC040AALyAgACySuYSJKyI6XHlpIkLQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BAACAgIAAxkBAAINrWO8dODmom0-y54U-1yiAUqEdQnJAALYAgACGjFoS_rywL65qdCVLQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BQACAgIAAxkBAAIN0WO8dy4-v0-AQvojdH6-UusHIeGwAAJXAwACrYOQSMpoTCF50BpXLQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BAACAgIAAxkBAAINrmO8dOAmtmBsuvNbO1exLBSNGXT_AAKPAgACN7CRS832AVszdpUDLQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BQACAgIAAxkBAAIN02O8dzeCPDFlGsrLJuoxO9EmDeBYAAJHAwAC3nuQS2qrxs2-uNOdLQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BAACAgIAAxkBAAINs2O8db5VtwABqPDO3GGyv6H6CgABqXcAAjYEAAKZMyhIGE7ohIdih-otBA"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BQACAgIAAxkBAAIN1WO8d0S7_XZnm2ic53w2Vk50t21rAALzAgACBE24SxO3eVfBKkCYLQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BAACAgIAAxkBAAINtGO8db7DQUdc34g1dQbg6pl7DYG7AAJtBAAC_wABSEjtTYawQ-lxuy0E"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BQACAgIAAxkBAAIN12O8d0yFplC7rCuUiKlRDJDr3J49AALCBAACIuMISEoCQ3U9PSBaLQQ"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BAACAgIAAxkBAAINtWO8db5W-78sC9Rapia2sktijwdJAAJtBAAC_wABSEjtTYawQ-lxuy0E"));
            myTelegramBot.sendMsg(createSendDocument(message.getChatId(), "BQACAgIAAxkBAAIN2WO8d1ok5JmjmWYStLRFYy0agYjxAALsAgACBaFISJ2AMdaNSLLCLQQ"));



    } else if (text.equals("Ramadan -1443")) {
            sendMessage.setText("Choose one of them");
            ramazanController.ramazonVideo(message);

        } else if (text.equals("Namaaz \uD83E\uDDD5\uD83C\uDFFB")) {
            sendMessage.setText("Ayollar uchun");
            ramazanController.videoNamazFemale(message);

        } else if (text.equals("Rules of Qur'an")) {
            sendMessage.setText("All links");
            ramazanController.quranRules(message);
        } else {
            myTelegramBot.sendMsg(MessageUtil.notFound(message.getChatId()));


        }
    }



}



