package com.excilys.formation.battleships.android.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import battleships.formation.excilys.com.battleships.R;

public class PlayerNameActivity extends AppCompatActivity {

    private EditText mNameEditText;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getApplicationContext().getSharedPreferences("Pref", MODE_PRIVATE);
        String name = preferences.getString("player_name", null);
        setContentView(R.layout.activity_player_name);
        mNameEditText = (EditText) findViewById(R.id.edit_player_name);  // bind widgets
        if (name != null) {
            mNameEditText.setText(name);
        }
    }

    public void onClickButton(View v) {
        String name = mNameEditText.getText().toString();
        if (name.isEmpty()) {
            Toast.makeText(PlayerNameActivity.this, "Please enter a name", Toast.LENGTH_LONG).show();
        } else {
            preferences.edit().putString("player_name", name).apply();
            BattleShipsApplication.getmGame().init(name);
        }
    }

}
