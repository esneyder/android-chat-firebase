package edu.galileo.android.androidchat.chat;

/**
 * Created by ykro.
 */
public interface ChatPresenter {
    void onPause();
    void onResume();
    void onDestroy();

    void sendMessage(String msg);
    void setChatRecipient(String recipient);
    void onMessageReceived(ChatMessageEvent event);


}