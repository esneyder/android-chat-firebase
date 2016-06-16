package edu.gleamsoft.android.androidchat.chat;

import edu.gleamsoft.android.androidchat.chat.events.ChatEvent;

/**
 * Created by ykro.
 */
public interface ChatPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void setChatRecipient(String recipient);

    void sendMessage(String msg);
    void onEventMainThread(ChatEvent event);


}
