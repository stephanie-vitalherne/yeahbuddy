package net.cornerz.haha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.SignupBtn).setOnClickListener(this);
        findViewById(R.id.LoginBtn).setOnClickListener(this);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.SignupBtn:
                startActivity(new Intent(this, SignUpActivity.class));
                break;
            case R.id.LoginBtn:
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
}
