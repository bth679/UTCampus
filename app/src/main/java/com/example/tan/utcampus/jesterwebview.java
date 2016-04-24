package com.example.tan.utcampus;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class jesterwebview extends Activity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.jesterwebview);

        webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("http://www.utexas.edu/student/housing/index.php?site=1&scode=4&id=126");

        //String customHtml = "<html><body><h2>Greetings from JavaCodeGeeks</h2></body></html>";
        //webView.loadData(customHtml, "text/html", "UTF-8");

    }

}
