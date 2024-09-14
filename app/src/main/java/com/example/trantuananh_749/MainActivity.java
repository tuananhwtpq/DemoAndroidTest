package com.example.trantuananh_749;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // khai bao các thanh phần wiget
        final TextView txtShow=findViewById(R.id.txtShow);
        final EditText edtName=findViewById(R.id.edtName);
        Button btnShow=findViewById(R.id.btnShow);
        // viet su kien onClick
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lay du lieu tu edtName
                String name=edtName.getText().toString();
                // hien thi vao o txtShow
                txtShow.setText("Hello "+name);

            }
        });
    }


}