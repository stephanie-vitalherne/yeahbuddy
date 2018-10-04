package net.cornerz.haha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.SignupBtn).setOnLongClickListener(this);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.SignupBtn:
                startActivity(new Intent(this, SignUpActivity.class));
                break;
        }
    }
}
