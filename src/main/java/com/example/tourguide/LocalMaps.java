package com.example.tourguide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;
import com.rengwuxian.materialedittext.MaterialEditText;

import javax.security.auth.Subject;

public class LocalMaps extends AppCompatActivity {
    private Button send;
    private MaterialEditText to, messages;
    private FirebaseAuth firebaseAuth;
    private Subject subject;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_activity);


    }}