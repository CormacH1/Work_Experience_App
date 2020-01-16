package com.example.summerhilltyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Error;
    private Button Login;
    private int loginFail = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.enterUsername);
        Password = (EditText) findViewById(R.id.enterPassword);
        Login = (Button) findViewById(R.id.loginButton);

Login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        validate(Name.getText().toString(), Password.getText().toString());
    }
});

    }

    private void validate(String userName, String userPassword){

        boolean error = true;

        if((userName == "admin") && (userPassword == "admin")) {

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{
            error = false;

            
        }

        TextView errorMessage = (TextView)findViewById(R.id.errorMessage);
        if ( error == false ) {
            errorMessage.setVisibility(View.GONE);
        }






        }

    }


}
