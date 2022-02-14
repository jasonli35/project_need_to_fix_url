package com.example.cse110_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cse110_project.utilities.Constants;

public class AddLinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_link);
        setTitle(Constants.APP_VERSION);
    }

    public void onContinueClicked(View view) {
        Intent intent = new Intent(this, PreviewPhotoActivity.class);
        SharedPreferences preferences = getSharedPreferences(Constants.USER_INFO, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        TextView urlView = findViewById(R.id.editTextTextPersonName);

        editor.putString(Constants.USER_URL_KEY, urlView.getText().toString());
        editor.apply();

        startActivity(intent);
    }

    /**
     * If user does not provide a URL to a head shot, then a default picture will be given
     * */
    public void onSkipClicked(View view) {
        String default_pic = Constants.DEFAULT_PIC_LINK;

        SharedPreferences preferences = getSharedPreferences(Constants.USER_INFO, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        Intent intent = new Intent(this, PreviewPhotoActivity.class);

        editor.putString(Constants.USER_URL_KEY, default_pic);
        editor.apply();

        startActivity(intent);
    }
}




