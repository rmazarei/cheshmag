package ir.webarena.cheshmag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView today_text = (TextView) findViewById(R.id.today_txt);

        Date curDate = new Date(); // today
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy,M,d"); // set date format
        String formattedDateString = dateFormat.format(curDate); // apply date format for today

        String[] dateAspects = formattedDateString.split(","); // split date (2016,1,30) and put it into an array

        int todayYear = Integer.parseInt(dateAspects[0]); //    convert year to int because the CalendarTool accepts int
        int todayMonth = Integer.parseInt(dateAspects[1]); //   convert month to int ......
        int todayDay = Integer.parseInt(dateAspects[2]); //     convert day to int ....

        CalendarTool calendarTool = new CalendarTool(todayYear, todayMonth, todayDay); // using CalendarTool class

        today_text.setText(calendarTool.getIranianDate()); // Put today date to textview (شنبه 10 بهمن 1394)



    }
}
