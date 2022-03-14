package com.example.web_sign_in;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_v);

        Bundle bundle = getIntent().getExtras();

        final WebView browser = (WebView) findViewById(R.id.wv);
        browser.setWebViewClient(new WebViewClient());





        String name=bundle.getString("name");

        TextView t=findViewById(R.id.title);

        t.setText("Welcome "+name);
        t.setTextSize(30);

        Button a=findViewById(R.id.open);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                browser.loadUrl("https://www.google.co.in");

            }
        });

    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
