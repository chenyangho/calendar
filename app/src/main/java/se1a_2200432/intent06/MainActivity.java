package se1a_2200432.intent06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        final Spinner spinner = findViewById(R.id.spinner);


        btn1.setOnClickListener(new View.OnClickListener() {

            Button btn1 = findViewById(R.id.button1);
            @Override
            public void onClick(View v) { // ここにクリック時の処理を書く

                // 選択されているアイテムの Index を spinner オブジェクトから取得する（Index は、０から）
                int idx = spinner.getSelectedItemPosition();

                // MyCalendar クラスを呼び出す Intent を生成
                Intent intent = new Intent(getApplicationContext(), MyCalendar.class);

                // intent オブジェクトに、パラメータ month＝ｲﾝﾃﾞｯｸｽ値という KeyValue 情報を持たせる
                intent.putExtra("month", idx);

                // Intent 呼び出しを実行する
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            Button btn2 = findViewById(R.id.button2);
            @Override
            public void onClick(View v) { // ここにクリック時の処理を書く

                // 選択されているアイテムの Index を spinner オブジェクトから取得する（Index は、０から）
                int idx = spinner.getSelectedItemPosition();

                // MyCalendar クラスを呼び出す Intent を生成
                Intent intent = new Intent(getApplicationContext(), youtube.class);

                // intent オブジェクトに、パラメータ month＝ｲﾝﾃﾞｯｸｽ値という KeyValue 情報を持たせる
                intent.putExtra("month", idx);

                // Intent 呼び出しを実行する
                startActivity(intent);

            }
        });
        
    }
}