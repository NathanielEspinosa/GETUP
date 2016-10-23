package collegefool.getup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;


public class HomeActivity extends AppCompatActivity implements OnClickListener {

    TextView clocktext;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);
        clocktext = (TextView) findViewById(R.id.hr);

      /*  DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss"); */
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date dateobj = new Date();

        clocktext.setText( df.format(dateobj) );
    }
    @Override
    public void onClick(View v){
        Intent i = new Intent(getApplicationContext(),SetActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_set);
    }

}
