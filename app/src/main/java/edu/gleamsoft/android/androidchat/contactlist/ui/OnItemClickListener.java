package edu.gleamsoft.android.androidchat.contactlist.ui;

import edu.gleamsoft.android.androidchat.contactlist.entities.User;

/**
 * Created by ykro.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
