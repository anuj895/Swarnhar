package com.example.swarnhar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    public TextView log_in,logistic,textView5;
    EditText  mail,password;
    CheckBox checkBox;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);


        log_in=(TextView)findViewById (R.id.log_in);
        logistic=(TextView)findViewById (R.id.logistic);
        textView5=(TextView)findViewById (R.id.textView5);
        mail=(EditText)findViewById (R.id.mail);
        password=(EditText)findViewById (R.id.password);
        checkBox=(CheckBox)findViewById (R.id.checkBox);
        login_btn=(Button)findViewById (R.id.login_btn);



    login_btn.setOnClickListener (new View.OnClickListener () {
        @Override
        public void onClick(View v) {
            startActivity(new Intent (LoginActivity.this, BottomActivity.class));
        }
    });
    }
}
