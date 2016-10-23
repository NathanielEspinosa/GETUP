package collegefool.getup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SetActivity extends AppCompatActivity {

    TextView clocktext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        clocktext = (TextView) findViewById(R.id.hr);

      /*  DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss"); */
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date dateobj = new Date();

        clocktext.setText( df.format(dateobj) );
    }

}