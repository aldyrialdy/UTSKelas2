package sttg.inf.utskelas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.edit_user);
        password = (EditText) findViewById(R.id.edit_pass);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userAnda = username.getText().toString();
                String passAnda = password.getText().toString();

                if(userAnda.equals("admin")&&passAnda.equals("admin")){
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Username dan Password anda salah",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
