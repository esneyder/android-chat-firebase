package edu.gleamsoft.android.androidchat.contactlist;

import edu.gleamsoft.android.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by ykro.
 */
public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
