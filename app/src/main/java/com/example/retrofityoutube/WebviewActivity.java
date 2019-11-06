package com.example.retrofityoutube;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WebviewActivity extends AppCompatActivity {


    WebView wv;
    String url = "https://www.youtube.com/watch?v=";



    class MyWeb extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            return super.shouldOverrideUrlLoading(view, url);


        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_main);

        Intent intent = getIntent();

        String youtubedataid =intent.getStringExtra("youtubeid");

       // String data = intent.getStringExtra("idurl");
        //webview 권한 허용
        wv.setWebContentsDebuggingEnabled(true);


        wv = (WebView) findViewById(R.id.webview);
        wv.setWebViewClient(new MyWeb());
        wv.setWebChromeClient(new WebChromeClient());
        wv.setNetworkAvailable(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);




        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wv.loadUrl(url + youtubedataid);



    }
}