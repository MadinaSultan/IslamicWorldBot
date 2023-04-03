package example.controller;

import org.example.MyTelegramBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import static org.example.TokenService.createSendVideo;

public class RamazanController {
    private MyTelegramBot myTelegramBot;
    private FileLogController controller;

    public RamazanController(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
        controller = new FileLogController(myTelegramBot);
    }

    public void ramazonVideo(Message message) {

        myTelegramBot.sendMsg(createSendVideo(message.getChatId(), "BAACAgIAAxkBAAIIEWO4gI4VfI0Uk2G29BnhfMP3lLr8AAIQFQACEw-4SvAXB7wdqr53LQQ"));
        myTelegramBot.sendMsg(createSendVideo(message.getChatId(),"BAACAgIAAxkBAAIJJ2O5bFDQplb9ZR2589p3k6afM1fHAAJdGQACQw8ZS-M6aDS5Gn4PLQQ"));
        myTelegramBot.sendMsg(createSendVideo(message.getChatId(),"BAACAgIAAxkBAAIJKGO5bFBweuyp65O1mQ6o7Pp9XPFzAAJfGQACQw8ZS2K8UX6-oR7xLQQ"));
        myTelegramBot.sendMsg(createSendVideo(message.getChatId(),"BAACAgIAAxkBAAIJKWO5bFCICdPyNAOyteuBvr6WBi63AAICFwACT9mwSqrW6PNf0txSLQQ"));
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText( "[Таровеҳ намозининг тарихини биласизми?](https://youtu.be/-QxkYpmKFJw)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);

    }
    public void quranRules(Message message) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText( "[1- dars](https://www.youtube.com/watch?v=g_UN_46JvB0&list=PLE0uv2eFBCH1oEsMx39tvjYw96hNrsDEE&index=2)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);

        SendMessage sendMessage1 = new SendMessage();
        sendMessage1.setChatId(message.getChatId());
        sendMessage1.setText( "[2- dars](https://www.youtube.com/watch?v=0QhV_vn5xDw&list=PLE0uv2eFBCH1oEsMx39tvjYw96hNrsDEE&index=3)");
        sendMessage1.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage1);

        SendMessage sendMessage2 = new SendMessage();
        sendMessage2.setChatId(message.getChatId());
        sendMessage2.setText("[3- dars]https://www.youtube.com/watch?v=f7QSOU2qMA0&list=PLE0uv2eFBCH1oEsMx39tvjYw96hNrsDEE&index=4)");
        sendMessage2.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage2);
    }
    public void videoNamazFemale(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText( "[Namoz o`qish tartibi](https://youtu.be/x-0HTEDQ7kA)");
        sendMessage.setParseMode("Markdown");
        myTelegramBot.sendMsg(sendMessage);
    }


}