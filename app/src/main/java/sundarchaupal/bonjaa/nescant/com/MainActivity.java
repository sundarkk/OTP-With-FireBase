package sundarchaupal.bonjaa.nescant.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mobile;
    Button cont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mobile =(EditText) findViewById(R.id.mobile);
        cont =(Button) findViewById(R.id.cont);

        getSupportActionBar().setTitle("");
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, OTPActivity.class);
                startActivity(i);
            }
        });

    }
}
