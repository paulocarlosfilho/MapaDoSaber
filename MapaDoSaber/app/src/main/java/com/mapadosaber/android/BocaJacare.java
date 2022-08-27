package com.mapadosaber.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.ClientCertRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BocaJacare extends AppCompatActivity {

    WebView wv1;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boca_jacare);

        url = "https://www.youtube.com/watch?v=G2oBnsAZW3g";
        wv1=(WebView) findViewById(R.id.wvBocaJacare);
        wv1.loadUrl(url);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setWebViewClient(new WebViewClient(){
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