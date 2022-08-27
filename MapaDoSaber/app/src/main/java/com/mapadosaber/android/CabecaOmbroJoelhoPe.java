package com.mapadosaber.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CabecaOmbroJoelhoPe extends AppCompatActivity {

    WebView wv3;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabeca_ombro_joelho_pe);

        url="https://www.youtube.com/watch?v=aBgIIhRjdmI";
        wv3=(WebView) findViewById(R.id.wvCabecaOmbroJoelhoPe);
        wv3.loadUrl(url);
        wv3.getSettings().setJavaScriptEnabled(true);
        wv3.setWebViewClient(new WebViewClient(){
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