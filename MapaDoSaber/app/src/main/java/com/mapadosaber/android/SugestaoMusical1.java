package com.mapadosaber.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SugestaoMusical1 extends AppCompatActivity {

    String url;
    WebView wv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugestao_musical1);

        url = "https://www.youtube.com/watch?v=r-rzMdyB4dg";
        wv5 = (WebView) findViewById(R.id.wvSugestaoMusical1);
        wv5.loadUrl(url);
        wv5.getSettings().setJavaScriptEnabled(true);
        wv5.setWebViewClient(new WebViewClient(){
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