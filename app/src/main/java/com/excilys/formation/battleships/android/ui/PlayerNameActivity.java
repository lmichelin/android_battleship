package com.excilys.formation.battleships.android.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.excilys.formation.battleships.ship.BattleShip;

import battleships.formation.excilys.com.battleships.R;

public class PlayerNameActivity extends AppCompatActivity {

    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);
        editTextName = (EditText) findViewById(R.id.et_name);

    }

    public void onClick (View view) {
        String name = editTextName.getText().toString();
        if (!name.isEmpty()) {
            BattleShipsApplication.getGame().init(name);
            finish();
        }
    }
}
