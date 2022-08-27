package com.mapadosaber.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MexendoPartesCorpo extends AppCompatActivity {

    String url;
    WebView wv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexendo_partes_corpo);

        url = "https://www.youtube.com/watch?v=5OA45DdhsI4";
        wv4 = (WebView) findViewById(R.id.wvMexendoPartesCorpo);
        wv4.loadUrl(url);
        wv4.getSettings().setJavaScriptEnabled(true);
        wv4.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon){
                super.onPageStarted(view, url, favicon);
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });

    }
}