package sttg.inf.utskelas2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button listolahraga, about, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        listolahraga = (Button) findViewById(R.id.list_olahraga);
        about = (Button) findViewById(R.id.about);
        exit = (Button) findViewById(R.id.exit);
    }

    public void listOlahraga(View view) {
        Intent i = new Intent(MainActivity.this, ListActivity.class);
        startActivity(i);
    }

    public void about(View view) {
        Intent i = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(i);
    }

    public void exit(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
