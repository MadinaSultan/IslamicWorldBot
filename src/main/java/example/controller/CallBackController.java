package example.controller;

import org.example.MyTelegramBot;
import org.example.util.MessageUtil;
import org.example.util.ReplyKeyBoardQuran;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class CallBackController {

    private MyTelegramBot myTelegramBot;
    private LanController lanController;
    private QuranController quranController;
    private NamazControllerMen namazControllerMen;
    private ReplyKeyBoardQuran replyKeyBoardQuran;

    public CallBackController(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
        lanController = new LanController();
        quranController = new QuranController(myTelegramBot);
        namazControllerMen = new NamazControllerMen(myTelegramBot);
        replyKeyBoardQuran = new ReplyKeyBoardQuran();
    }


    public void handle(String text, Message message) {

        if (text.startsWith("lang")) {
            SendMessage sendMessage = lanController.handle(text, message);
            myTelegramBot.sendMsg(sendMessage);
        } else {
            myTelegramBot.sendMsg(MessageUtil.notFound(message.getChatId()));
        }
    }
}
