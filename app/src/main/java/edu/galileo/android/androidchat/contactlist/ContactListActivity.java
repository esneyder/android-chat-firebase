package edu.galileo.android.androidchat.contactlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import edu.galileo.android.androidchat.R;
import edu.galileo.android.androidchat.entities.User;
import edu.galileo.android.androidchat.login.LoginActivity;

public class ContactListActivity extends AppCompatActivity
                                 implements ContactListView {

    @Bind(R.id.recyclerViewContacts) RecyclerView recyclerView;
    @Bind(R.id.fab) FloatingActionButton fab;
    @Bind(R.id.toolbar) Toolbar toolbar;

    private ContactListPresenter contactListPresenter;
    private ContactListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        ButterKnife.bind(this);

        contactListPresenter = new ContactListPresenterImpl(this);

        setSupportActionBar(toolbar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        adapter = new ContactListAdapter(this, new ArrayList<User>());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_contactlist, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_logout) {
            contactListPresenter.signOff();
            startActivity(new Intent(this, LoginActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onContactAdded(User user) {
        //agregar el usuario a la lista
        if (recyclerView != null) {
            recyclerView.scrollToPosition(adapter.getItemCount() - 1);
        }
    }

    @Override
    public void onContactChanged() {
        //check for online -> offline | offline -> online status
    }

    @Override
    public void onContactRemoved() {
        //remove from the list
    }

    @Override
    public void onSubscriptionError() {
        //???
    }
}