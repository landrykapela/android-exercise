package com.example.exercisetwo.ui;

import static android.widget.Toast.*;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exercisetwo.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.button4);
        EditText etName = findViewById(R.id.editTextText3);
        TextView tvStatus = findViewById(R.id.tvStatus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                tvStatus.setText(name);
            }
        });
    }

}
