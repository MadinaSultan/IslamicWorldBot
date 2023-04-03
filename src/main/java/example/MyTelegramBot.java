package example;

import org.example.controller.CallBackController;
import org.example.controller.FileLogController;
import org.example.controller.MainController;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyTelegramBot extends TelegramLongPollingBot {

    private MainController mainController;
    private CallBackController callBackController;
    private FileLogController fileLogController;


    public MyTelegramBot() {
        mainController = new MainController(this);
        callBackController = new CallBackController(this);
        fileLogController = new FileLogController(this);

    }

    @Override
    public void onUpdateReceived(Update update) {
        try {


            if (update.hasMessage()) {
                Message message = update.getMessage();

                if(message.hasText()){
                    mainController.mainHandle(message.getText(), message);
                } else if (message.hasAudio()) {
                    fileLogController.handler(message);
                } else if (message.hasVideo()) {
                    fileLogController.handlerVideo(message);
                 } else if (message.hasSticker()) {
                    fileLogController.handlerSticker(message);
                }else if (message.hasDocument()) {
                    fileLogController.handlerDocument(message);
                }else if (message.hasDocument()) {
                    fileLogController.handlerAnimation(message);
                }
            } else if (update.hasCallbackQuery()) {
                CallbackQuery callbackQuery = update.getCallbackQuery();
                String data = callbackQuery.getData();
                callBackController.handle(data,callbackQuery.getMessage());
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }


    public void sendMsg(SendMessage method) {
        try {
            execute(method);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    public void sendMsg(EditMessageText method) {
        try {
            execute(method);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMsg(SendPhoto method) {
        try {
            execute(method);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMsg(SendAudio audio) {
        try {
            execute(audio);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMsg(SendVideo video) {
        try {
            execute(video);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMsg(SendSticker sticker) {
        try {
            execute(sticker);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMsg(SendAnimation animation) {
        try {
            execute(animation);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMsg(SendDocument document) {
        try {
            execute(document);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

   /* private void log(String first_name, String last_name, Long user_id, String txt) {
        try {
            System.out.println("\n --------------------------------------------------------");
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.println(dateFormat.format(LocalDateTime.now()));
            System.out.println("Message from " + first_name + " " + last_name + ". (id = " + user_id + ") \n Text - " + txt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    @Override
    public String getBotUsername() {
        return "@Lib_Islam_bot";
    }

    @Override
    public String getBotToken() {
        return "5848244237:AAHpO_WkK0VCyDQ7Pcd4SDc4gAFoggqMCag";
    }


}
