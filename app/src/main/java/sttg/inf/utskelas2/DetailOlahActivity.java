package sttg.inf.utskelas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailOlahActivity extends AppCompatActivity {

    TextView olahragapilih, angka;
    ImageButton plus, minus;
    Button lakukan;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_olah);

        olahragapilih = (TextView) findViewById(R.id.text_olahraga);
        plus = (ImageButton) findViewById(R.id.plus);
        minus = (ImageButton) findViewById(R.id.minus);
        lakukan = (Button) findViewById(R.id.btn_lakukan);
        angka = (TextView) findViewById(R.id.counter_waktu);

        String ol = getIntent().getStringExtra("olahraga");
        olahragapilih.setText(ol);
        counter = 0;

        if(counter==0){
            minus.setEnabled(false);
        }

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = counter+1;
                angka.setText(String.valueOf(counter));
                minus.setEnabled(true);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter==0){
                    minus.setEnabled(false);
                }
                else{
                    minus.setEnabled(true);
                    counter = counter-1;
                    angka.setText(String.valueOf(counter));
                }
            }
        });

        lakukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Anda akan melakukan olahraga "+getIntent().getStringExtra("olahraga")+
                        " dengan waktu "+angka.getText().toString()+" jam."
                        ,Toast.LENGTH_LONG).show();
            }
        });




    }
}
