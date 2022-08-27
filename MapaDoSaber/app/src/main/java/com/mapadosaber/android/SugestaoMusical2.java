package com.mapadosaber.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SugestaoMusical2 extends AppCompatActivity {

    String url;
    WebView wv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugestao_musical2);

        url = " https://www.youtube.com/watch?v=H7QAJxORsl4";

        wv6 = (WebView) findViewById(R.id.wvSugestaoMusical2);
        wv6.loadUrl(url);
        wv6.getSettings().setJavaScriptEnabled(true);
        wv6.setWebViewClient(new WebViewClient(){
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