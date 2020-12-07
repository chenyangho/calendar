package se1a_2200432.intent06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class youtube extends AppCompatActivity {

    private WebView mWebView;
    private static String webURL[] = {"https://www.youtube.com/watch?v=XZizquG4YFg&ab_channel=%E5%AF%B6%E5%8F%AF%E5%A4%A2%E5%8F%B0%E7%81%A3",
            "https://www.youtube.com/watch?v=BlEbI9fQFjY&ab_channel=%E5%AF%B6%E5%8F%AF%E5%A4%A2%E5%8F%B0%E7%81%A3",
            "https://www.youtube.com/watch?v=4fibJ9SXkk0&ab_channel=SHINN",
            "https://www.youtube.com/watch?v=PjOCf8w7Qg8&ab_channel=SHINN",
            "https://www.youtube.com/watch?v=DMn84sL2rRo&ab_channel=%E7%9F%AD%E8%A4%B2%E5%B0%8F%E5%AD%90",
            "https://www.youtube.com/watch?v=nGNFYkDHvWY&ab_channel=%E7%9F%AD%E8%A4%B2%E5%B0%8F%E5%AD%90",
            "https://www.youtube.com/watch?v=hzlsGwxsVbE&ab_channel=%E7%9F%AD%E8%A4%B2%E5%B0%8F%E5%AD%90",
            "https://www.youtube.com/watch?v=KrSFJ_o5viA&ab_channel=%E7%9F%AD%E8%A4%B2%E5%B0%8F%E5%AD%90",
            "https://www.youtube.com/watch?v=LMSe8bFposY&ab_channel=%E7%9F%AD%E8%A4%B2%E5%B0%8F%E5%AD%90",
            "https://www.youtube.com/watch?v=VMSd4HT5DcQ&ab_channel=%E7%9F%AD%E8%A4%B2%E5%B0%8F%E5%AD%90",
            "https://www.youtube.com/watch?v=OhhYKnyInm8&ab_channel=%E7%9F%AD%E8%A4%B2%E5%B0%8F%E5%AD%90",
            "https://www.youtube.com/watch?v=PjhX6am7ua4&ab_channel=%E7%9F%AD%E8%A4%B2%E5%B0%8F%E5%AD%90"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        Intent intent = getIntent();
        int month = 0;
        if (intent != null) {
            if (intent.hasExtra("month")) {
                month = intent.getIntExtra("month", 0); //ｲﾝﾃﾝﾄからﾃﾞｰﾀを取得する(0 はﾃﾞﾌｫﾙﾄ値)
            }
        }

        mWebView = (WebView) findViewById(R.id.webView);
        //Activity起動時に初期URL（Google日本語サイト）を読み込む
        mWebView.loadUrl(webURL[month]);
        // WebSettings オブジェクトを取得
        WebSettings settings = mWebView.getSettings();
        // JavaScript を有効にする
        settings.setJavaScriptEnabled(true);
        // （別の画面を起動せずに）WebView03 の画面内に WEb サイトが表示されるようにする
        mWebView.setWebViewClient(new WebViewClient());
    }
}