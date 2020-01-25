package sundarchaupal.bonjaa.nescant.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OTPActivity extends AppCompatActivity {

    EditText otp;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        getSupportActionBar().setTitle("");
        otp =(EditText) findViewById(R.id.otp);
        login =(Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OTPActivity.this, DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}
