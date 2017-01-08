package net.ukyo.codepathlabchallenge1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
    private EditText editEmail;
    private EditText editPassword;
    private TextView textForgetPassword;
    private Button btnSignIn;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViews();
        setListener();
    }

    private void findViews() {
        setContentView(R.layout.activity_login);
        editEmail = (EditText) findViewById(R.id.edit_email);
        editPassword = (EditText) findViewById(R.id.edit_password);
        textForgetPassword = (TextView) findViewById(R.id.text_forget_password);
        btnSignIn = (Button) findViewById(R.id.btn_sign_in);
        btnRegister = (Button) findViewById(R.id.btn_register);
    }

    private void setListener() {
        editEmail.setOnClickListener(clickListener);
        editPassword.setOnClickListener(clickListener);
        textForgetPassword.setOnClickListener(clickListener);
        btnSignIn.setOnClickListener(clickListener);
        btnRegister.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_sign_in:
                    Toast.makeText(LoginActivity.this, "Sign in", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.btn_register:
                    Toast.makeText(LoginActivity.this, "Register", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.text_forget_password:
                    Toast.makeText(LoginActivity.this, "Forget Password", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
