package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This must match your login XML filename

        loginButton = findViewById(R.id.btn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to menu_screen.java
                Intent intent = new Intent(MainActivity.this, menu_screen.class);
                startActivity(intent);
            }
        });
    }
}
