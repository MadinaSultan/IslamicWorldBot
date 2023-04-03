package org.example.controller;

import org.example.MyTelegramBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;



public class TarowehController {
    private MyTelegramBot myTelegramBot;

    public TarowehController(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
    }
    public  void handle(Message message){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("[\uD83C\uDFAC](https://youtu.be/wYmzx8-IVl4)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);
        sendMessage.setText("«Shayx Muhammad Sodiq Muhammad Yusuf» jome' masjidida tarov hidi namozining birinchi kuni.\n" +
                "\n" +
                "Fotiha surasining 1-oyatidan Baxa surasining 141-oyatigacha.\n" +
                "\n" +
                "Xatmi Qur'onga masjid imom nobi Hasanxon Yahyo Abdulmajid va Muhammad Said Usmon qorilar o'tib berishadi");
        myTelegramBot.sendMsg(sendMessage);

        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("[\uD83C\uDFAC](https://youtu.be/jfpjpGROCZ8)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);

        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("[\uD83C\uDFAC](https://youtu.be/fQmsccU9KQc)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);


        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("[\uD83C\uDFAC](https://www.youtube.com/watch?v=M80EektXtuo)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);

        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("[\uD83C\uDFAC](https://youtu.be/5KFSffX5li0)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);

        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("[\uD83C\uDFAC](https://youtu.be/MCYs8s4vlzo)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);
    }
}
