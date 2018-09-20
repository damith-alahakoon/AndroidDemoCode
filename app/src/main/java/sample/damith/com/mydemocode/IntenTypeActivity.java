package sample.damith.com.mydemocode;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class IntenTypeActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inten_type);

        webView = findViewById(R.id.web_view1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://futurestud.io/tutorials/how-to-debug-your-android-app-over-wifi-without-root");
    }
    public void SearchGoogle(View view){
        Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.lk"));
        startActivity(i);

    }
}
