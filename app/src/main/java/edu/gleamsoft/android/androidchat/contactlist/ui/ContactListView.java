package edu.gleamsoft.android.androidchat.contactlist.ui;

import edu.gleamsoft.android.androidchat.contactlist.entities.User;

/**
 * Created by ykro.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
