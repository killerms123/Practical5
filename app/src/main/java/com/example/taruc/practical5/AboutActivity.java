package com.example.taruc.practical5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Linking UI to program
        WebView webViewAbout = (WebView) findViewById(R.id.webViewAbout);
        webViewAbout.loadUrl("http://www.google.com");
    }
}
