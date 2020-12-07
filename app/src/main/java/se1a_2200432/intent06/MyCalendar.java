package se1a_2200432.intent06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CalendarView;
import android.widget.ImageView;

import java.util.Calendar;

public class MyCalendar extends AppCompatActivity {

    private static int pictID[] = {R.drawable.m01,R.drawable.m02,R.drawable.m03,R.drawable.m04,R.drawable.m05,
            R.drawable.m06,R.drawable.m07,R.drawable.m08,R.drawable.m09,R.drawable.m10,R.drawable.m11,R.drawable.m12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calendar);
        final ImageView img = findViewById(R.id.imageView);

        // Intent オブジェクトを取得する
        Intent intent = getIntent();
        int month = 0;
        if (intent != null) {
            if (intent.hasExtra("month")) {
                month = intent.getIntExtra("month", 0); //ｲﾝﾃﾝﾄからﾃﾞｰﾀを取得する(0 はﾃﾞﾌｫﾙﾄ値)
            }
        }

        img.setImageResource(pictID[(month)]);
        CalendarView cal = findViewById(R.id.calendarView);//CalendarView の ID を得る
        //現在の日付を取得する
        Calendar selectedCalendar = Calendar.getInstance();
        selectedCalendar.set(Calendar.MONTH, month); // 月を指定 ※１月は０から始まる
        long selectedTimeInMills = selectedCalendar.getTimeInMillis();
        // CalendarView に選択した日付（月）を指定します
        cal.setDate(selectedTimeInMills);

    }

}