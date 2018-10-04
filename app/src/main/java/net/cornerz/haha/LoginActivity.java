package net.cornerz.haha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView closeLogin;
    TextView registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        closeLogin = findViewById(R.id.closeLogin);
        closeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity.super.onBackPressed();
            }
        });

        findViewById(R.id.LoginBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.LoginBtn:
                startActivity(new Intent(this, ProfileActivity.class));
                break;
            case R.id.registerLink:
                startActivity(new Intent(this, SignUpActivity.class));
                break;
        }
    }
}
