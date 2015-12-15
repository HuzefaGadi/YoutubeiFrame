package com.example.huzefaasger.youtubeiframe;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
/*

public class MainActivity extends AppCompatActivity {
    WebView displayVideo;
    private static final String URL = "file:///android_asset/index.html";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String frameVideo = "<html><body><iframe id=\'click\' width=100% height=100% src=\"https://www.youtube.com/embed/VBZv3xAhF44?enablejsapi=1&playerapiid=ytplayer&version=3&fs=1&autoplay=1\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

         displayVideo = (WebView)findViewById(R.id.webView);
        displayVideo.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                displayVideo.loadUrl("javascript:(function() { " +
                        "document.getElementById('click').click(); alert('clicked');" +
                        "})()");
            }
        });
        WebSettings webSettings = displayVideo.getSettings();
        webSettings.setJavaScriptEnabled(true);
        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 16) {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        }

            webSettings.setPluginState(WebSettings.PluginState.ON);

        displayVideo.setWebChromeClient(new WebChromeClient());
        displayVideo.loadUrl(URL);

       // displayVideo.loadData(frameVideo, "text/html", "utf-8");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String URL = "file:///android_asset/index.html";
    private WebView mWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {

            }
        });
        refreshWebView();

    }

    private void refreshWebView() {
        mWebView.loadUrl(URL);
    }

    @Override
    public void onClick(View v) {
        refreshWebView();
    }

}
