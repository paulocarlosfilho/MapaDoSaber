package com.mapadosaber.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DancinhaCorpo extends AppCompatActivity {

    WebView wv2;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dancinha_corpo);

        url = "https://www.youtube.com/watch?v=k0j0tk0Br9c";
        wv2=(WebView) findViewById(R.id.wvDancinhaCorpo);
        wv2.loadUrl(url);
        wv2.getSettings().setJavaScriptEnabled(true);
        wv2.setWebViewClient(new WebViewClient(){
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