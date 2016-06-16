package edu.gleamsoft.android.androidchat.addcontact;

import edu.gleamsoft.android.androidchat.addcontact.events.AddContactEvent;

/**
 * Created by ykro.
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}

